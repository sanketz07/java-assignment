import java.util.Scanner;

public class Sumtilln {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter number:");
		int num = sc.nextInt();
		System.out.println("num="+num);
       int sum=0;
		
       for(int i=0; i<=num; i++)
		{
		  sum = sum+i;
		 
		} 
	
		System.out.println("sum of series till:"+num+"is :"+sum);
	
	}

}
