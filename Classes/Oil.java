package Classes;
import java.lang.*;
import Interfaces.OilOperations;

public abstract class Oil implements OilOperations
{
	protected String tranNo;
    protected double perLiterCost;
	protected double sell;
    protected double totalCost = 0.00;
    protected double stock;  
	
	public Oil()
	{
		//System.out.println("Empty-Oil");
	}
	
	public Oil(String tranNo,double perLiterCost, double totalCost,double stock)
{
	
	this.tranNo=tranNo;
	this.perLiterCost=perLiterCost;
    this.totalCost=totalCost;
    this.stock=stock;
    
}
    public void setTranNo(String tranNo)
	{
		this.tranNo = tranNo;
	}
	
	public void setPerLiterCost(double perLiterCost)
	{
		this.perLiterCost = perLiterCost;
	}
	
	
	public void stock(double stock)
	{
		this.stock = stock;
	}
	
	
	public String getTranNo()
	{
		return tranNo;
	}
	
	public double getPerLiterCost()
	{
		return perLiterCost;
	}
	
	public double getStock()
	{
		return stock;
	}
	
	
	public void lift(double ammount)
{
	 
	if(sell<9500)
	{
		stock = stock + ammount;
	}
	else
	{
		System.out.println("Invalid");
	}
}

     public double setSell(double sell)
{
	this.sell=sell;
	if(this.stock>0 && this.sell<=this.stock)
	{
		stock = stock - sell;	
		return sell;
	}
	else
	{
		System.out.println("OUT OF STOCK!");
	}
    return sell;
}
    public double getSell()
	{
		return sell;
	}
	public void totalCost()
	{
		totalCost = getSell()* getPerLiterCost();
	}
	
	public double getTotalCost()
	{
		return totalCost;
	}
	
	public abstract void showDetails();
}