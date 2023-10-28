package Zomato;



public class Price extends Hotel{
	int idly1,dosa1,price;
	
	
	public void price()
	{
		if(b=="A2B") 
		{
			int idlyprice=6,dosaprice=25;
			if(a=="Idly")
			{
				idly1=q*idlyprice;
				System.out.println("Price of idly is "+idly1);
				price=idly1;
			}
			else if(a=="Dosa")
			{
				dosa1=q*dosaprice;
				System.out.println("Price of idly is "+dosa1);
				price=dosa1;
			}
			
			
		}
		else if(b=="Sangeetha") 
		{
			int idlyprice=10,dosaprice=30;
			if(a=="Idly")
			{
				idly1=q*idlyprice;
				System.out.println("Price of idly is "+idly1);
			}
			else if(a=="Dosa")
			{
				dosa1=q*dosaprice;
				System.out.println("Price of idly is "+dosa1);
			}
			
			
		}
		
	
	}

}
