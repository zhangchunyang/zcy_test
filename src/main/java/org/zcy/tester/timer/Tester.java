package org.zcy.tester.timer;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by chunyang.zcy on 2015/11/5.
 */
public class Tester {
	public static void main(String args[]) throws ParseException {
		SimpleDateFormat dateFmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();

		System.out.println(dateFmt.parse("2015-11-18 11:00:00").getTime());
		System.out.println(date.getTime());
		System.out.println(dateFmt.format(date));
	}
}
