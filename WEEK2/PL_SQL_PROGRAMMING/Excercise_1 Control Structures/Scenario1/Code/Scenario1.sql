SET SERVEROUTPUT ON;

BEGIN
  FOR c IN (
    SELECT CustomerID, TRUNC(MONTHS_BETWEEN(SYSDATE, DOB) / 12) AS age
    FROM Customers
  ) LOOP
    IF c.age > 60 THEN
      UPDATE Loans
      SET InterestRate = InterestRate - (InterestRate * 0.01)
      WHERE CustomerID = c.CustomerID;
    END IF;
  END LOOP;

  DBMS_OUTPUT.PUT_LINE('Interest rates updated for customers above 60.');
END;
/
SELECT c.CustomerID, c.Name, c.DOB, TRUNC(MONTHS_BETWEEN(SYSDATE, c.DOB) / 12) AS Age,l.LoanID,l.InterestRate FROM Customers c, Loans l where c.CustomerID = l.CustomerID and TRUNC(MONTHS_BETWEEN(SYSDATE, c.DOB) / 12) > 60;
