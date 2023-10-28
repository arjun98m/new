package Zomato;

public class KFC {
	public void HotelKFC(String foodname,int qty)
	{
		int Fries=200;
		int Chickenwings = 250;
		int price1 = 0;
		Calculation c1=new Calculation();;
		System.out.println("Welcome to KFC");
		if(foodname=="Chickenwings")
		{
			System.out.println("You have bought "+qty+" box of Chickenwings");
			price1=Chickenwings;
		}			
		else if(foodname=="Fries")
		{
			System.out.println("You have bought "+qty+" box ofFries");
			price1=Fries;
		}
		else 
		{
			System.out.println(foodname +" item is not available");
		}
		c1.billamount(foodname, price1, qty);
	}

}
