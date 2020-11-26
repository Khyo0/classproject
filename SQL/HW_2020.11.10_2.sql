-- 1
select * from book;
select * from customer;
select * from orders;

-- 1-1
select bookname
from book
where bookid=1;

-- 1-2
select bookname
from book
where price>=20000;

-- 1-3
select sum(saleprice)
from orders
where custid=1;

-- 1-4
select count(saleprice)
from orders
where custid=1;

-- 2-1
select count(bookid)
from book;

-- 2-2
select count(distinct publisher)
from book;

-- 2-3
select name, address
from customer;

-- 2-4
select orderid
from orders
where orderdate between '14/07/04' and '14/07/07';

-- 2-5
select orderid
from orders
where not orderdate between '14/07/04' and '14/07/07';

-- 2-6
select name, address
from customer
where name like '김%';

-- 2-7
select name, address
from customer
where name like '김%아';