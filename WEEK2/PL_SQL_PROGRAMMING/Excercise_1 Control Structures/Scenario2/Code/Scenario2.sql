begin
   for c in (select CustomerID,Balance from Customers) loop
	if(c.balance > 10000) then
		update Customers set IsVIP = 'True' where CustomerID = c.CustomerID;
	else
		update Customers set IsVIP = 'False' where CustomerID = c.CustomerID;
	end if;
   end loop;
end;
/