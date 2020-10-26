package akashsharma;

public class interfacesing  implements interfaces,interfaces2{
	public void show() {
		System.out.println("1");
	}
	public void display() {
		System.out.println("2");
	}
	public static void main(String[] args) {
		interfacesing a= new interfacesing();
		a.show();
		interfacesing b = new interfacesing();
		b.display();
	}
	

}
