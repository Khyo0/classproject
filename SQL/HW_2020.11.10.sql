-- 1
select ename, sal, sal+300
from emp;

-- 2
select ename, sal, (sal*12+100) as year_Sal
from emp;

-- 3
select ename, sal
from emp
where sal>2000
order by sal desc;

-- 4
select ename, deptno
from emp
where empno=7788;

-- 5
select ename, sal
from emp
where not(2000<sal and sal <3000);

-- 6
select ename, job, hiredate
from emp
where ('81/02/20'<=hiredate and hiredate<='81/05/01');

-- 7
select ename, deptno
from emp
where (deptno =20 or deptno = 30)
order by ename desc;

-- 8
select ename, sal, deptno
from emp
where (2000<= sal and sal <= 3000) and (deptno=20 or deptno=30)
order by ename asc;

-- 9
select ename, hiredate
from emp
where hiredate like '81%';

-- 10
select ename, job
from emp
where mgr is null;

-- 11
select ename, sal, comm
from emp
where nvl(comm, 0)>0
order by sal desc, comm desc;

-- 12
select ename
from emp
where ename like '__R%';

-- 13
select ename
from emp
where ename like '%A%' and ename like '%E%';

-- 14
select ename, job, sal
from emp
where job in('CLERK', 'SALESMAN') and sal not in(1600, 950, 1300);

-- 15
select ename, sal, comm
from emp
where comm>=500;