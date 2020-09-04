package arrayprograms;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] a= {1,2,3,4,5,6,7,8,9};
for(int i=0;i<=a.length;i++) {
	if(a[i]==6) {
		System.out.println(a[i]+" I find the number at position "+i);
		break;
	}
}
	}

}
