
-- 2021.11.03

-- DDL : 데이터 정의어, 객체 생성, 수정, 삭제 명령어

-- 테이블 생성 : create table
-- 테이블 수정 : alter table
-- 테이블 삭제 : drop table

-- create table 테이블명 (
--      컬럼이름 데이터_타입(size) 제약조건정의(컬럼 레벨 정의),
--      ....
--      제약조건정의
-- );

-- 부서 테이블과 유사한 테이블 정의
create table dept_test (
    deptno number(2),
    dname varchar2(20),
    loc varchar2(20)
);

-- 테이블 삭제
drop table dept_test;

-- 사원 테이블과 유사한 구조의 사원번호, 사원 이름, 급여 3개의 칼럼으로 구성된 EMP01 테이블 생성
desc emp;
-- EMPNO    NOT NULL NUMBER(4)    
-- ENAME             VARCHAR2(10) 
-- JOB               VARCHAR2(9)

create table emp01 (
    empno number(4),
    ename varchar2(10),
    sal number(7, 2)
);

-- 서브쿼리를 이용해서 기존 테이블의 구조를 복사하고, 투플을 복사
-- 컬럼의 정의만 복사, 제약조건은 복사되지 않는다
create table emp02
as
select * from emp;

select *
from emp02;

-- 원하는 컬럼만 복사
create table emp03
as
select empno, ename from emp;

-- 원하는 데이터만 복사
create table emp04
as
select * from emp where deptno = 10;

desc emp04;
select *
from emp04;

-- 구조만 복사
select * from emp where 1 = 0;
create table emp05
as
select * from emp where 1 =0;

-- 테이블 구조의 변경 : alter table
-- 컬럼 추가 : alter table 테이블 이름} add (컬럼 정의);

desc emp01;
-- EMP01 테이블에 문자 타입의 직급(job) 컬럼 추가
alter table emp01
add (job varchar2(9));
select * from emp01;

alter table emp01
add (hiredate date,
    deptno number(2)
    );
    
-- 컬럼의 변경 : alter table {테이블 이름} modify (컬럼 정의);
-- 직업(job) 칼럼을 최대 30글자까지 저장할 수 있게 변경
alter table emp01
modify (job varchar2(30)not null);

-- 컬럼의 삭제 : alter table {테이블 이름} drop column 컬럼이름
-- EMP01 테이블의 직급 칼럼 삭제
alter table emp01 drop column job;

-- 테이블의 모든 투플을 삭제 : truncate table
-- 삭제와 동시에 commit : 바로 ㅡ물리적인 반영(저장)

-- emp02 테이블의 모든 데이터를 삭제
select * from emp02;
truncate table emp02;

-- 테이블 이름 변경 : rename old_name to new_name
-- emp02 테이블의 이름을 test로 변경
rename emp02 to test;
drop table test;

-- 제약 조건 확인
desc dept;
insert into dept (deptno, dname, loc)
    values (10, 'test', 'seoul');
    
-- 사원 테이블과 유사함 구조의
-- 사원번호, 사원명, 직급, 부서번호 4개의 칼럼으로 구성된
-- empno와 ename 컬럼에 not null 제약 조건 설정
create table emp02 (
    empno number(4) not null,
    ename varchar(20) not null unique,
    job varchar(9),
    deptno number(2)
    );
desc emp02;
insert into emp02 values (10, 'test', null, null);
select * from emp02;

-- 사원 테이블과 유사한 구조의
-- 사원번호, 사원명, 직급, 부서번호 4개의 칼럼으로
-- 구성된 emp03 테이블을 생성하되
-- 사원번호를 유일키로 지정
drop table emp03;
create table emp03 (
    empno number(4) constraint uq_emp03_empno unique,
    ename varchar2(20) not null,
    job varchar2(9),
    deptno number(2)
    );
insert into emp03 values(1000, 'test', 'MANAGER', 40);
insert into emp03 values(1000, 'test2', 'MANAGER2', 30);

-- 기본키 제약 조건
drop table emp04;
create table emp04 (
    empno number(4) constraint emp04_empno_pk primary key,
    ename varchar2(20) not null,
    job varchar2(9),
    deptno number(2)
    );
desc emp04;
select * from emp04;
insert into emp04 values(1000, 'test', 'MANAGER', 40);
insert into emp04 values(1000, 'test2', 'MANAGER2', 30);

--  외래키 제약
drop table emp05;
create table emp05 (
    empno number(4) constraint emp05_empno_pk PRIMARY key,
    ename varchar2(20) not null,
    job varchar2(9),
    deptno number(2) constraint emp05_deptno_fk references dept(deptno)
    );
desc emp05;
select * from emp05;
insert into emp05 values(1000, 'test', 'MANAGER', 40);
insert into emp05 values(2000, 'test2', 'MANAGER2', 60);

-- check 제약
drop table emp06;
create table emp06 (
    empno number(4) constraint emp06_empno_pk PRIMARY key,
    ename varchar2(20) not null,
    job varchar2(9),
    -- sal number(7, 2) CONSTRAINT emp06_sal_ck check(sal >= 500 and sal <= 5000),
    sal number(7, 2) CONSTRAINT emp06_sal_ck check(sal between 500 and 5000),
    -- gender char(1) CONSTRAINT emp06_gender_ck check(gender = 'M' or gender = 'F'),
    gender char(1) CONSTRAINT emp06_gender_ck check(gender in ('M', 'F')),
    deptno number(2) constraint emp06_deptno_fk references dept(deptno)
    );
desc emp06;
select * from emp06;
insert into emp06 values(1000, 'test', 'MANAGER', 600, 'M', 40);

-- default
drop table dept01;
create table dept01 (
    deptno number(2),
    dname varchar2(20),
    loc varchar2(20) default '서울',
    regDate date default sysdate
    );
insert into dept01(deptno, dname) values (10, 'test', 'NEWYORK'); 
insert into deptno01 (deptno, dname) values (10, 'test');
insert into dept01(deptno, dname) values (10, 'newyork', 'NEWYORK', null);

-- 테이블 레벨에서 제약 조건 정의
drop table emp07;
create table emp07(
    emp number(4), -- 기본키
    ename varchar(20) not null,
    sal number(7,2) constraint emp07_sal_ck check (sal between 500 and 5000),
    deptno number(2),
    constraint emp07_empno_pk primary key (empno),
    foreign key (deptno) references dept(deptno)
    );