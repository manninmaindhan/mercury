package dateandtime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AmandPm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Date date=new Date();
String strdateformat ="HH:MM:ss a";
SimpleDateFormat sdf=new SimpleDateFormat(strdateformat);
System.out.println(sdf.format(date));
}

}
