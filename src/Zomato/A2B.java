package Zomato;

public class A2B {
	
	public void HotelA2B(String foodname,int qty) 
	{
		int price=0;
		Calculation c1=new Calculation();
		int Idly=10;
		int Dosa=30;
			System.out.println("Welcome to A2B");
			if(foodname=="Idly")
			{
				
				System.out.println("You have bought "+qty+" Idly");
				price=Idly;
				
			}			
			else if(foodname=="Dosa")
			{
				
				System.out.println("You have bought "+qty+" Dosa");
				price =Dosa;
			}
			else 
			{
				System.out.println(foodname +" item is not available");
			}
			
			c1.billamount(foodname, price, qty);
	}
	

}
