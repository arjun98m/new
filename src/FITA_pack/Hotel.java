package FITA_pack;

public class Hotel {
	
	/*
	 * FIrst list hotel names
	 * add food items list
	 * add price for the food
	 * Payment Bill
	 * finally paid
	 */
	double percentage = 10.5;
	double finalamount,v;
	int idly,idly1,dosa,dosa1,poori,poori1,pongal,pongal1;
	
	
	
	public void HotelList(String HotelName, String FoodName,int Qty)
	{
		//A2B Hotel
		if(HotelName=="A2B")
		{
			idly=6;
			dosa=25;
			poori=10;
			pongal=40;
			
			idly1=Qty*6;//a is IDLY
			dosa1=Qty*25;
			poori1=Qty*10;
			pongal1=Qty*40;
			System.out.println("Welcome to A2B");
			if(FoodName=="Idly")
			{
				System.out.println("Price of a Idly is "+idly);
				System.out.println("You have bought "+Qty+" idly");
				
				System.out.println("You have to pay " +idly1);
			}
			else if(FoodName=="Dosa")
			{
				System.out.println("Price of a Dosa is "+dosa);
				System.out.println("You have bought "+Qty+" Dosa");
				
				System.out.println("You have to pay " +dosa1);
			}
			else if(FoodName=="Poori")
			{
				System.out.println("Price of a Poori is "+poori);
				System.out.println("You have bought "+Qty+" Poori");
				
				System.out.println("You have to pay " +poori1);
			}
			else if(FoodName=="Pongal")
			{
				System.out.println("Price of a Pongal is "+pongal);
				System.out.println("You have bought "+Qty+" Pongal");
				
				System.out.println("You have to pay Rs." +pongal1);
			}
			else
			{
				System.out.println(FoodName+" is not available");

			}
			
		}
		//Hotel Pandian
		else if(HotelName=="Pandian")
		{
			idly=10;
			dosa=35;
			poori=15;
			pongal=50;
			
			idly1=Qty*10;//a is IDLY
			dosa1=Qty*35;
			poori1=Qty*15;
			pongal1=Qty*50;
			System.out.println("Welcome to Hotel Pandian");
			if(FoodName=="Idly")
			{
				System.out.println("Price of a Idly is "+idly);
				System.out.println("You have bought "+Qty+" idly");
				
				System.out.println("You have to pay " +idly1);
			}
			else if(FoodName=="Dosa")
			{
				System.out.println("Price of a Dosa is "+dosa);
				System.out.println("You have bought "+Qty+" Dosa");
				
				System.out.println("You have to pay " +dosa1);
			}
			else if(FoodName=="Poori")
			{
				System.out.println("Price of a Poori is "+poori);
				System.out.println("You have bought "+Qty+" Poori");
				
				System.out.println("You have to pay " +poori1);
			}
			else if(FoodName=="Pongal")
			{
				System.out.println("Price of a Pongal is "+pongal);
				System.out.println("You have bought "+Qty+" Pongal");
				
				System.out.println("You have to pay Rs." +pongal1);
			}
			else
			{
				System.out.println(FoodName+" is not available");

			}
			
		}
		//Hotel Hotel Sangeetha
		else if(HotelName=="Hotel Sangeetha")
			
		{
			idly=8;
			dosa=30;
			poori=12;
			pongal=30;	
			
					idly1=Qty*8;//a is IDLY
					dosa1=Qty*30;
					poori1=Qty*12;
					pongal1=Qty*30;
					System.out.println("Welcome to Hotel Sangeetha");
					if(FoodName=="Idly")
					{
						System.out.println("Price of a Idly is "+idly);
						System.out.println("You have bought "+Qty+" idly");
						
						System.out.println("You have to pay " +idly1);
					}
					else if(FoodName=="Dosa")
					{
						System.out.println("Price of a Dosa is "+dosa);
						System.out.println("You have bought "+Qty+" Dosa");
						
						System.out.println("You have to pay " +dosa1);
					}
					else if(FoodName=="Poori")
					{
						System.out.println("Price of a Poori is "+poori);
						System.out.println("You have bought "+Qty+" Poori");
						
						System.out.println("You have to pay " +poori1);
					}
					else if(FoodName=="Pongal")
					{
						System.out.println("Price of a Pongal is "+pongal);
						System.out.println("You have bought "+Qty+" Pongal");
						
						System.out.println("You have to pay Rs." +pongal1);
					}
					else
					{
						System.out.println(FoodName+" is not available");

					}
					
				}
				//Hotel Tiffin Center
				else if(HotelName=="Tiffin Center")
				{
					idly=10;
					dosa=35;
					poori=15;
					pongal=50;
					
					idly1=Qty*10;//a is IDLY
					dosa1=Qty*35;
					poori1=Qty*15;
					pongal1=Qty*50;
					System.out.println("Welcome to Tiffin Center");
					if(FoodName=="Idly")
					{
						System.out.println("Price of a Idly is "+idly);
						System.out.println("You have bought "+Qty+" idly");
						
						System.out.println("You have to pay " +idly1);
					}
					else if(FoodName=="Dosa")
					{
						System.out.println("Price of a Dosa is "+dosa);
						System.out.println("You have bought "+Qty+" Dosa");
						
						System.out.println("You have to pay " +dosa1);
					}
					else if(FoodName=="Poori")
					{
						System.out.println("Price of a Poori is "+poori);
						System.out.println("You have bought "+Qty+" Poori");
						
						System.out.println("You have to pay " +poori1);
					}
					else if(FoodName=="Pongal")
					{
						System.out.println("Price of a Pongal is "+pongal);
						System.out.println("You have bought "+Qty+" Pongal");
						
						System.out.println("You have to pay Rs." +pongal1);
					}
					else
					{
						System.out.println(FoodName+" is not available");

					}
					
				}
				
				else
				{
					System.out.println(HotelName+" is not available");
				}
		
		
		
	}
	/*
	 * need to get amount 
	 * percentage as globe
	 * tax x percentage
	 * final amount
	 */ 
		
