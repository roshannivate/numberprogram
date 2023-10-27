package number_program;
import java.util.Scanner;
public class Number_classifier {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number:");
	double number=sc.nextDouble();
	if(number >0) {
		System.out.println("the number is positive.");
	}else if(number<0) {
		System.out.println("the number is negative.");
	}else {
		System.out.println("the number is zero");
	}

	}

}
