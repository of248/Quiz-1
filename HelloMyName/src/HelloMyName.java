import java.lang.String;
import java.util.Scanner;

public class HelloMyName {

public static void main(String [] args ){
	
	Scanner keyboard = new Scanner (System.in);
	
	String name;
	String password;
	
	
	System.out.println("What is your username?");
	name = keyboard.nextLine();
	
	System.out.println("What is your password?");
	password = keyboard.nextLine();
	
	System.out.println("Hello " + name);
	System.out.println("welcome to CSC 201!");
	System.out.println("your password is" + password);
	keyboard.close();
	
}
}
