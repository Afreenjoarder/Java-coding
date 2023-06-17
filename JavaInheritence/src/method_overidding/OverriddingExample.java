package method_overidding;

class Person{
	String name;
	int age;
	
	void displayInformation() {
		System.out.println("Name  :"+name);
		System.out.println("Age  :"+age);
	}
}

 class Teacher extends Person{
	
	String qualification;
	
	//overridding
	void displayInformation() {
		System.out.println("Name  :"+name);
		System.out.println("Age  :"+age);
		System.out.println("Qualification  :"+qualification);
	}
}



public class OverriddingExample {

	public static void main(String[] args) {
		
		Teacher t1=new Teacher();
		t1.name="Aman";
		t1.age=30;
		t1.qualification= "M.sc in Eng";
		t1.displayInformation();
System.out.println();
		Person p1 =new Person();
		p1.name="Hasan";
		p1.age=40;
		p1.displayInformation();
		
		
	}

}
