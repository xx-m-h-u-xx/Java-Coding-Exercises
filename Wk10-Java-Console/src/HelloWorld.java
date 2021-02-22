import java.util.Scanner;
public class HelloWorld {

	public static void main(String[] args) {
		
		String name;
		int age;
		float height;
		
		System.out.print("Hello ");
		System.out.println("World");
		
		Scanner in = new Scanner (System.in);
		System.out.print("Enter your Name: ");
		name=in.nextLine();
		System.out.print("Enter your Age: ");
		age=in.nextInt();
		System.out.print("Enter your Height: ");
		height=in.nextFloat();
		in.close();
		
		System.out.print("My name is "+name+ "I'm "+age+ "I am "+height);
	}

}
