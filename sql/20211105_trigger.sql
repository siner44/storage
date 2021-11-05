
-- 2021.11.05

-- 임시 테이블 생성
create table book_log (
    bookid number,
    bookname varchar2(40),
    publisher varchar2(40),
    price number
    );
    
-- 트리거
create or replace trigger afterinsertbook
after insert on book for each row 
declare
    -- 변수 선언
    average number;
begin
    insert into book_log
    values (:new.bookid, :new.bookname, :new.publisher, :new.price);
    dbms_output.put_line('book_log 테이블에 백업');
end;

-- 트리거 실행
insert into book values (20, '스포츠 과학2', '이상미디어', 60000);

select * from book;
select * from book_log;