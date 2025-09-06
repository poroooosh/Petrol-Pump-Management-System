import java.lang.*;
import Classes.*;
import java.util.Scanner;

public class Start
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		PetrolPump b = new PetrolPump();
		
		System.out.println("-------------------------------------------");
		System.out.println("WELCOME TO Mega Fusion PETROL PUMP");
		System.out.println("-------------------------------------------");
		
		boolean repeat = true;
		
		while(repeat)
		{
			System.out.println("What do you want to do?");
			System.out.println("\t1. Employee Management");
			
			System.out.println("\t2. Customer-Oil Management");
			
			System.out.println("\t3. Looking for service");
			
			System.out.println("\t4. Exit");
			
			System.out.println();
			System.out.print("What is your choice: ");
			int choice = sc.nextInt();
			
			switch(choice)
			{
				//Employee management------
				
				case 1:
					
					System.out.println("-------------------------------------------");
					System.out.println("You have chose Employee Management");
					System.out.println("-------------------------------------------");
					
					System.out.println();
					System.out.println("You have the following options:");
					System.out.println("\t1. Insert New Employee");
					System.out.println("\t2. Remove Existing Employee");
					System.out.println("\t3. Search an Employee");
					System.out.println("\t4. Show All Employees");
					System.out.println("\t5. Go Back");
					
					System.out.println();
					System.out.print("Enter you option: ");
					int option1 = sc.nextInt();
					
					switch(option1)
					{
						case 1:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Insert New Employee");
							System.out.println("-------------------------------------------");
							
							System.out.print("Enter Employee ID: ");
							String empId1 = sc.next();
							System.out.print("Enter Employee Name: ");
							String name1 = sc.next();
							System.out.print("Enter Employee Salary: ");
							double salary1 = sc.nextDouble();
							
							Employee e1 = new Employee();
							e1.setEmpId(empId1);
							e1.setName(name1);
							e1.setSalary(salary1);
							
							if(b.insertEmployee(e1))
							{
								System.out.println(name1+": " + e1.getEmpId() + ": has been Inserted");
							}
							else
							{
								System.out.println(name1+" " + e1.getEmpId() + " can NOT be Inserted");
							}
							System.out.println();
							break;
							
						case 2:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Remove an Employee");
							System.out.println("-------------------------------------------");
							
							System.out.print("Enter an Employee ID for Removing: ");
							String empId2 = sc.next();
							
							Employee e2 = b.searchEmployee(empId2);
							
							if(e2 != null)
							{
								System.out.println("### Employee Found for Removing ###");
								if(b.removeEmployee(e2))
								{
									System.out.println( empId2+"  " + e2.getEmpId() + " has been Removed");
								}
							}
							else
							{
								System.out.println("### "+empId2+"Employee NOT Found and Can NOT be Removed ###");
							}
							System.out.println();
							break;
							
						case 3: 
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Search an Employee");
							System.out.println("-------------------------------------------");
							
							System.out.print("Enter an Employee ID for searching: ");
							String empId3 = sc.next();
							
							Employee e3 = b.searchEmployee(empId3);
							
							if(e3 != null)
							{
							    System.out.println(empId3+" Employee Found ");
								System.out.println("Employee ID: " + e3.getEmpId());
								System.out.println("Employee Name: " + e3.getName());
								System.out.println("Employee Salary: " + e3.getSalary());
							}
							else
							{
								System.out.println(empId3+" Employee NOT Found ");
							}
							System.out.println();
							break;
							
						case 4:
							
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Show All Employees");
							System.out.println("-------------------------------------------");
							
							b.showAllEmployees();
							
							break;
							
						case 5:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Go Back");
							System.out.println("-------------------------------------------");
							break;
							
						default:
						
							System.out.println("-------------------------------------------");
							System.out.println("Invalid Option");
							System.out.println("-------------------------------------------");
							break;
					}
					System.out.println();
					break;
					
					//Customer-Oil Management....
					
				case 2:
				
					System.out.println("-------------------------------------------");
					System.out.println("You have chose Customer-OilManagement");          // hybrid
					System.out.println("-------------------------------------------");
					
					System.out.println();
					System.out.println("You have the following options:");
					System.out.println("\t1. Insert New Customer");
					System.out.println("\t2. Remove Existing Customer");
					System.out.println("\t3. Search a Customer");
					System.out.println("\t4. Show All Customers");
					System.out.println("\t5. Go Back");
					
					System.out.println();
					System.out.print("Enter you option: ");
					int option2 = sc.nextInt();
					
					switch(option2)
					{
						case 1:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Insert New Customer");
							System.out.println("-------------------------------------------");
							
							
							System.out.print("Enter Customer Transaction Id: ");
							String tranNo1 = sc.next();
							
							Customer c1 = new Customer();
							c1.setTranNo(tranNo1);
							
							if(b.insertCustomer(c1))
							{
								System.out.println(tranNo1+"Customer " + c1.getTranNo() + " has been Inserted");
								if(c1 != null)
							{
								System.out.println("### Valid Customer ###");	
								System.out.println("Which type of Oil do you want?");
								System.out.println("\t1. Octane");
								System.out.println("\t2. Petrol");
								System.out.println("\t3. Diesel");
								System.out.println("\t4. Go Back");
								System.out.println();
								
								System.out.print("Your Type: ");
								int type = sc.nextInt();
								System.out.println("Transaction No: "+ tranNo1);
								Oil a = null;
								
								if(type == 1)
								{
									System.out.println("----------------------------------");
									System.out.println("Inserting OCTANE>>>>>");
									System.out.print("Transaction No: ");
									String tranNo4 = sc.next();
									System.out.print("PER LITER COST:");
									double perLiterCost1= sc.nextDouble();
									System.out.print("sale:");
									double sell1 = sc.nextDouble();
					
									Octane oc = new Octane();
									oc.setTranNo(tranNo4);
									oc.stock(10000);
									oc.setOctane("OCTANE");
									oc.setPerLiterCost(perLiterCost1);
									oc.setSell(sell1);
									oc.totalCost();
									oc.showDetails();
									a = oc;
								}
								else if(type == 2)
								{
									System.out.println("----------------------------------");
									System.out.println("Inserting Petrol>>>>> ");
									System.out.print("PER LITER COST: ");
									double perLiterCost2= sc.nextDouble();
									System.out.print("sale: ");
									double sell2 = sc.nextDouble();
									
									Petrol pt = new Petrol();
									pt.stock(10000);
									pt.setPetrol("Petrol");
									pt.setPerLiterCost(perLiterCost2);
									pt.setSell(sell2);
									pt.totalCost();
									pt.showDetails();
									a = pt;
									
									
								}
								else if(type == 3)
								{
									System.out.println("----------------------------------");
									System.out.println("Inserting Diesel>>>>> ");
									System.out.print("PER LITER COST:");
									double perLiterCost3= sc.nextDouble();
									System.out.print("sale:");
									double sell3 = sc.nextDouble();
									
									Diesel ds = new Diesel();
									ds.stock(1000);
									ds.setDiesel("Diesel");
									ds.setPerLiterCost(perLiterCost3);
									ds.setSell(sell3);
									ds.totalCost();
									ds.showDetails();
									a = ds;
								}
								else if(type == 4)
								{
									System.out.println("----------------------------------");
									System.out.println("Going Back.....");
									System.out.println("----------------------------------");
								}
								else
								{
									System.out.println("----------------------------------");
									System.out.println("Invalid Type");
									System.out.println("----------------------------------");
								}
							}
							else
							{
								System.out.println("Customer " + c1.getTranNo() + " Can NOT be Inserted");
							}
							System.out.println();
							break;
							}
							
							
							
						case 2:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Remove a Customer");
							System.out.println("-------------------------------------------");
							
							System.out.print("Enter an Customer Transaction ID for Removing: ");
							String tranNo2 = sc.next();
							Customer c2 = b.searchCustomer(tranNo2);
							
							if(c2 != null)
							{
								System.out.println("### Customer Found for Removing ###");
								if(b.removeCustomer(c2))
								{
									System.out.println(tranNo2+" Customer " + c2.getTranNo() + " has been Removed");
								}
							}
							else
							{
								System.out.println("### Customer NOT Found and Can NOT be Removed ###");
							}
							System.out.println();
							break;
							
						case 3: 
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Search a Customer");
							System.out.println("-------------------------------------------");
							
							System.out.print("Enter an Customer Transaction ID for searching: ");
							String tranNo3 = sc.next();
							
							Customer c3 = b.searchCustomer(tranNo3);
							
							if(c3 != null)
							{
								System.out.println(tranNo3+" Customer Found ");
								System.out.println("Customer Transaction ID: " + c3.getTranNo());
								
							}
							else
							{
								System.out.println("### Customer NOT Found ###");
							}
							System.out.println();
							
							break;
							
						case 4:
							
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Show All Customers");
							System.out.println("-------------------------------------------");
							b.showAllCustomers();
							
							break;

							
							
						case 5:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Go Back");
							System.out.println("-------------------------------------------");
							break;
							
						default:
						
							System.out.println("-------------------------------------------");
							System.out.println("Invalid Option");
							System.out.println("-------------------------------------------");
							break;
					}
					System.out.println();
					
					break;
				
				
				
				
				case 3:
				    System.out.println("Sorry No moto service here \n\n");
					
					
					
					break;
					
					//Exit......
				case 4:
					
					System.out.println("-------------------------------------------");
					System.out.println("You have chose to Exit");
					System.out.println("-------------------------------------------");
					
					repeat = false;
					
					break;
					
				default:
					
					System.out.println("-------------------------------------------");
					System.out.println("Invalid Choice...");
					System.out.println("-------------------------------------------");
					
					break;
			}
		}
	}
}
