package mars1;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=153,rem=0,sum=0,armstrong=0,no2=no;
		while(no>0) 
		{
			rem=no%10;
			armstrong=armstrong+(rem*rem*rem);
			no=no/10;
		}
if(no2==armstrong)
{
	System.out.println("ARM");
}
	}

}
