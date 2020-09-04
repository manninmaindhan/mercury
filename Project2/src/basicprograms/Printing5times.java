package basicprograms;

public class Printing5times {
	static int print(int i,String a){
		if(i==0) 
			return 0;
		else {
			System.out.println(a);
			i--;
			
		}
		return print(i,a);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a="welcome to digital world";
Printing5times pt=new Printing5times();
int i=5;
pt.print(i,a);
//using for loop
/*for(int i=0;i<5;i++) {
	System.out.println(a);
}*/


//using while loop
/*while(i>0) {
	System.out.println(a);
	i--;
}*/
//using do while loop
/*do {
	System.out.println(a);
	i--;
}
while(i>0);*/
//using if condition

	
	}

}
