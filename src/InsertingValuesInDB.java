import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class InsertingValuesInDB {
	
	 public static void main(String[] args) {
		 
		 // ===== In Java 5, Java.util,Scanner is used for this purpose. 
	        Scanner in = new Scanner(System.in);
	        System.out.print("Do you want to Insert a Employee  in DB ?  ");
	       String check = in.nextLine();
	       
	       if(check.equalsIgnoreCase("YES")) { 
	    	   
	    	    String employeeId  = in.nextLine();
	    	    System.out.println(employeeId);
	       }
	        System.out.println("You entered : " + check);
	 
		 
	    }
	
	
	
	

}
