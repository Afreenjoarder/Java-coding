package nested;
interface A{
	void show();
}

public class InterfaceAnnoymousExample {

	public static void main(String[] args) {
		A ob=new A()
				{
			public void show() {
				System.out.println("This is Annoymous Inner class for Interface");
			}
				};
			ob.show();
	}

}
