package Zomato;

public class Calculation extends TaxAndDiscount{
	int bill,price;
	
	
	public void billamount(String foodname,int price1,int qty)
	{
		bill = price1*qty;
		System.out.println("Total amount "+bill);
		if(bill>0)
		{
			tax(bill);
		}
		
	}

}
