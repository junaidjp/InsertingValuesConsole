import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.training.hibernate.HibernateSessionFactory;
import com.training.hibernate.UserBean;


public class InsertingValuesInDB {
	
	 public static void main(String[] args) {
		 
		 // ===== In Java 5, Java.util,Scanner is used for this purpose. 
	        Scanner in = new Scanner(System.in);
	        System.out.print("Do you want to Insert a new User   in DB ?  ");
	       String check = in.nextLine();
	       UserBean userBean = null;
	       if(check.equalsIgnoreCase("YES")) { 
	    	   System.out.println("Enter the employee Id");
	    	    String employeeId  = in.nextLine();
	    	    
	    		System.out.println("                                                       ");
	    	    userBean = new UserBean();
	    	    userBean.setId(Integer.parseInt(employeeId));
	    	    
	    	    System.out.println(employeeId);
	    	    
	    	    System.out.println("Enter  the employee Name ");
	    	    String username = in.nextLine();
	    		System.out.println("                                                       ");
	    	    System.out.println(username);
	    	    
	    	    userBean.setUsername(username);
	    	    
	    	    System.out.println("Enter  the employee password");
	    	   String password = in.nextLine();
	    		System.out.println("                                                       ");
	    	    System.out.println(password);
	    	    
	    	    userBean.setPassword(password);
	    	    
	       }
	       
	       SessionFactory sessionFactory = HibernateSessionFactory.getSessionFactory();
	       Session session = sessionFactory.openSession();
	       session.beginTransaction();
	       session.save(userBean);
	       session.getTransaction().commit();
	       session.close();
	      System.out.println("Value Entered in DB");
	 
		 
	    }
	
	
	
	

}
