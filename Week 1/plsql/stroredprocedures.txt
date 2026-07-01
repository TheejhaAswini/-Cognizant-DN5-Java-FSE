--1
create or replace procedure processmonthlyinterest is
begin update accounts set balance = balance + (balance * 0.01) where accounttype = 'Savings';
commit;
dbms_output.put_line('monthly interest processed successfully');
end;
--2
create or replace procedure updateemployeebonus(p_department in varchar2,p_bonus in number) is
begin update employees set salary = salary + (salary * p_bonus / 100) where department = p_department;
commit;
dbms_output.put_line('employee bonus updated successfully');
end;
--3
create or replace procedure transferfunds(p_fromaccount in number,p_toaccount in number,p_amount in number) is v_balance number;
begin select balance into v_balance from accounts where accountid = p_fromaccount;
if v_balance >= p_amount then update accounts set balance = balance - p_amount where accountid = p_fromaccount;
update accounts set balance = balance + p_amount where accountid = p_toaccount;
commit;
dbms_output.put_line('fund transfer successful');
else
dbms_output.put_line('insufficient balance');
end if;
end;
