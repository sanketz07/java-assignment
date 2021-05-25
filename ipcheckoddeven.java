import java.util.Scanner;

public class ipcheckoddeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		Scanner input= new Scanner(System.in);
        System.out.println("enter number:");
        num1=input.nextInt();
        if (num1%2==0)
        	System.out.println("number is even");
        else 
            System.out.println("number is odd");
        
	}

}
