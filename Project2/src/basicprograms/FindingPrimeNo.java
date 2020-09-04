package basicprograms;

public class FindingPrimeNo {
/*static int print(int i) {
	 //if we need to find prime for below 20 numbers to change i<=20 and j<=20
	//if we need to find prime for below 100 numbers to change i<=100 and j<=100
while(i<=100) {
	if(i==100)
		return 0;
	
	int j=1;
    int count=0;
	while(j<=0) {
	if(i%j==0) {
		count++;
	}
	j++;
	}
	if(count==2||i==1)
		 System.out.print(i+" ");
i++;	
}
return i;


}*/
	static  int print(int i,int j,int count) {
		if(j>i) {
			return count;
		}
		if(i%j==0) {	
				count++;
		}
			j++;
		return print(i,j,count);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//using for loop
		/*
		 * for(int i=1;i<=100;i++) { int count=0;
		 * 
		 * for(int j=1;j<=100;j++) { if(i%j==0) count++; } if(count==2||i==1)
		 * System.out.print(i+" "); }
		 */
//using while loop
		/*
		 * int i = 1; while (i <= 100) { int count = 0; int j=1; while (j <= 100) { if
		 * (i % j == 0) count++; j++; } if (count == 2||i==1) System.out.print(i + " ");
		 * i++; }
		 */
//using do while loop
		/*int i = 1;

		do {
			int count = 0;
			int j = 1;
			do {
				if (i % j == 0)
					count++;
				j++;

			} while (j <= 100);
			if (count == 2 || i == 1)
				System.out.print(i + " ");
			i++;
		} while (i <= 100);*/
	//using recursion is bending you need to find solution for it!!!!!!!!
int i=1;

while(i<=100) {
	int l=1;
	int j=l;
	int count=0;
	if(i<2) {
		System.out.print(i+" ");
	}
	
 int k=FindingPrimeNo.print(i,j,count);
 if(k==2) {
System.out.print(i+" ");
 }
 i++;
}
		
	}

}
