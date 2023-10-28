package FITA_pack;

public class Name {
	
	/*
	 * Get name
	 * check every char
	 * count same char
	 * 
	 */
	int a;
	public void getname(String name)
	{
		char[] c=name.toCharArray();;
		a=name.length();
		//System.out.println(a);
		for (char e:c) 
		{
			
		
			
			System.out.println(e);
			
		}
			
		
		
	}

	public static void main(String[] args) 
	{
		Name n=new Name();
		n.getname("Mahhessh");

	}

}
