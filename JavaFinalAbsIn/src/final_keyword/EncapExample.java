package final_keyword;

class College{
	private String name;
	private int fees;
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setFees(int fees) {
		this.fees=fees;
	}
	
	public int getFees() {
		
		return fees;
	}
}



public class EncapExample {

	public static void main(String[] args) {
		
		College uv=new College();
		uv.setName("DU");
		uv.setFees(5400);
		System.out.println(uv.getName());
		System.out.println(uv.getFees());
		

	}

}
