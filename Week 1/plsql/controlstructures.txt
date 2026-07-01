--1
DECLARE CURSOR c_customer IS
SELECT CustomerID, Age
FROM Customers;
BEGIN FOR c IN c_customer LOOP
IF c.Age > 60 THEN UPDATE Loans
SET InterestRate = InterestRate - 1 WHERE CustomerID = c.CustomerID;
END IF;
END LOOP;
COMMIT;
DBMS_OUTPUT.PUT_LINE('Interest rate updated successfully.');
END;
--2
Declare Cursor c_customer is select CustomerID, Balance from Customers;
begin for c in c_customer loop if c.Balance > 10000 then
update Customers set IsVIP = 'TRUE' where CustomerID = c.CustomerID;
end if;
end loop;
commit;
DBMS_OUTPUT.PUT_LINE('VIP customers updated successfully.');
end;
--3
declare cursor c_loan is select CustomerID, LoanID, DueDate from Loans
where DueDate between sysdate and sysdate + 30;
begin for l in c_loan loop
DBMS_OUTPUT.PUT_LINE('Reminder: Loan ' || l.LoanID ||' for Customer ' || l.CustomerID ||' is due on ' || TO_CHAR(l.DueDate,'DD-MON-YYYY'));
end loop;
end;
