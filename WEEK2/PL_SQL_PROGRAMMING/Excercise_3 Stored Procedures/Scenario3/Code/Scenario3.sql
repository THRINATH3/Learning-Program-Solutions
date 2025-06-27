set serveroutput on;
create or replace procedure TransferFunds (fromAc IN Number,toAc IN Number,amount IN Number)is 
fromAcBal Number;
begin
    select Balance into fromAcBal from Accounts where AccountID = fromAc ;
    if (fromAcBal < amount)then
        DBMS_OUTPUT.PUT_LINE('Transfer failed: insufficient funds in source account.');
    else
        update Accounts set Balance = Balance - Amount where AccountID  = fromAc;
        update Accounts set Balance = Balance + Amount where AccountID  = toAc;
        DBMS_OUTPUT.PUT_LINE('Transfer Success: Sufficient funds in source account.');
    end if;
end;
/
BEGIN
    TransferFunds(2, 1, 50000);
END;
/
