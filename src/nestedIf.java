
public class nestedIf {

	public static void main(String[] args) {
		int age = 20;
		boolean hasId = true;
		if(age>=18) {
			 if(hasId) {
				System.out.println("You can enter"); 
			 }else {
				 System.out.println("ID required!"); 
			 }
		}else {
			System.out.println("You are not allowed to enter."); 
		}

	}

}
