package akashsharma;

public class abstractscooter extends abstractvehicle  {
	int numberofwheels=2;
	void start() {
		System.out.println("Starts with Kick");
	}
	public static void main(String[] args) {
		abstractcar a=new abstractcar();
		a.start();
		abstractscooter b= new abstractscooter();
		b.start();
		
	}

}
