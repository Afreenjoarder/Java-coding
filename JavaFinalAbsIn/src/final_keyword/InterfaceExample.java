package final_keyword;


 interface Animal {

 public abstract void eat();
}

 class Dog implements Animal{
	public	void eat() {
		System.out.println("Dog can eat meat");
	}
}


public class InterfaceExample {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.eat();

	}

}
