package arrayprograms;

public class PlacingGivenNumberInLastIndexOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] a= {1,2,3,4,5,6,7,8,9};

for(int i=0;i<a.length;i++) {
	if(a[i]==3) {
		int temp=a[a.length-1];
		a[a.length-1]=a[i];
		a[i]=temp;
	}
	System.out.print(a[i]+" ");
}
//for(int i=0;i<a.length;i++) {
	
//}
	}

}
