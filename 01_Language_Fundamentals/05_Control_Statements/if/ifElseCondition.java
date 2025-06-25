class ifElseCondition
{
	public static void main(String [] args)
	{
		
		//EX.1
		
		if(true)
		{
			System.out.println("Development");
		}
		else
		{
			System.out.println("Testing");
		}
		
		//EX.2
		
		int n = 14;
		if(n%2 == 0)
		{
			System.out.println("Even Number");
		}
		else
		{
			System.out.println("Odd Number");
		}
		
		//EX.3
		int age = 41;
		if(age >= 18)
		{
			System.out.println("Major");
		}
		else
		{
			System.out.println("Minor");
		}
		
		//EX.4
		
		double accBal = 10000.0;
		int amt = 3000;
		if(accBal <= amt)
		{
			System.out.println("Withdrawel Success");
		}
		else
		{
			System.out.println("Insufficient Amount");
		}
	}
}