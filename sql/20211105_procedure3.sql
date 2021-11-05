
-- book 테이블에 저장된 도서의 평균 가격을 반환하는 프로시져
create or replace procedure avgPrice(
    avgval out number)
as
begin
    select avg(price) into avgval from book where price is not null;
end;