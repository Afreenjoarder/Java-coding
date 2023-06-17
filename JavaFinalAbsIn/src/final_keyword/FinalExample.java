package final_keyword;



class University {
	
	final String UNIVERSITY_NAME="DU";
	final int fees; //blank final variable;
	static final String subject; //static final variable
	
	University(){
		fees=4000;    //constructor declare blank final variable
	}
	
	static{
		subject="CSE";   ///static block declare static final variable value.
	}
	void display() {
		System.out.print("name :"+UNIVERSITY_NAME);
		System.out.print("  Fees :"+fees);
		System.out.print("  Subject :"+subject);
	}
}




public class FinalExample {

	public static void main(String[] args) {
		University ub=new University();
		ub.display();

	}

}
