package final_keyword;


 class Person{
	private String name;
	private int age;
	
	
/*void display() {
	System.out.println("Name  :"+name);
	System.out.println("Age  :"+age);
}
}*/

public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}

 }
public class ExampleEncapsulation {

	public static void main(String[] args) {
		Person p=new Person();
		p.setName("Afsana K");
		p.setAge(30);
		System.out.println(p.getName());
		System.out.println(p.getAge());
		
		//p.display();
	

}
 }
