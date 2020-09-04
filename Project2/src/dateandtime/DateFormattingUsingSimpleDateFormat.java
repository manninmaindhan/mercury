package dateandtime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormattingUsingSimpleDateFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Date dNow=new Date();
SimpleDateFormat ft=new SimpleDateFormat("E YYYY:MM:dd 'at' hh:mm:ss a zzz");
System.out.println("Current Date: "+ft.format(dNow));*/
	/*	//instantiate a date object 
		Date date=new Date();
		//display time and date
		String str=String.format("Current Date/time : %tc",date);
		System.out.println(str);*/
		//instantiate a date object
		Date date =new Date();
		//display time and date
		System.out.printf("%1$s %2$tB %2$td ,%2$tY ","Due date:", date);
	}

}
