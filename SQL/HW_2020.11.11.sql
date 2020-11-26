-- 32
select e.deptno, d.dname
from emp e , dept d
where e.ename='SCOTT'
and e.deptno = d.deptno
;

-- 33
select e.ename, d.dname, d.loc
from emp e INNER JOIN dept d
on e.deptno=d.deptno
;

-- 36
select e.ename, d.dname
from emp e INNER JOIN dept d
on e.deptno = d.deptno
where e.ename like '%A%'
;

-- 38
select e.ename, e.mgr, m.ename
from emp e, emp m
where e.mgr=m.empno
;

-- 39
select e.ename, e.empno, m.ename
from emp e
left outer join emp m on e.mgr = m.empno
order by e.empno DESC
;

-- 40
select e.ename, e.deptno
from emp e , emp m
where e.deptno=m.deptno
and e.ename='SCOTT'
;

-- 41
select m.ename, m.hiredate
from emp e, emp m
where e.ename='WARD'
and e.hiredate < m.hiredate
;

-- 42
select e.ename, e.hiredate, m.ename, m.hiredate
from emp e, emp m
where e.mgr = m.empno
and e.hiredate > m.hiredate