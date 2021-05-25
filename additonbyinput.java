import java.util.Scanner;

public class additonbyinput {

	public static void main(String[] args) {
		int num1, num2;
		int result;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no.1");
		num1=sc.nextInt();
		System.out.println("enter no.2");
		num2=sc.nextInt();
		result=num1+num2;
		System.out.println("addition:"+result);
	}

}
