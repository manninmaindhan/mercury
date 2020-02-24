package mars1;

public class GreatesCommonDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no1 = 30, no2 = 18;
		int small = no1 < no2 ? no1 : no2;
		int big = no1 > no2 ? no1 : no2;
		while (small >= 2) {
			if ((no1 % small == 0) && (no2 % small == 0)) {
				System.out.println("GCD IS " + small);
				break;
			}
			small--;
		}
	}

}
