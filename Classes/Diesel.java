package Classes;
import java.lang.*;

public class Diesel extends Oil
{
	private String diesel;
	
	public Diesel()
	{
		super();
		//System.out.println("Empty-Diesel" + "\n" );
	}
	public Diesel(String tranNo, double perLiterCost, double totalCost,double stock,String diesel)
    {
		super (tranNo,perLiterCost,totalCost,stock);
		this.diesel = diesel;
	}
	
	public void setDiesel(String diesel)
	{
		this.diesel = diesel;
	}
	public String getDiesel()
	{
		return diesel;
	}
	
	public void showDetails()
	{
		//super.showDetails();
		System.out.println("OIL TYPE: " +diesel);
		System.out.println("COST PER LITER : " + this.getPerLiterCost());
		System.out.println("TOTAL AMOUNT TO BE PAID : " + this.getTotalCost()+" TAKA");
		System.out.println("QUANTITY SOLD : " + this.getSell()+" LITER");
		System.out.println("STOCK : " +stock);
		System.out.println("-----------------------------------"  + "\n");
	}
}
