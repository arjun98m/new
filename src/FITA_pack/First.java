package FITA_pack;

public class First 
{
	
	public void name(String name,Double dateofjoining, String mailid)
	{
		System.out.println(name);
		System.out.println("Date of joining"+ dateofjoining);
		System.out.println(mailid);
		
	}
	
	public void name1()
	{
		System.out.print("Arjun  ");
		System.out.print("Date of joining 09/09/23");
		System.out.print("  fita@gmail.com");
		
	}

	public static void main(String[] args) 
	{
		First f = new First();
		f.name("Mahesh", 09.09-23, "fita1.com");
		f.name1();
		
		

	}

}
