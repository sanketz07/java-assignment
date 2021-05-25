
public class compoundintrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int principal = 20000;
           double compoundedannualy = 0.06;
           int timeinyear = 3;
           
          double  compoundamount,compoundintrest;
           
          compoundamount = principal*Math.pow(1+(0.06/12), 12*3);
        System.out.println("copound amound="+compoundamount); 
        compoundintrest = compoundamount - principal;
        System.out.println("copound intrest="+compoundintrest);
	}

}
