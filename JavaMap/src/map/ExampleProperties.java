package map;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
 

public class ExampleProperties {

	public static void main(String[] args) {
		
		Properties prop = new Properties();
			Set props;
	        String str;
	        
	      //Set the properties value
	    	prop.setProperty("database", "oracle10g");
	    	prop.setProperty("username", "system");
	    	prop.setProperty("password", "oracle");
	     
	    	//Get key set
	    	props = prop.keySet();
	    	
	    	//Print the properties
	        Iterator iterator = props.iterator();
	        while(iterator.hasNext()) {
	          str = (String) iterator.next();
	          System.out.println("Prpperty: " + str + ", Property Value: " + prop.getProperty(str));
	       }
	        

	}

}
