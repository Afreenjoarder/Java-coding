package multilevel;



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
class UniversityProf extends Teacher{
	
	String universityName;
	
	UniversityProf(String name, int age, String qualification, String universityName) {
		
		super(name, age, qualification);
		this.universityName=universityName;
		
		
	}
	public void print3() {
		System.out.println("Professor's name is  :"+name+ "  Professor's age is  :"+age+"   Professor's Qualification is  :"+qualification);
		System.out.println("  Professor's University Name is   :"+universityName);
	}
	 
	
}




public class MultilevelInheritance {

	public static void main(String[] args) {
		
		UniversityProf up1= new UniversityProf("Md.Hasan", 40, "M.sc in Eng", "BUET");
		up1.work();
		up1.print3();
		
	}

}
