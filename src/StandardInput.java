import java.util.Scanner;

public class StandardInput {
	public static void main(String[] args) {
	    Scanner name = new Scanner(System.in);
	    System.out.println("Please enter your name");
	    String myName = name.next();
	    System.out.println("Your name is: "+myName);
	    
	    Scanner age = new Scanner(System.in);
	    System.out.println("Please enter your age");
	    //way 1 
//	    String myAge = age.next();
//	    int myAge1 = Integer.parseInt(myAge);
	    
	    //way 2
	    int myAge = age.nextInt();
	    System.out.println("Your age is: "+myAge);
	}  
}
