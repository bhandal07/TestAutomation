package test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileoperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  FileOutputStream fileOutputStream;
	        
	        try
	        {
	            fileOutputStream = new FileOutputStream("/home/bhandal07gmail/Documents1/abc.txt");
	            String msg = "Welcome to java!";   
	            
	            byte byteArray[] = msg.getBytes(); //converting string into byte array 
	            
	            fileOutputStream.write(byteArray);  
	            
	            System.out.println("Message written to file successfuly!");  
	        }
	         
	        catch (FileNotFoundException e)
	        {
	            // TODO Auto-generated catch block
	        	  System.out.println("check ur path!");
	           // e.printStackTrace();
	        }
	        catch (IOException e) {
	            // TODO Auto-generated catch block
	        	  System.out.println("IO Exception!");
	            //e.printStackTrace();
	        }
	 
	        finally
			{
				System.out.print("All catch executed");
			}

	}

}
