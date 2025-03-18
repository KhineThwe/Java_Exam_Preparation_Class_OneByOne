public class OOPLesson1 {
	
	public static int myMethod() {//return method
		int a = 1;
		int b=2;
		return a+b;
	}
	
	public static void myMethod1() {
		System.out.println("Hello World!");
	}
	
	public static int adding(int a,int b) {//paremeters
		//a = 2;b=3
		//5
		return a+b;
	}
 
	//main method
	public static void main(String[] args) {
		System.out.println(myMethod());
		myMethod1();//method call
		System.out.print(adding(2,3));//arguments
	}

}

//OOP
//1.Encapsulation
//hiding data inside an object 
//2.Abstraction --> 
//3.Inheritance
//4.Polymorphism - different forms
//Bird Class fly method
//Plane Class fly

//terms
//methods --> return method , void method --> call မှအလုပ်လုပ်တယ်။
//constructor --> class name နဲ့တူတဲ့ကောင် --> (parameters or arguments) --> default constructor 
//, parameterized constructor
//this
