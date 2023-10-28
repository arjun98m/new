package Zomato;

public class TaxAndDiscount
{
	
	//int presentage=18;
	
	final double GST=0.18;
	final double discount=0.05;
	double total,discount1,totalamount,GST1;
	
	public void tax(double bill)
	{		
				
			System.out.println("Bill is "+bill);
			GST1=bill*GST;
			System.out.println("Gst is "+GST1);
			total=GST1+bill;
			System.out.println("Total amount "+total);
			
			discount1=total*discount;
			System.out.println("Dis amount"+discount1);
			totalamount=total-discount1;
			
			System.out.println("After 5% discount "+totalamount);
				
			
			System.out.println("**************************");
		
	}

}
