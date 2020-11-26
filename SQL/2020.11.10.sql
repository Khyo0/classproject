-- 2020.11.10
-- 함수

-- 단일행, 집합함수

-- 단일행 함수 : 숫자, 문자, 날짜, 변환

desc dual;

-- 숫자함수
select ABS(-15.5) from dual;
select floor(15.7) from dual;
select ROUND(15.693) from dual;
select ROUND(15.693,1) from dual;
select LOG(10,100) from dual;
select POWER(2,8) from dual;

-- 문자함수
select concat('나는', '손흥민입니다.') from dual;
select concat('저의 이름은 ',ename)from emp where job='MANAGER';
select LOWER('MR. SCOTT MCMILLAN') "Lowercase" FROM dual;
select lower(ename) from emp;
select LPAD('Page 1',15,'*') FROM dual;
select RPAD('001212-3',14,'*') FROM dual;
select SUBSTR('ABCDEFG',3,4) "Substring" FROM dual;
select SUBSTR('001212-3001247',1,8) FROM dual;
select RPAD(substr('001212-3001247',1,8),14,'*') FROM dual;

select Ltrim(' =from=', ' ') from dual;
select Rtrim(' =from=====', '=') from dual;
select trim(' ' from '   =====from=====   ') as "from" from dual;

select REPLACE('JACK and JUE','J','BL') from dual;
select REPLACE('000000-000000','-','') from dual;

-- 날짜 함수
select sysdate from dual;
select sysdate+14 from dual;
select sysdate+21 from dual;
select sysdate from dual;

select add_months(sysdate, 4) from dual;
select last_day(sysdate) from dual;

-- 변환 함수
-- TO_CHAR : 날짜->문자, 숫자->문자

-- 날짜->문자
select sysdate, to_char(sysdate, 'YYYY-MM-DD day dy AM PM HH HH24 mi ss') from dual;
select to_char(sysdate, 'YYYY.MM.DD. HH24:mi') from dual;

-- 숫자->문자
select to_char(100000.123, 'L000,000.00') from dual;
select to_char(100000, 'L000,000.00') from dual;

select sal, to_char(sal*1100, 'L00,000,000') from emp;
select sal, to_char(sal*1100, 'L99,999,999') from emp;
select sal, to_char(sal*1100, 'L99,999,999') from emp;
select ename, job, sal, to_char(sal*1100*12+nvl(comm,0)*1100, 'L99,999,999') from emp order by sal desc;

-- 문자->날짜
--2020.11.01.
select TO_DATE('2009/09/05', 'YYYY/MM/DD') from dual;
select TO_DATE('2020.11.01.', 'YYYY.MM.DD.') from dual;

-- 오늘이 2020년 1월 1일에서 몇 일이 지났는지 확인
select trunc(sysdate - to_date('20-01-01','YY-MM-DD')) from dual;

-- 내가 몇 일을 살았는지 확인
select trunc(sysdate - to_date('1998-05-07','YYYY-MM-DD')) from dual;

-- 문자->숫자
select TO_NUMBER('100.00', '999,999.99')/TO_NUMBER('10.00', '999,999.99') as "연봉" from dual;

-- decode 함수 : switch 문과 비슷하다.
-- 사원이름, 부서번호, 부서이름 출력
select ename, deptno,
    decode(deptno,
        10, 'ACCOUNTING',   -- DEPTNO=10 이면 ACCOUNTING 출력
        20, 'RESEARCH',     -- DEPTNO=20 이면
        30, 'SALES',        -- DEPTNO=30 이면
        40, 'OPERATIONS'    -- DEPTNO=40 이면
    ) as dname
from emp order by deptno
;

-- 직급에 따라 급여를 인상하도록 하자.
-- 직급이 'ANALYST'인 사원은 5%,
--        'SALSMAN'인 사원은 10%,
--        'MANAGER'인 사원은 14%,
--        'CLERK'인 사원은 20% 인상한다.

select ename, sal,
    decode( job,
        'ANALYST', sal*1.05,
        'SALSMAN', sal*1.1,
        'MANAGER', sal*1.15,
        'CLERK', sal*1.20
    ) as upsal
from emp
order by sal
;

select distinct job from emp;

select ename as name, deptno as dno,
    case
        when deptno=10 then 'ACCOUNTING'
        when deptno=20 then 'RESEARCH'
        when deptno=30 then 'SALES'
        when deptno=40 then 'OPERATION'
    end as dname
from emp
--order by dname
;

-- 그룹함수 : 하나의 행의 컬럼을 대상이 아닌 그룹의 컬럼들을 묶어 그룹화하고 연산하는 함수
-- 그룹함수 : SUM, AVG, COUNT, MAX, MIN

select
        to_char(sum(sal)*1100, 'L999,999,999') as "월 급여 총액",
        round(avg(sal))*1100 as "월급여 평균",
        count(sal) as "전체 사원의 수",
        count(comm) as "커미션 수",
        max(sal) as "가장 큰 금액",
        min(sal) as "가장 작은 금액"
from emp
;

select
    sum(comm),
    avg(comm),
    count(comm),
    max(comm),
    min(comm)
from emp
;

-- 전체 행을 구한다
select count(*) as "전체 사원의 수", avg(sal) as "매니저 평균 급여"
from emp
where job='MANAGER'
;

-- 직무의 개수
select job
from emp
order by job
;

-- 특정 컬럼을 기준으로 그룹핑 : group by 컬럼

select deptno
from emp
group by deptno
;

select * from emp order by deptno;

-- 각 부서의 소속 인원 구하기
select deptno, count(*) as "cnt"
from emp
group by deptno
--order by count(*) desc
order by deptno
;

-- 각 부서별 총 급여액 출력
-- grpup by deptno : 부서별로 그룹핑
select deptno, sum(sal)
from emp
group by deptno
order by deptno
;

-- 부서별 급여 평균
select deptno, avg(Sal)
from emp
group by deptno
order by deptno
;

-- 부서별 급여 최고 금액과 최소 금액을 출력
select deptno, max(sal), min(sal)
from emp
group by deptno
order by deptno
;

-- 부서별로 그룹지은 후
-- 그룹 지어진 부서별
-- 평균 급여가 2000 이상인 (HAVING)
-- 부서번호와 부서별 평균 급여를 출력
select deptno, avg(sal)
from emp
group by deptno
-- having not (avg(sal)>=2000)
having not avg(sal)<2000
order by deptno
;

-- 부서별 급여의 최대값과 최소값을 구하되
-- 최대 급여가 2900 이상인 부서만 출력합니다.
select deptno, max(sal), min(sal)
from emp
group by deptno
having max(sal)>=2900
order by deptno
;

-- 직무별 지표 : 사원의 수, 급여의 총합, 평균 급여, 최대 급여, 최소 급여
select job,
    count(*) || '명' as "사원의 수",
    to_char(sum(sal)*1100, 'L999,9999,999') as "급여의 총합",
    to_char(avg(sal), 'L9999,9999,999') as "평균 급여",
    to_char(max(sal), 'L999,999,999') as "최대 급여",
    to_char(min(sal), 'L999,999,999') as "최소 급여"
from emp
where job!='PRESIDENT' --   그룹하기 위한 행을 선택하는 기준
group by job
order by job
;

desc book;
select * from tab;

desc customer;