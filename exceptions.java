package akashsharma;

public class exceptions {
	public static void main(String args[])
	{
	Test obj=new Test();
	obj.r();
	System.out.println("Out of Program");
	}
	}
	class Test
	{
		void p() throws ArithmeticException
	{
			throw new ArithmeticException("Error occured");
	}
	void q() throws ArithmeticException
	{
		p();
	}
	void r() 
	{
	try
	{
		q();
	}
	catch(ArithmeticException e)
	{
	e.printStackTrace();
	}
	}
	}