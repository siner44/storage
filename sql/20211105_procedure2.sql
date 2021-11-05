
desc book;
-- 동일한 도서가 있는지 점검한 후 삽입하는 프로시저

CREATE or replace PROCEDURE bookinsertorupdate(
    mybookid number,
    mybookname varchar2,
    mypublisher varchar2,
    myprice number)
as
    -- 변수 선언
    mycount number;
begin
    -- 입력받은 책이름으로 같은 이름의 책을 보유하는지 여부 확인 숫자
    select count(*) into mycount from book where bookname like mybookname;
    -- 책의 개수로 분기: 수정 또는 입력
    if mycount != 0 then
        -- 가격 수정
        update book set price = myprice where bookname like mybookname;
    else 
        -- 데이터(행) 입력
        insert into book values (mybookid, mybookname, mypublisher, myprice); 
    end if;
end;
