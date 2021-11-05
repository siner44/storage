
-- orders 테이블의 판매 도서에 대한 이익을 계산하는 프로시져
create or replace procedure interest
as
    -- 변수 선언
    myInterest number;
    price number;
    -- 커서 생성
    CURSOR interestCursor is select saleprice from orders;
begin
     myinterest := 0.0;
    -- 커서 오픈
    open interestCursor;
    -- 반복하면서 각 행의 값을 처리
    loop
        -- 커서 패치
        fetch interestCursor into price;
        
        -- 반복문의 탈출
        exit when interestCursor%notfound;
        
        -- price 값을 비교
        if price >= 30000 then
            myInterest := myInterest + price*0.1;
        else
            myInterest := myInterest + price*0.05;
        end if;
    end loop;
    
    -- 4. 커서 종료
    close interestCursor;
    
    -- 수익금 총액을 출력
    dbms_output.put_line('전체 이익금: ' || myInterest);
end;
set serveroutput on;
exec interest;