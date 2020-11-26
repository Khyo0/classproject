-- select 추가문제

desc book;
desc customer;
desc orders;

-- 1. 마당서점의 고객이 요구하는 다음 질문에 대해 SQL문을 작성하시오.
-- (1) 도서번호가 1인 도서의 이름 :book 테이블
select bookname
from book
where bookid=1
;

-- (2) 가격이 20,000원 이상인 도서의 이름 : book 테이블
select book name
from book
where price>=20000
;

-- (3) 박지성의 총 구매액 (박지성 고객번호 : 1번) : orders 테이블
select sum(saleprice) as totalPrice
from orders
where custid=1  -- 박지성의 custid
;

select sum(saleprice) as totalPrice
from orders
where custid=(select custid from customer where name='박지성')
;

-- (4) 박지성이 구매한 도서의 수 (박지성 고객번호 : 1번) : orders 테이블
--      박지성의 구매 횟수 == 구매 도서 수
select count(*)
from orders 
where custid=1
;

-- 2. 마당서점의 운영자와 경영자가 요구하는 다음 질문에 대해 SQL문을 작성하시오.
-- (1) 마당서점 도서의 총 개수 : book 테이블의 총 low 개수
select count(*)
from book
;

-- (2) 마당서점에 도서를 출고하는 출판사의 총 개수 : book 테이블
select count(distinct publisher)
from book
order by publisher
;

-- (3) 모든 고객의 이름, 주소 : customer 테이블
select name, address
from customer
;

-- (4) 2014년 월4일~7월7일 사이에 주문받은 도서의 주문번호 : orders 테이블
select orderid
from orders
where orderdate between '2014-07-04' and '2014-07-07'
;

-- (5) 2014년7월4일~7월7일 사이에 주문받은 도서를 제외한 도서의 주문번호
select orderid
from orders
where orderdate not between '2014-07-04' and '2014-07-07'
;

-- (6) 성이 ‘김’씨인 고객의 이름과 주소 : customer 테이블, like '김%'
select name, address
from customer
where name like '김%'
;

-- (7) 성이 ‘김’씨이고 이름이 ‘아’로 끝나는 고객의 이름과 주소 : name '김%아'
select name, address
from customer
where name like '김%아'
;