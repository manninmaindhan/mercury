package arrayprograms;

public class HowManyTimesGivenElementPresent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {1,2,3,4,5,1,2,3,3,4,4,4,6,7,7,8,9,};
for(int i=0;i<a.length;i++) {
	int count=1;
	for(int j=i+1;j<a.length;j++) {
		if(a[i]==a[j]) {
			count++;
			a[j]=-1;
		}
		
	}
	if(a[i]>0) {
	System.out.println(a[i]+" is present at "+count+" times");
}
	}
	}
}
