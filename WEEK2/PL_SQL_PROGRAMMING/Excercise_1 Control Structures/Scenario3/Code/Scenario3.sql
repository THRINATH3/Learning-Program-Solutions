SET SERVEROUTPUT ON;
select * from loans;
BEGIN
    DBMS_OUTPUT.PUT_LINE(' Due in next 30 days');
    FOR c IN (
        SELECT cu.CustomerID, cu.Name
        FROM Customers cu
        JOIN Loans l ON cu.CustomerID = l.CustomerID
        WHERE TRUNC(MONTHS_BETWEEN(SYSDATE, l.EndDate)) = 30
    ) LOOP
        DBMS_OUTPUT.PUT_LINE('Mr. ' || c.Name || ' Due in next 30 days');
    END LOOP;
END;
/
