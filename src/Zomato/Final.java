package Zomato;

public class Final {
	public void List(String hotelname1,String foodname,int qty) 
	{
		if (hotelname1=="A2B")
		{
			A2B a= new A2B();
			a.HotelA2B(foodname, qty);
		}
		else if(hotelname1=="KFC") {
			KFC k = new KFC();
			k.HotelKFC(foodname, qty);
			
		}
		
		
	}
			

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Final f=new Final();
		/*
		 * hotel name         fooditem
		 * ----------         --------
		 * A2B				  Idly
		 * 					  Dosa
		 * KFC-Chickenwings
		 * 	   Fires
		 
		 
		f.HotelName("A2", "Idly", 5);
		f.price();
		f.tax();*/
		
		
		//f.List("A2B", "Idly", 6);
		///f.tax();
		
		f.List("KFC", "Fries", 4);
		//f.tax();
		
	}

}
