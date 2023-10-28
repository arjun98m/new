package FITA_pack;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class handeling {

	String filepath = "C:\\Users\\Arjun\\eclipse-workspace\\FITA\\TEXT\\";
	String filename = "Data.properties";
	
	public void readdata() throws IOException
	{
		double total,price;
		
		File f=new File(filepath+filename);
		FileInputStream FI = new FileInputStream(f);
		Properties ps =new Properties();
		ps.load(FI);
		String a= ps.getProperty("Hotelname");
		String b= ps.getProperty("Items");
		String c= ps.getProperty("Qty");
		price=Integer.valueOf(c);

		//System.out.println(a);
		if (a.equalsIgnoreCase("A2B"))
	
		{
			System.out.println("This is A2B");
			if(b.equalsIgnoreCase("idly"))
			{
				int idly=10;
				total=price*idly;
				System.out.println("You bought "+c+" Idly");
				
				System.out.println("Price is "+total);
			}
			else if(b.equalsIgnoreCase("dosa"))
			{
				int dosa=30;
				total=price*dosa;
				System.out.println("You bought "+c+" Dosa");
				
				System.out.println("Price is "+total);
			}
			
			System.out.println();
			
		}
		else {
			System.out.println("Hotel is not available");
		}
		//System.out.println(ps.getProperty("Name"));
		//System.out.println(ps.getProperty("Hotelname"));
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		handeling h= new handeling();
		h.readdata();

	}

}
