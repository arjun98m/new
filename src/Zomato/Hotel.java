package Zomato;

public class Hotel {
	
	
	int idly,dosa,q;
	String a,b;
	
	public void HotelName(String hotelname,String foodname,int qty) 
	{
		b = hotelname;
		a = foodname;
		q=qty;
		if (hotelname =="A2B")
		{
			System.out.println("Welcome to A2B");
			if(foodname=="Idly")
			{
				System.out.println("You have bought "+qty+" Idly");
			}			
			else if(foodname=="Dosa")
			{
				System.out.println("You have bought "+qty+" Dosa");
			}
			else 
			{
				System.out.println(foodname +" item is not available");
			}
			
		
		}
		else if (hotelname =="Sangeetha")
		{
			System.out.println("Welcome to Sangeetha");
			if(foodname=="Idly")
			{
				System.out.println("You have bought "+qty+" Idly");
			}			
			else if(foodname=="Dosa")
			{
				System.out.println("You have bought "+qty+" Dosa");
			}
			else 
			{
				System.out.println(foodname +" item is not available");
			}
			
		
		}
		else
		{
			System.out.println(b+" this hotel is not available");
		}
		
	}
			

}
