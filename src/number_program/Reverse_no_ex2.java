package number_program;

public class Reverse_no_ex2 {

	public static void main(String[] args) {
	int number=128372,reverse=0;
	for(;number !=0;number=number/10) {
		int remainder=number%10;
		reverse=reverse*10+remainder;
	}
      System.out.println("the reverse of the given number:"+reverse);
	}

}
