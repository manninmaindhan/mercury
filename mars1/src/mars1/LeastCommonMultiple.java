package mars1;

public class LeastCommonMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no1 = 2, no2 = 3;
		int small = no1 < no2 ? no1 : no2;
		int big = no1 > no2 ? no1 : no2;
		int bigcount=big;
		while (true) {
			if (big % small == 0) {
				System.out.println("LCM IS " + big);
				break;
			}
			big=big+bigcount;
		}
	}

}
