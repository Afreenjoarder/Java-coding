package final_keyword;


//Abstract:
 abstract class MobileUser{
	abstract void sendMessage();
}
 
 class Karim extends MobileUser{
	 
	 void sendMessage() {
		 System.out.println("Hi, I am Karim");
	 }
 }
 
class Rahim extends MobileUser{
	 
	 void sendMessage() {
		 System.out.println("Hi, I am Rahim");
	 }
 }
 
 

public class AbstractExample {

	public static void main(String[] args) {
		MobileUser mu;
		mu=new Karim();
		mu.sendMessage();
		
		
		mu=new Rahim();
		mu.sendMessage();
		

	}

}
