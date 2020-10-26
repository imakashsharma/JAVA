package akashsharma;
class dynamicmorphism extends dynamicpoly 
 {
	void akash(String x)
	{
		System.out.println("Hello...");
	}
	public static void main(String[]args)
	{
		dynamicpoly a= new dynamicpoly();
	    a.akash("akash");
	    dynamicmorphism b= new dynamicmorphism();
	    b.akash("akash");
	    dynamicpoly c= new dynamicmorphism();
	    c.akash("akash");
	    
	    // here in the 3 statement i am calling the method of dynamicmorphism class thats why it  
	    //will print the output written in its method
	}
 }