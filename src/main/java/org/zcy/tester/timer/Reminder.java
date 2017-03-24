package org.zcy.tester.timer;

import java.util.Date;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Simple demo that uses java.util.Timer to schedule a task to execute
 * once 5 seconds have passed.
 */
//每一个Timer仅对应唯一一个线程。
//		Timer不保证任务执行的十分精确。
//		Timer类的线程安全的。
public class Reminder {

	public static Timer timer;

	public Reminder(int seconds) {
		timer = new Timer();
		//1、第二个参数表示开始执行前的延时时间（单位是milliseconds，这里定义了5000）。
//		timer.schedule(new RemindTask(), seconds*1000);
		timer.schedule(new RemindTask(), seconds*1000, seconds*1000);
		//2、还有一种方法可以指定任务的执行时
		//Get the Date corresponding to 11:01:00 pm today.
//		Calendar calendar = Calendar.getInstance();
//		calendar.set(Calendar.HOUR_OF_DAY, 17);
//		calendar.set(Calendar.MINUTE, 58);
//		calendar.set(Calendar.SECOND, 0);
//		Date time = calendar.getTime();
		//schedule 说白了，这个方法更注重保持间隔时间的稳定。
//		timer.schedule(new RemindTask(), time);
		//scheduleAtFixedRate 说白了，这个方法更注重保持执行频率的稳定。
//		timer.scheduleAtFixedRate(new RemindTask(), time, time);

	}

	class RemindTask extends TimerTask {
		public void run() {
			System.out.println("Time's running");
		}
	}

	public static void main(String args[]) {
		System.out.println("About to schedule task.");
		new Reminder(1);
		System.out.println("Task scheduled!");
//		关闭
//		Reminder.timer.cancel();
//		System.out.println("Task si up!");

	}
}
