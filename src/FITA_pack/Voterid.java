package FITA_pack;

public class Voterid {
	
	public void verfication(int age,String g)
	{
		
		if (age >=18)
		{
			if (g=="Indian") {
			System.out.println("You are  eligible for appalying voterid");
			}
			else
			{
				System.out.println("You are not eligible for appalying voterid because of Citizenship");
			}
		}
		else if (age <=18)
		{
			
			if (g=="Indian")
			{
				int a = 18-age;
			System.out.println("You are not eligible for appalying voterid you have to wait for "+a+" Years");
			}
			
			else
				{
					System.out.println("You are not eligible for appalying voterid because of Citizenship");
				}
		}
		}
					
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Voterid v=new Voterid();
		v.verfication(24,"Indian");

	}

}
