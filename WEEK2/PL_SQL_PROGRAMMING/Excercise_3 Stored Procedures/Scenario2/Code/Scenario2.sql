CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(bonusPerc IN NUMBER,Dept IN VARCHAR2) IS
BEGIN
    UPDATE Employees SET Salary = Salary + bonusPerc * Salary WHERE Department = Dept;
END;
/


begin
    UpdateEmployeeBonus(0.5,'IT');
end;
/

SELECT * FROM Employees WHERE Department = 'IT';


