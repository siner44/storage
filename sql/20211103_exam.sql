
-- DDL
create table phoneinfo_basic (
    idx number(6) CONSTRAINT phoneinfo_basic_idx_pk PRIMARY key,
    fr_name varchar2(20) not null,
    fr_phonenumber varchar2(20) not null,
    fr_email varchar2(20),
    fr_address varchar2(20),
    fr_regdate date DEFAULT sysdate);

create table phoneinfo_univ (
    idx number(6) CONSTRAINT phoneinfo_univ_idx_pk PRIMARY key,
    fr_u_major varchar2(20) default 'N' not null,
    fr_u_year number(1) default 1 not null check(fr_u_year between 1 and 4),
    fr_ref number(7) constraint phoneinfo_univ_fr_ref_fk REFERENCES phoneinfo_basic(idx)
    );

create table phoneinfo_com (
    idx number(6) CONSTRAINT phoneinfo_com_idx_pk primary key,
    fr_c_company varchar2(20) default 'N' not null,
    fr_ref number(6) constraint phoneinfo_com_fr_ref_fk REFERENCES phoneinfo_basic(idx)
    );