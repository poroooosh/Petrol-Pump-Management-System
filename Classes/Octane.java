package Classes;
import java.lang.*;

public class Octane extends Oil
{
	private String octane;
	
	public Octane()
	{
		super();
		//System.out.println("Empty-Diesel" + "\n" );
	}
	public Octane(String tranNo, double perLiterCost, double totalCost,double stock,String octane)
    {
		super (tranNo, perLiterCost,totalCost,stock);
		this.octane = octane;
	}
	
	public void setOctane(String octane)
	{
		this.octane = octane;
	}
	public String getOctane()
	{
		return octane;
	}
	
	public void showDetails()
	{
		//super.showDetails();
		System.out.println("OIL TYPE: " +octane);
		System.out.println("COST PER LITER : " + this.getPerLiterCost());
		System.out.println("TOTAL AMOUNT TO BE PAID : " + this.getTotalCost()+" TAKA");
		System.out.println("QUANTITY SOLD : " + this.getSell()+" LITER");
		System.out.println("STOCK : " +stock);
		System.out.println("-----------------------------------"  + "\n");
	}
}
