package mars1;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=1001,power=0,dec=0, rem=0;
		while(no>0) {
			rem=no%10;
			dec=(int)(dec+(rem*Math.pow(2,power)));
			no=no/10;
			power++;	
			
		}
System.out.println(dec);


	}

}
