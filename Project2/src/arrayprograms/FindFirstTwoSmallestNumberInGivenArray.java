package arrayprograms;

public class FindFirstTwoSmallestNumberInGivenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] n= {12,32,44,22,56,22,9,100};
int fsn=n[0];
int ssn=0;
	for(int i=1;i<n.length;i++) {
		if(fsn>n[i]) {
			ssn=fsn;
			fsn=n[i];
			
		}
		else if(ssn>n[i]) {
			ssn=n[i];
		}
	}
	System.out.println("first smallest number is "+fsn+" second smallest number is "+ssn);
	}

}
