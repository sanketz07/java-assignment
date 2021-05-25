import java.util.Scanner;
public class Checkmax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enternum 1");
	    a=sc.nextInt();
	    System.out.println("enternum 2");
	    b=sc.nextInt();
	    System.out.println("enternum 3");
	    c=sc.nextInt();
	    if(a>b&&a>c) 
	    	System.out.println("gretest number is:"+a);	
	    else if (a>c&&a>b)
	    	System.out.println("gretest number is:"+a);
	    else if (b>c&&b>a)
	    	System.out.println("gretest number is:"+b);
	    else if (b>a&&b>c)
	    	System.out.println("gretest number is:"+b);
	    else if (c>a&&c>a)
	    	System.out.println("gretest number is:"+c);
	    else if (c>b&&c>a)
	    	System.out.println("gretest number is:"+c);
	    
	}

}
