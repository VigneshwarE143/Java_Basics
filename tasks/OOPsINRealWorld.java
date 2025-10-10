package tasks;


class  Details{
	static int age;
    static String name;
     protected void SetDetails(int age,String name){
 		this.age=age;
 		this.name=name;
 	}
 	 protected void SetName(String Name) {
 		this.name=name;
 	}
 	 protected void SetAge(int age) {
 		this.age=age;
 	}
	public static void GetDetails() {
		try {
			System.out.println("Name: "+name+"  Age: "+age);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
}
class Admin extends Details{
}

public class OOPsINRealWorld {
	
public static void main(String[] args) {
	Admin admin=new Admin();

	admin.SetDetails(18,"vicky");
	admin.GetDetails();
}
}
