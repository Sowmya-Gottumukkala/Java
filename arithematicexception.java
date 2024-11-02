//program to handle arithematic exception
class ArthimeticException
{
	public static void main(String args[])
	{
		int a=100,b=0,c;
		try
		{
			c=a/b;
		}
		catch(ArithmeticException ae)
		{
			System.out.println("divided by zero statement ");
		}
	}
}