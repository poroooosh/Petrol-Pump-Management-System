package Classes;
import java.lang.*;
import Interfaces.*;

public class Customer implements CustomerOperations
{
	private String tranNo;
	protected Oil oils[] = new Oil[200];
	
	
	public Customer()
	{
		System.out.println("E-Customer");
	}
	public Customer(String tranNo)
	{
		System.out.println("P-Customer");
		this.tranNo = tranNo;
		
	}
	public void setTranNo(String tranNo)
	{
		this.tranNo = tranNo;
		}
	public String getTranNo()
	{
		return tranNo;
		}
	
	
	public boolean insertOil(Oil o) 
	{
		boolean flag = false;
		
		for(int i=0; i<oils.length; i++)
		{
			if(oils[i] == null)
			{
				oils[i] = o;
				flag = true;
				break;
			}
		}
		return flag;
		
	}
	
	public boolean removeOil(Oil o)
	{
		boolean flag = false;
		for(int i=0; i<oils.length; i++)
		{
			if(oils[i] == o)
			{
				oils[i] = null;
				flag = true;
				System.out.println("\n****OIL****\n");
				System.out.println("*UPDATE* :The  OIL of TRANSNO:"+o.getTranNo()+"has been removed successfully.\n");
				return flag;
			}
		}
		return flag;	
	}
	
	public Oil searchOil(String tranNo)
	{
		Oil o = null;
		
		for(int i=0; i<oils.length; i++)
		{
			if(oils[i] != null)
			{
				if(oils[i].getTranNo() ==tranNo)
				{
					System.out.println("*SEARCH COMPLETED*");
					System.out.println("*SEARCHED TRAN-NO NO: "+tranNo+" FOUND*");
					o = oils[i];
					System.out.println("##############################");
					o.showDetails();
					System.out.println("##############################");
					return oils[i];
				}
			}
		}
		  System.out.println("*SEARCH COMPLETED*");
		  System.out.println("*SEARCHED Tran-NO NO: "+tranNo+" NOT FOUND*");
		  return null;
	}
	
	public void showAllOils( ) 
	{
		for(int i=0; i<oils.length; i++)
		{
			if(oils[i] != null)
			{
				oils[i].showDetails();
			}
		}
	}
	
	public void showDetails()
	{
		System.out.println("Customer Transaction Id : " + tranNo);
		this.showAllOils();
		System.out.println();
	}
}