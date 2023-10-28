package FITA_pack;

public class Stringclas {
	String i;
	int a;
	public void name(String name)
	{
		a=name.lastIndexOf(".");
		i=name.substring(a);
		
		if (i.equals(".txt"))
		{
			System.out.println(name+" this is a textfile");
			
		}
		else if(i.equals(".xlsx"))
		{
			System.out.println(name+" this is a Excel file");
		}
		else if(i.equals(".json"))
		{
			System.out.println(name+" this is a Json file");
		}
		else 
		{
			System.out.println(name+" no Specifed file type");
			
		}
	}
	public static void main(String[] args)
	{
		Stringclas s=new Stringclas();
		s.name("Fita1.txt");
		s.name("Fita2.xlsx");
	}

}
