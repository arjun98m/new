package FITA_pack;

public class loops {
	int i=100,d;
	/*
	 * start with my number
	 * print in reverse 
	 * stop the ececution after 5 number printed
	 * no need to show multipels of 5
	 */
	
	public void get(int a,int max)
	{
		int last=a-max;//last is for last number
		for (i=a;i>=last+1;i--)
		{
			
			//System.out.println(i);
			if(i %5 != 0)
			{
				System.out.println(i);
				continue;
			}
		}
		
		
		//	if (i==last)
			//{
		//		break;
			//}
		
		/*while(i>=a)
		{
			System.out.println(i);
			i--;
			
		//	if(a==)
			//{
				//break;
			//}
			
		}*/
	}

	public static void main(String[] args) {
		
		loops l= new loops();
		l.get(100,95);

	}

}
