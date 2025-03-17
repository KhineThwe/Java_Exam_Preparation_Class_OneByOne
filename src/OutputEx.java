import java.util.Date;

public class OutputEx {
	public static void main(String[] args) {
		String s1="Object Oriented ";

		s1.concat("Programming");

		System.out.println(s1);

		s1=s1.concat("Programming");

		System.out.println(s1);//Object Oriented Programming

		System.out.println(s1.replace('e', '@'));

		String s2="object Oriented Programming";

		System.out.println(s1.equalsIgnoreCase(s2));
		
		String s3 = "Expresso";
		
		System.out.println(s3.substring(6,8));
		System.out.println(s3.length());
		System.out.println(s3.indexOf("p"));
		System.out.println(s3.indexOf("Me"));
		//System.out.println(s3.substring(3,4));
		//System.out.println(s3.substring(4,2));
		
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		System.out.println(cars[1]);//BMW
//		System.out.println(cars[-1]);//error
//		System.out.println(cars[-2]);//error
		
		Date today = new Date( );
		System.out.println(today);
		System.out.println(today.toString( ));

		} 
}



