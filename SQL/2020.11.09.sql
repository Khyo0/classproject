-- 2020.11.09
-- Select �⺻

-- scott �������� �α���
-- scott ������ ������ ���̺� ��ü�� Ȯ�� : Tab -> ����ڰ� ������ ���̺��� ������ �����ϴ� ������ ��ųʸ�
select * from tab;

-- ���̺��� ���� Ȯ�� : DESC
-- ���̺��� �����͸� �˻��ϱ� �� ������ Ȯ�� �� ��
DESC emp;
desc dept;
select hiredate from emp;

-- �������� ��ȸ ��� : Select
-- SELECT �÷��� , ... FROM ���̺� �̸�(��ȸ�� ���) --> �⺻ ����
-- SELECT�� ����� -> TABLE�̴�!!!

SELECT      -- ��ȸ�ϴ� ��ɾ�
    *       -- �÷� �̸����� ������ش�. ����ϴ� ������ ���� ����� ������ �°� ���
FROM emp    -- ��ȸ�ϰ����ϴ� ���̺� �̸��� ���
;           -- sql�� ����

-- �μ� ���̺��� ��� �����͸� ��ȸ����
select *
from dept
;

desc dept;

-- �μ����̺��� --> FROM
-- �μ��� �̸��� ��ġ ��� --> SELECT
select dname, loc
from dept
;

select loc, dname, deptno
from dept
;

-- ��� ����� ������ �������
select *
from emp
;

-- ����� �̸�, ���, ����(����)�� �����ϴ� ����Ʈ ���
select ename, empno, job
from emp
;

-- select ���� �÷��� ��Ģ���� ����
-- �ӽ����̺� dual : �÷��� x �� ������ ���̺�
select 100+200, 200-100, 100*10, 100/10
from dual;

select ename, sal, sal*12
from emp
;

select *
from emp
;

-- ������ ����� sal*12+comm���� �������
select ename, sal, sal*12, comm, sal*12+comm
from emp
;

-- null : ���� ���������� �������� ���� ��
-- ������ �Ұ� : ��Ģ����, �񱳿���

-- nvl �Լ� : null ���� ġȯ���ִ� �Լ�
-- nvl(�÷�, ��ü��) : �÷��� ���� null�� �� ��ü������ ġȯ,
--      �� �� ��ü���� �÷��� Ÿ�Կ� �´� �����Ϳ��� ��.

-- ������ ����� sal*12+comm���� �������
select ename, sal, sal*12 sal12, nvl(comm, 0) as comm, sal*12+nvl(comm, 0) as "12���� ����"
from emp
;

-- �����ͺ��̽��� sql ������ ���ڿ� ó���� ���� ����ǥ ''
-- ���ڿ��� ����
select ename || ' �� ������ ' || job || '�Դϴ�.'
from emp;

-- Distinct : �������� �ߺ����� �����ϰ� ���
select deptno
from emp;

select DISTINCT deptno
from emp;