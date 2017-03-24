package org.zcy.tester.basic.date;

import java.sql.Timestamp;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class testIt {

	public static void main(String[] args) throws ParseException {
//		 FastDate fastDate = new FastDate();
		 
		 String time = "20130918094110";
		 Format f = new SimpleDateFormat("yyyyMMddHHmmss");
		 Date d = (Date) f.parseObject(time);
		 Timestamp ts = new Timestamp(d.getTime());
		 System.out.println(ts.toString());
//		 System.out.println(ts.getTime());
//		 System.out.println(fastDate.getNowTimestamp().getTime());
//		 if(fastDate.getNowTimestamp().getTime() > ts.getTime()){
//		 System.out.println("big");
//		 return;
//		 }
//		 System.out.println("small");

//		 String str="2013-08";
//		 str+="-01 00:00:00";
//		 SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		 Date date =sdf.parse(str);
//		Calendar calendar = Calendar.getInstance();
//		calendar.set(Calendar.DAY_OF_MONTH, 1);
//		calendar.set(Calendar.HOUR_OF_DAY, 0);
//		calendar.set(Calendar.MINUTE, 0);
//		calendar.set(Calendar.SECOND, 0);
//		Timestamp stime = new Timestamp(calendar.getTimeInMillis());
//		System.out.println(stime.toString());
//		calendar.set(Calendar.MONTH, calendar.get(Calendar.MONTH) + 1);
//		Timestamp etime = new Timestamp(calendar.getTimeInMillis());
//		System.out.println(etime.toString());

	}

}
