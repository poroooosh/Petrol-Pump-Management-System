package Interfaces;
import java.lang.*;
import Classes.Customer;

import java.lang.*;


public interface PetrolPumpCustomerOperations
{
	boolean insertCustomer(Customer c);
	boolean removeCustomer(Customer c);
	Customer searchCustomer(String TranNo);
	void showAllCustomers();
}




