package Classes;
import java.lang.*;

public class Petrol extends Oil
{
	private String petrol;
	
	public Petrol()
	{
		super();
		//System.out.println("Empty-Diesel" + "\n" );
	}
	public Petrol(String tranNo, double perLiterCost, double totalCost,double stock,String petrol)
    {
		super (tranNo,perLiterCost,totalCost,stock);
		this.petrol =petrol;
	}
	
	public void setPetrol(String petrol)
	{
		this.petrol = petrol;
	}
	public String getPetrol()
	{
		return petrol;
	}
	
	public void showDetails()
	{
		//super.showDetails();
		System.out.println("OIL TYPE: " +petrol);
		System.out.println("COST PER LITER : " + this.getPerLiterCost());
		System.out.println("TOTAL AMOUNT TO BE PAID : " + this.getTotalCost()+" TAKA");
		System.out.println("QUANTITY SOLD : " + this.getSell()+" LITER");
		System.out.println("STOCK : " + stock);
		System.out.println("-----------------------------------"  + "\n");
	}
}
