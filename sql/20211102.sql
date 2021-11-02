

-- 평균 급여보다 더 많은 급여를 받는 사원을 검색하는 문장
select avg(sal) from emp;

select ename, sal
from emp
where sal > (select avg (sal) from emp);

-- 평균 주문 금액 이하의 주문에 대해서 주문번호와 금액 출력
-- 평균 주문 금액
select avg(saleprice) from orders;
-- 주문 금액 이하의 주문에 대해서 주문 번호와 금액
select orderid, saleprice
from orders
where saleprice <= (select avg(saleprice) from orders);

-- 각 고객의 평균 주문 금액보다 큰 금액의 주문 내역에 대해서 주문번호, 고객
-- 각 고객의 평균 주문 금액
-- 조건: 각 고객의 평균 주문금액보다 큰 금액의 주문 내역
-- 주문 내역에 대해서 주문번호, 고객번호, 금액 출력

select custid, orderid, saleprice
from orders o
where saleprice > (select avg(saleprice) from orders od where od.custid = o.custid);

-- 다중 행 서브 쿼리
-- IN, SOME, ANY, ALL, EXISTS
-- 3000 이상 받는 사원이 소속된 부서와 동일한 부서에서 근무하는 사원
select distinct(deptno) from emp where sal >= 3000;
select * from emp where deptno = 10 or deptno =20;
select * from emp where deptno in (select distinct(deptno) from emp where sal >= 3000);

-- 대한민국에 거주하는 고객에게 판매한 도서의 총 판매액 출력
-- 대한민국에 거주하는 고객
select custid from customer where address like '%대한민국%';
-- 도서의 총 판매액
select sum(saleprice)
from orders
where custid in (select custid from customer where address like '%대한민국%');

-- 3번 고객이 주문한 도서의 최고 금액보다 더 비싼 도서를 구입한 주문의 주문번호와 금액 출력
select saleprice from orders where custid = 3;