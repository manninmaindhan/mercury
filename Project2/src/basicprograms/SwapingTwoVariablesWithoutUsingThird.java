package basicprograms;

public class SwapingTwoVariablesWithoutUsingThird {
public static void main(String[] args) {
	//swaping two variables
	/*int a=10;
	int b=15;
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println(a);
	System.out.println(b);*/
	//swaping three variables
	/*int a=10;
	int b=15;
	int c=20;
	a=a+b+c;
	b=a-(b+c);
	c=a-(b+c);
	a=a-(b+c);
	System.out.println(a);
	System.out.println(b);
System.out.println(c);*/
	//swaping four variables
	int a=10;
	int b=15;
	int c=20;
	int d=25;
	a=a+b+c+d;
	b=a-(b+c+d);
	c=a-(b+c+d);
	d=a-(b+c+d);
	a=a-(b+c+d);
	System.out.println(a);
	System.out.println(b);
System.out.println(c);
System.out.println(d);
}
}
