
-- 2021.11.01

-- 서브 쿼리 (부속 질의)
-- select 구문 안에 또 다름 select 구문을 이용하는 sql문

-- SCOTT 사원의 부서 이름을 출력
select dname, emp.deptno
from emp, dept
where emp.deptno = dept.deptno and ename = 'SCOTT';

select dname 
from dept
where deptno = (
    select deptno 
    from emp
    where ename = 'SCOTT');
    
-- 1. 내부 쿼리를 먼저 작성
-- 2. 외부 쿼리 작성

select deptno, dname
from dept
where deptno > 20;

-- 마당 서점의 고객별 판매액 출력
select * from customer;
select custid,(select name from customer c where o.custid = c.custid ) name, sum(saleprice)
from orders o
group by custid;

-- 사원의 이름과 부서 이름을 출력
select ename,
    (select dname from dept where emp.deptno = deptno)
from emp;
select ename, dname
from emp, dept
where emp.deptno = dept.deptno;

-- 인라인 뷰 : from 뒤에 오는 서브 쿼리 -> select의 결과를 테이블로 사용
-- 고객 번호가 2 이하인 고객의 판매액 출력(고객 이름, 고객별 판매액 출력)
select custid, name
from customer
where custid <= 2;
select o.custid, sum(saleprice)
from orders o,
    (select custid, name from customer where custid <= 2) c
where o.custid = c.custid
group by o.custid;

select *
from orders
where custid <= 2;

-- 30번 부서의 인라인 뷰를 만들어서 사용
select *
from (select * from emp where deptno = 30);