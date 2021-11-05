
-- DDL
create table phoneinfo_basic (
    idx number(6) CONSTRAINT phoneinfo_basic_idx_pk PRIMARY key,
    fr_name varchar2(20) not null,
    fr_phonenumber varchar2(20) not null,
    fr_email varchar2(20),
    fr_address varchar2(20),
    fr_regdate date DEFAULT sysdate);

-- insert
insert into phoneinfo_basic values(
    1, '김철수', '010-1111-1111', 'a000@gmail.com', '경기도 안양', sysdate);
insert into phoneinfo_basic values(
    2, '김영희', '010-1111-2222', 'a001@gmail.com', '부산', sysdate);
insert into phoneinfo_basic values(
    3, '이영우', '010-1111-3333', 'a002@gmail.com', '서울', sysdate);
insert into phoneinfo_basic values(
    4, '홍길동', '010-1111-4444', 'a003@gmail.com', '강원도 동해', sysdate);
insert into phoneinfo_basic values(
    5, '점순이', '010-1111-5555', 'a004@gmail.com', '대전', sysdate);
-- update
update phoneinfo_basic set fr_address = '강원도 강릉' where idx = 4;
-- delete
delete from phoneinfo_basic where fr_name = '김영희';
-- select
select * from phoneinfo_basic;

create table phoneinfo_univ (
    idx number(6) CONSTRAINT phoneinfo_univ_idx_pk PRIMARY key,
    fr_u_major varchar2(20) default 'N' not null,
    fr_u_year number(1) default 1 not null check(fr_u_year between 1 and 4),
    fr_ref number(7) constraint phoneinfo_univ_fr_ref_fk REFERENCES phoneinfo_basic(idx)
    );
-- insert
insert into phoneinfo_univ values(
    1, '국어국문학과', '3', 1);
insert into phoneinfo_univ values(
    2, '유아교육과', '2', 2);
insert into phoneinfo_univ values(
    3, '컴퓨터공학과', '3', 3);
-- update
update phoneinfo_univ set fr_u_year = 4 where fr_ref = (select idx from phoneinfo_basic where fr_name = '이영우');
-- delete
delete from phoneinfo_univ where idx = 2;
-- select
select * from phoneinfo_basic b, phoneinfo_univ u where b.idx = u.fr_ref(+);


create table phoneinfo_com (
    idx number(6) CONSTRAINT phoneinfo_com_idx_pk primary key,
    fr_c_company varchar2(20) default 'N' not null,
    fr_ref number(6) constraint phoneinfo_com_fr_ref_fk REFERENCES phoneinfo_basic(idx)
    );
    
-- insert
insert into phoneinfo_com values(
    1, '애플', 4);
insert into phoneinfo_com values(
    2, '삼성', 5);
-- update
update phoneinfo_comm set fr_c_company = '현대' where fr_ref = (select idx from phoneinfo_basic where fr_name = '점순이');
-- delete
delete from phoneinfo_comm where idx = 2;
-- select
select * from phoneinfo_basic b, phoneinfo_com c, phoneinfo_univ u where b.idx = c.fr_ref(+) and b.idx = u.fr_ref(+);