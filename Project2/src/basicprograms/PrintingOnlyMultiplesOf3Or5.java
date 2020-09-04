package basicprograms;

public class PrintingOnlyMultiplesOf3Or5 {
	static int print(int i) {
		if(i>50)
			return 0;
		if(i%3==0||i%5==0)
			System.out.print(i+" ");
		i++;
		return print(i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		//using for loop
				/*for(int i=0;i<=50;i++) {
			if(i%3==0||i%5==0)
				System.out.print(i+" ");
		}*/
		//using while loop
		/*int i=0;
		while(i<=50) {
			if(i%3==0||i%5==0)
				System.out.print(i+" ");
			i++;
		}*/
			//using do while loop
				/*int i=0;
				do {
					if(i%3==0||i%5==0)
						System.out.print(i+" ");
					i++;
				}
				while(i<=50);*/
		//using recursion 
				int i=0;
				PrintingOnlyMultiplesOf3Or5.print(i);
			
	}

}
