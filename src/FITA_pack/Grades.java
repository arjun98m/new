package FITA_pack;

public class Grades {
	/*
	 * first get mark
	 * if 95+ grade
	 * else second grade
	 * result
	 */
	public void Result(double mark,String name){
		
		if (mark >= 95)
		{
			System.out.println(name +" your grade is A" );
			System.out.println(" Welldone" );
		}
		else if(mark >=80)
		{
			System.out.println(name +" your grade is B" );
		}
		else if(mark >=75)
		{
			System.out.println(name +" your grade is C" );
		}
		else if(mark >=50)
		{
			System.out.println(name +" your grade is D" );
		}
		else 
		{
			System.out.println(name +"you are fail need to Study well");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grades g= new Grades();
		g.Result(84, "Mahesh");
		g.Result(78, "Arjun");
		g.Result(51, "Sir");
		g.Result(49, "Mam");

	}

}
