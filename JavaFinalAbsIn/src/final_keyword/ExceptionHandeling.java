package final_keyword;

public class ExceptionHandeling {

	public static void main(String[] args) {
		
		try {
			
			int x=10;
			int y=0;
			int result=x/y;
			System.out.println("Result  :"+result);
			
		}catch(Exception e1){
			System.out.println("Exception  :"+e1);
		}
		
		System.out.println("Last line of the program"); //It will always execute.
	}

}
