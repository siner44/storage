
-- 2021.11.03
--DML : 입력, 수정, 삭제

-- 테스트 테이블 생성
drop table dept01;

create table dept01
as
select * from dept where 1 = 0;

-- 데이터의 입력 : inset into (테이블명) (컬럼명, ...) values (data, ...);
-- 입력하고자 하는 컬럼의 개수와 입력 데이터의 개수는 일치
-- 컬럼의 도메인과 입력 데이터의 타입 일치
-- 컬럼의 제약 중에 not null 인 컬럼 생략 불가
insert into dept01 (deptno, dname, loc)
    values (10, 'DEV', 'SEOUL');

-- 모든 컬럼의 데이터를 입력할 경우 컬럼을 기술하는 것을 생략 가능
insert into dept01 values (30, 'ACCOUNTING', 'DALLAS');
insert into dept01 values (30, 'ACCOUNTING', '');
insert into dept01 (deptno, dname) values (20, 'SALES');
select * from dept01;

-- 서브 쿼리를 이용한 데이터 입력
drop table dept02;
create table dept02 
as
select * from dept where 1=2;
select  * from dept02;

-- 서브 쿼리를 이용한 데이터 삽입
insert into dept02 select * from dept;
