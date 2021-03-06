--#1 아래 요구사항에 맞도록 기본 SQL 문을 작성하시오.

--1. 아래 조건에 맞는 DDL을 작성하시오.
--===== 전화번호 부( 테이블 이름 : Contact )
------ 기본정보(not null)
-- 대리키 : 일련번호 -> pIdx 기본키로 설정
-- 이름, 전화번호, 주소, 이메일
-- 주소값과 이메일은 입력이 없을 때 기본값 입력
-- 친구의 타입 (카테고리) : univ, com, cafe 세가지 값만 저장 가능
------ 선택 정보
-- 전공, 학년
-- 회사이름, 부서이름, 직급
-- 모임이름, 닉네임
--=============================
CREATE table Contact (
    idx number(6) constraint pi_basic_idx_PK primary key,
    name VARCHAR2(20) not null,
    phonenumber varchar2(20) not null,
    email varchar2(20) default bit@bit.com,
    address varchar2(20) default paris
)
;

create table phoneinfo_univ (
    idx number(6),
    fr_u_major varchar2(20) default 'N',
    fr_u_year number(1) default 1 check (fr_u_year between 1 and 4),
    fr_ref number(6) not null,
    constraint pi_unic_idx_PK primary key (idx),
    constraint pi_univ_rdf_FK FOREIGN  KEY (fr_ref) REFERENCES phoneinfo_basic (idx) 
)
;

create table phoneinfo_com (
    idx number(6) constraint pi_com_idx_PK primary key,
    fr_c_company VARCHAR2(20) default 'N',
    fr_ref number(6) not null constraint pi_com_ref_FK REFERENCES phoneinfo_basic(idx)
);

create table phoneinfo_cafe (
    idx number(6) constraint pi_com_idx_PK primary key,
    fr_c_cafe VARCHAR2(20) default 'N',
    fr_ref VARCHAR2(20)
)
;

--2. DEPT 테이블에 데이터를 삽입하는 SQL을 작성하시오. 입력 데이터는 임의로 작성하시오.
INSERT INTO PHONEINFO_BASIC (IDX, fr_name, fr_phonenumber)
VALUES (SEQ_PIBASIC_IDX.nextval, '손흥민', '010-1111-1111')
;

insert into dept ()
values ()
;

desc dept;

--3. DEPT 테이블에 위에서 삽입한 데이터의 dname, loc 데이터를 변경하는 SQL을 작성하시오.
--   입력 데이터는 임의로 작성하시오.


--4. DEPT 테이블에 위에서 삽입한 데이터를 deptno 컬럼의 값을 기반으로 삭제하는 SQL을 작성하시오.




--5. 사용자가 보유한 테이블 목록을 확인하는 SQL문을 작성하시오.



--6. EMP 테이블의 구조를 확인하는 SQL을 작성하시오.



--7. 사용자가 정의한 제약조건들을 확인하는 SQL문을 작성하시오.


--#2 아래 요구사항에 맞도록 고급 SQL 문을 작성하시오.

--1. EMP 테이블의 ename 컬럼에 인덱스를 생성하는 SQL을 작성하시오. 인덱스의 이름은 emp_index
--2. EMP 테이블과 DEPT 테이블을 조인하는 SQL을 기반으로 view 객체를 생성하는 SQL을 작성하시오.
--   view 의 이름은 emp_view 로 하시오.
--3. EMP 테이블에서 모든 사원의 부서번호를 이름이 'SCOTT'인 사원의 부서번호로 변경하는 SQL을 작성하시오.