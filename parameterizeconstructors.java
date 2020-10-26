package akashsharma;

public class parameterizeconstructors {
	String name;
	int id;
	parameterizeconstructors(String name,int id){
		this.name=name;
		this.id=id;
		
	}
	
public static void main(String []args) {
	parameterizeconstructors a1= new parameterizeconstructors("akash",1);
	parameterizeconstructors a2= new parameterizeconstructors("shubham",2);
	parameterizeconstructors a3= new parameterizeconstructors("abha",3);
	System.out.println("1 object:" +a1.name+" "+a1.id);
	System.out.println("2 object:" +a2.name+" "+a2.id);
	System.out.println("3 object:" +a3.name+" "+a3.id);
	

	
}
}

