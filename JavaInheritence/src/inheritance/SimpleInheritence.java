package inheritance;


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



public class SimpleInheritence {

	public static void main(String[] args) {
		Teacher t1 =new Teacher("Alok Hasan",30,"M.sc in IT");
		t1.work();
		t1.print1();
		t1.print2();
		

	}

}
