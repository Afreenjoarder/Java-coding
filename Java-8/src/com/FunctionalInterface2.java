package com;


@FunctionalInterface
interface MyFunctionalInterface {
    void show();
    
    public static void print(){
    	System.out.println("Print is a static method!");
    } 
	
    public default void write(){
    	System.out.println("Write is a static method!");
    } 
}



public class FunctionalInterface2 {
	
	public static void main(String[] args) {
	
//		MyFunctionalInterface obj= new MyFunctionalInterface()
//	
//		
//		{
//			public void show() {
//				System.out.println("Show is a abstract method!");
//				
//			}
				MyFunctionalInterface lamda= ()-> System.out.println("Show is a abstract method!");
			
					
			
				lamda.show();
				lamda.write();
				
		
	}
		
	//obj.show();
	//obj.write();
		
//	MyFunctionalInterface.print();
	
	
}
	
