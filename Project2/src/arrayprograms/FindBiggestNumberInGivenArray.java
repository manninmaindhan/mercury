package arrayprograms;

public class FindBiggestNumberInGivenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {1,200,003,55,59,6,7,8};
int max=0;
for(int i=0;i<a.length;i++) {
	if(a[i]>max) {
		int temp=a[i];
		a[i]=max;
	max=temp;
	}
}
System.out.println("The max number in given array is :"+max);
	}

}
