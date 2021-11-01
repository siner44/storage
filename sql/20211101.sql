
-- 20211101
-- join
-- 스키마의 결합, 행은 집합의 합 연산
-- 컬럼의 갯수가 늘어난다. 행은 행 X 행의 결과가 생성
-- 의미있는 데이터를 만들기 위해 컬럼의 비교 연산

-- Cross Join : 단순히 테이블을 붙이는 조인
-- 컬럼을 붙이고, 행(데이터)는 집합의 합 연산(카티즌 곱) -> 전체 행: R1의 행의 개수 X R2의 행의 개수
-- emp 테이블과 dept 테이블의 join -> 14 * 4 = 56개 행

-- Cross Join문
-- select * from 테이블 명, 테이블 명, ....
select *
from emp, dept
order by dept.deptno;

-- Equi Join
-- 특정 컬럼의 값들을 비교해서 같은 결과 행만 축출
select *
from emp, dept
where emp.deptno = dept.deptno;

select ename, dname
from emp, dept
where emp.deptno = dept.deptno
      and ename = 'SCOTT';

select *
from emp e, dept d;

select *
from salgrade;

select e.ename, e.sal, s.grade, s.losal, s.hisal
from emp e, salgrade s
where e.sal >= s.losal and e.sal <= s.hisal
order by e.empno;

-- Self Join
-- 나 자신을 참조해서 붙이는 조인
select e.ename, e.mgr, m.empno, m.ename as mgrName
from emp e, emp m
where e.mgr = m.empno
order by e.mgr;

-- Outer Join
select e.ename, e.mgr, m.empno, nvl(m.ename, '관리자 없음' )as mgrName
from emp e, emp m
where e.mgr = m.empno(+)
order by e.mgr;

-- Ansi Join
select *
from emp cross join dept;

-- Inner Join
-- select *
-- from t1 inner join t2
-- no 컬럼의 비교 조건(Join의 비교)

-- scott 사원의 사원 정보와 부서정보 출력
select *
from emp inner join dept
on emp.deptno = dept.deptno;

select *
from emp e join dept d
-- on e.deptno = d.deptno
using (deptno);

select *
-- from emp inner join dept
-- on emp.deptno = dept.deptno
from emp natural join dept;

-- ANSI outter Join
-- from R1(LEFT | RIGHT | FULL) otter join R2
-- 사원 이름과 상관의 이름을 출력
select e.ename, m.ename
from emp e left OUTER JOIN emp m
on e.mgr = m.empno;

-- 테이블 세 개 조인 : 주문 내역(고객 정보, 책의 이름, 구매 정보)
-- 주문 고객의 이름과 책의 이름, 구매 날짜와 구매 금액을 출력
select c.name, b.bookname, o.orderdate, o.saleprice
from book b, customer c, orders o
WHERE o.custid = c.custid and o.bookid = b.bookid;