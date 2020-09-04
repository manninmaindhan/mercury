package arrayprograms;

public class FindFirstTwoBiggestNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {1849,38765,3,5,6,1234,868576,9};

int fbn=0;
int sbn=0;
for(int i=0;i<a.length;i++) {
	if(fbn<a[i]) {
		sbn=fbn;
		fbn=a[i];
		
	}
	else if(sbn<a[i]) {
	sbn=a[i];
	}
	
}
System.out.println("first biggest "+fbn+" and second biggest "+sbn);
	}

}
