package hierarchical;

class Person{
	String name;
	int age;
	
	public void work() {
		System.out.println("Person can work.....");
	}
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	public void print1() {
		System.out.println("Person's name  :" + "  Person's age   :");
	}
}

class Teacher extends Person{

	 String qualification;
	 
	Teacher(String name, int age,String qualification) {
		
		super(name, age);
		this.qualification=qualification;
		
	}
	public void print2() {
		System.out.println("Teacher's name is  :"+name+ "  Teacher's age is  :"+age+ " " +"   Teacher's Qualification is  :"+qualification);
	}
	 
}

class Doctor extends Person{
	
	String specialistDept;
	
	Doctor(String name, int age,String specialistDept ) {
		super(name, age);
		this.specialistDept=specialistDept;
	}

	public void print4() {
		System.out.println("Doctor's name is  :"+name+ "  Doctor's age is  :"+age+ " " +"   Doctor is a specialist of  :"+specialistDept);
	}
	
}

public class InheritanceHierarchical {

	public static void main(String[] args) {
		Doctor d= new Doctor("Dr.Mehedi Hasan", 38, "Medicine");
		d.work();
		d.print4();

	}

}
