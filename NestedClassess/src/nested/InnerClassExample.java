package nested;

//outer class:
class Outer{
	public void show() {
		System.out.println("Showing outer class....");
	}
	//Member Inner class Method:
	/*
	class Inner{
		public void display() {
			System.out.println("Displaying Inner class....");
		}
	}*/
	//Member Inner class Method finish
	
	//Local Inner Class start:
	
	public void desp() {
		class LocalInner{
			public void displayLocal() {
				System.out.println("Displaying Local Inner class....");
			}
			
		}
		LocalInner n = new LocalInner();
		n.displayLocal();
	}
	//Local Inner class method finish:
	
	//Static Inner Class Example:
	
	static class Inner{
		public void display1() {
			System.out.println("Displaying Static Inner class....");
		}
	}
}
//Static Inner Class method finish

public class InnerClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//outer class object:
		
		//Outer ob=new Outer();
		//ob.show();
		//Anonymous Inner class :
		Outer ob1=new Outer()
				{
			public void show() {
				System.out.println("Showing Anonymous Inner class...");
			}
				};
				ob1.show();
				ob1.desp();
		
		
		//MemberInner Class object:
		//Outer.Inner obj1=ob.new Inner();///for inner class object declaration or non-static
		//obj1.display();
		
		//Static Inner class object:
				
	Outer.Inner obj2=new Outer.Inner();
		obj2.display1();
		
	}

	
}
