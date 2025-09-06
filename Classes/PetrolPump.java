package Classes;
import java.lang.*;
import Interfaces.*;

public class PetrolPump implements PetrolPumpCustomerOperations,EmployeeOperations
{
	private Customer customers[] = new Customer [500];
	private Employee employees[] = new Employee [100];
	
	public boolean insertCustomer(Customer c)
	{
		boolean flag = false;
		for(int i=0; i<customers.length; i++)
		{
			if(customers[i] == null)
			{
				customers[i] = c;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public boolean removeCustomer(Customer c)
	{
		boolean flag = false;
		for(int i=0; i<customers.length; i++)
		{
			if(customers[i] == c)
			{
				customers[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public Customer searchCustomer(String tranNo)
	{
		Customer c = null;
		
		for(int i=0; i<customers.length; i++)
		{
			if(customers[i] != null)
			{
				if(customers[i].getTranNo().equals(tranNo))
				{
					c = customers[i];
					break;
				}
			}
		}
		return c;
	}
	public void showAllCustomers()
	{	
		for(int i=0; i<customers.length; i++)
		{
			if(customers[i] != null)
			{
				System.out.println("************************");
				customers[i].showDetails();
				//customers[i].showAllOils();
				System.out.println();
			}
		}
	}
	public boolean insertEmployee(Employee e)
	{
		boolean flag = false;
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] == null)
			{
				employees[i] = e;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public boolean removeEmployee(Employee e)
	{
		boolean flag = false;
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] == e)
			{
				employees[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}

	public Employee searchEmployee(String empId)
	{
		Employee e = null;
		
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] != null)
			{
				if(employees[i].getEmpId().equals(empId))
				{
					e = employees[i];
					break;
				}
			}
		}
		return e;
	}
	
	public void showAllEmployees()
	{
		System.out.println("---------------------");
		
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] != null)
			{
				employees[i].showDetails();
			}
		}
	}
	
	
	
}