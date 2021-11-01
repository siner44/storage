
-- 1. 마당 서점의 고객이 요구하는 다음 질문에 대해 SQL문을 작성
-- 5) 박지성이 구매한 도서의 출판사 수
select count(publisher)
from book, orders
where book.bookid = orders.bookid and custid = 
(select custid
from customer
where name = '박지성'); 

-- 6) 박지성이 구매한 도서의 이름, 가격, 정가와 판매가격의 차이
select bookname, saleprice, (price - saleprice) pricegap
from orders, book
where book.bookid = orders.bookid and custid =
(select custid
from customer
where name = '박지성');

-- 7) 박지성이 구매하지 않은 도서의 이름
select bookname 
from book
where bookid not in (select bookid from orders o, customer c where o.custid = c.custid and c.name = '박지성')
group by bookname;

-- 2. 마당서점의 운영자와 경영자가 요구하는 다음 질문에 대해 SQL문을 작성
-- 8) 주문하지 않은 고객의 이름(부속 질의 사용)
select name
from customer
where custid not in(select custid from orders);

-- 9) 주문 금액의 총액과 주문의 평균 금액
select to_char(sum(saleprice), 'L999,999,999') "주문 총액",
       to_char(avg(saleprice), 'L999,999,999') "평균 금액"
from orders;

-- 10) 고객의 이름과 고객별 구매액
select name, saleprice
from customer c, orders o
where c.custid = o.custid
group by name, saleprice;

-- 11) 고객의 이름과 고객이 구매한 도서 목록

-- 12) 도서의 가격(Book 테이블)과 판매 가격(Orders 테이블)의 차이가 가장 많은 주문

-- 13) 도서의 판매액 평균보다 자신의 구매액 평균이 더 높은 고객의 이름

-- 3. 마당서점에서 다음의 심화된 질문에 대해 SQL문을 작성
-- 1) 박지성이 구매한 도서의 출판사와 같은 출판사에서 도서를 구매한 고객의 이름

-- 2) 두 개 이상의 서로 다른 출판사에서 도서를 구매한 고객의 이름