	public void tax(int amount)
	{
		System.out.println("Your amount is "+amount);
		finalamount = (amount*percentage)/100;
		System.out.println("Your tax amount is "+finalamount);
		v=finalamount+amount;
		System.out.println("Total amount : "+v);
				
		
	}
	 /* discount
		 * --------
		 * verify amount is valid for discount
		 * discount percentage
		 * final amount
		 * 
		 * 
		 * 
		 */
	double dis,dis1;
	public void discount(int purchesamount)
	{
		System.out.println("You have purchesed for "+purchesamount);
		if (2500 < purchesamount && purchesamount <5000)
		{
			System.out.println("You have won 10% of Discount!!!");
			dis= (purchesamount*10)/100;
			dis1=purchesamount-dis;
			System.out.println("Discount amount : "+dis1);
		}
		else if (5000 <= purchesamount && purchesamount <10000)
		{
			System.out.println("You have won 12% of Discount!!!");
			dis= (purchesamount*12)/100;
			dis1=purchesamount-dis;
			System.out.println("Discount amount : "+dis1);
		}
		else
		{
			System.out.println("!Better Luck next time!");
		}
		
	}
	
	
	

	public static void main(String[] args) {
		
		Hotel h = new Hotel();
		/*
		 * Hotel list         food list
		 * ----------         ---------
		 * A2B                Idly
		 * Pandian            Dosa
		 * Hotel Sangeetha    Poori
		 * Tiffin Center      Pongal
		 */
	//	h.HotelList("A2B", "Kaldosa", 2);
		//h.HotelList("Pandian", "Dosa", 5);
		//h.HotelList("Tiffin Center", "Pongal", 3);
		//h.HotelList("Hotel0", "Dosa", 5);
		
		//h.tax(1000);
		h.discount(5200);
	

	}

}
