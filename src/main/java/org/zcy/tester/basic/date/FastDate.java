package org.zcy.tester.basic.date;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class FastDate {
	
	private long timestamp;
	
	/**
	 * 默认构�?函数
	 */
	public FastDate(){
		timestamp = System.currentTimeMillis();
	}
	
	public String getTime(){
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
        return formatter.format(timestamp); //将日期时间格式化
	}
	
	public String getTime(String format){
        SimpleDateFormat formatter = new SimpleDateFormat(format);  
        return formatter.format(timestamp); //将日期时间格式化     
	}
	
	public Timestamp getNowTimestamp(){   
       Timestamp now = new Timestamp(timestamp);//获取系统当前时间
       return now;
	}
	
	public static Timestamp getMidNightTimestamp(){
		Calendar currentDate = new GregorianCalendar(); 
		currentDate.set(Calendar.HOUR_OF_DAY, 0);
		currentDate.set(Calendar.MINUTE, 0);
		currentDate.set(Calendar.SECOND, 0);
		return new Timestamp(currentDate.getTimeInMillis());//获取系统当前时间
	}
	
	public static Timestamp getOffsetTimestamp(Timestamp timeMillis, int monthOffset, int dayOffset){
		Calendar currentDate = new GregorianCalendar();
		currentDate.setTimeInMillis(timeMillis.getTime());
		currentDate.set(Calendar.MONDAY, currentDate.get(Calendar.MONDAY) + monthOffset);
		currentDate.set(Calendar.DAY_OF_MONTH, currentDate.get(Calendar.DAY_OF_MONTH) + dayOffset);
		return new Timestamp(currentDate.getTimeInMillis());//获取系统当前时间
	}
}
