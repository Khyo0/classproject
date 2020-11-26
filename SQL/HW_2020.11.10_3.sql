-- 16
select substr(hiredate,1,5)
from emp;

-- 17
select *
from emp
where substr(hiredate, 3,4)='/04/';

-- 18
select *
from emp
where mod(empno, 2)=0;

-- 19
select sysdate, to_char(hiredate, 'YY/DD/DY')
from emp;

-- 20
select trunc(sysdate- to_date('20/01/01', 'YY/MM/DD'))
from dual;

-- 21
select empno, nvl(mgr,0)
from emp;

-- 22
select ename, sal,
    decode( job,
        'ANALYST', sal+200,
        'SALSMAN', sal+180,
        'MANAGER', sal+150,
        'CLERK', sal+100
    )
from emp;

-- 23
select max(sal), min(sal), sum(sal), round(avg(sal))
from emp;

-- 24
select max(Sal), min(sal), sum(sal), round(avg(sal))
from emp
group by job;

-- 25
select job, count(*)
from emp
group by job;

-- 26
select count(*)
from emp
where job = 'MANAGER';

-- 27
select max(sal)- min(sal)
from emp;

-- 28
select job, min(sal)
from emp
where mgr is not null
group by job
having min(sal) >= 2000
order by min(sal) desc;

-- 29
select deptno, count(empno), round(avg(sal), 2)
from emp
group by deptno;

-- 30
select decode(deptno, 10,'ACCOUNTING', 20, 'RESEARCH', 30, 'SALES', 40, 'OPERATIONS'),
        decode(deptno, 10, 'NEW YORK', 20, 'DALLAS', 30, 'CHICAGO', 40, 'BOSTON'),
        count(*), round(avg(sal))
from emp
group by deptno;

-- 31
select job,
        deptno as dno,
        decode(deptno, 10, sum(sal)) as "부서 10",
        decode(deptno, 20, sum(sal)) as "부서 20",
        decode(deptno, 30, sum(sal)) as "부서 30",
        sum(sal) as "총액"
from emp
group by job, deptno;