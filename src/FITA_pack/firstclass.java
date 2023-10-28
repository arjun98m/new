package FITA_pack;

public class firstclass {
	int c;
	public firstclass() {
		System.out.println("This is constructor");
		
	}

	public void add1(int a,int b)
	{
		c=a+b;
		System.out.println(c);
	}
		
	public void sub(int a,int b)
	{
		c=a-b;
		System.out.println(c);

	}
		
		//1. method with out parameter /arguments
		//2. method with paramters /arguments
		
		//3.method with return type
		//4.method with out return type
		public void name(String name, int a)
		{
			System.out.println("i am "+name+" name");
			System.out.println(a);
		}
		
		public void Add()
		{
		//System.out.println(a);
			System.out.println("Addition");
		}
		
		public void AddWithParameter(String name,int days)
		{
			//System.out.println(a);
			
			System.out.println(name);
			System.out.println("You have joined "+days +" back");
		}

		public double DiscountAmoiunt(int amount,double discoutpercentage)
		{
			double discountAmount = amount*discoutpercentage;
			return discountAmount;
		}
		
		public void ActualAmount(int amount , double discoutpercentage)
		{
			double discAmount = DiscountAmoiunt(amount,discoutpercentage);
			double actualAmount = amount-discAmount;
		System.out.println(actualAmount);	
		}

		public static void main(String[] a) 
		{
			//System.out.println("Name is Arjun");
			firstclass F = new firstclass();
			//F.name("Arjun",86);
			F.add1(10, 4);
			F.sub(10, 5);
			
			//F.Add();
			//F/.AddWithParameter("Welcome to FITA",30);
			//F.Add();
			//F.ActualAmount(1000, 0.15);
			//F.ActualAmount(1000, 0.18);
		}

	
}
