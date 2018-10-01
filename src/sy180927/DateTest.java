package sy180927;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest
{

	public static void main(String[] args)
	{
		Date date = new Date();
		System.out.println(date);
		String df=DateFormat.getDateTimeInstance().format(date);
		System.out.println(df);
		String regex="yyyy-MM-dd HH:mm:ss";
		SimpleDateFormat sdf=new SimpleDateFormat();
		String fString=sdf.format(date);
		System.out.println(fString);

	}

}
