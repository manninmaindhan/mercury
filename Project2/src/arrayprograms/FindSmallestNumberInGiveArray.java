package arrayprograms;

public class FindSmallestNumberInGiveArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {15,2,3,4,5,6,0,8,9};
int min=a[0];
for(int i=1;i<a.length;i++) {
	
	if(a[i]<min) {
		int temp=a[i];
		a[i]=min;
		min=temp;
	}
}
System.out.println("smallest number in array is "+min);

	}

}
