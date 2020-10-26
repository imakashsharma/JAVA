package akashsharma;

public class polymorphism {
	void show()
	{
		System.out.println("Hello");
	}
	void show(String abc,int a)
	{
		System.out.println("Hi");
	}
static public void main(String[] args) {
	polymorphism a= new polymorphism();
	a.show();
	//polymorphism b= new polymorphism();
	//b.show("akash",10);
}
}
