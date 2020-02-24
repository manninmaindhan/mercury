package mars1;

public class NeonNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=9,neon=0,rem=0;
		int no2=no*no;
		while(no2>0) {
			rem=no2%10;
			neon=neon+rem;
			no2=no2/10;
			
		}
		if(neon==no) {
System.out.println("neon");
	}
		else {
			System.out.println("not neon");
		}
}
}