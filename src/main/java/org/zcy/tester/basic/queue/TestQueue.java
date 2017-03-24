package org.zcy.tester.basic.queue;

import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.Queue;

class posQueue{
	
	//队列
	private Queue<Float> tqueue = new LinkedList<Float>();
	
	//队列最长长度
	public static final int MAXLENGTH = 8;
	
	//队列长度
	private int length = 0;
	
	//总值
	private float total = 0;
	
	//持续没有接受心跳包次数  (5秒一次)   接收置为0
	private int heartStopTime = 0;
	
	/**
	 * 向队列塞入一个值
	 */
	public void offer(float val){
		tqueue.offer(val);
		total += val;
		this.length+=1;
		this.heartStopTime = 0;
		//如果当前队列长度对于最大长度，把队列最前面的提出
		if(this.length > posQueue.MAXLENGTH){
			this.poll();
		}
	}
	
	/**
	 * 讲第一个值撤出
	 */
	public void poll(){
		float peekInteger = tqueue.peek();
		total -= peekInteger;
		tqueue.poll();
		this.length-=1;
	}
	
	/**
	 * 获取当前队列第一个值
	 * @return
	 */
	public float peek(){
		return tqueue.peek();
	}
	
	/**
	 * 获取当前的队列
	 * @return
	 */
	public Queue<Float> getQueqe(){
		return this.tqueue;
	}
	
	public float getTotal(){
		return this.total;
	}
	
	/**
	 * 获取平均值
	 * @return
	 */
	public float getAvg(){
		float avgVal = this.total/this.length;
		DecimalFormat  df = new DecimalFormat("#.##");  
		return Float.valueOf(df.format(avgVal));
	}
	
}

public class TestQueue {
	
	public static void main(String[] args) {
		
		//att.routeId,dev.latestBaiduLng,dev.latestBaiduLat,dev.licensePlateNumber,dev.latestSpeed,dev.device_id
		
		posQueue pq = new posQueue();
		pq.offer(1.11f);
		System.out.println("总的值:" + pq.getAvg());
		pq.offer(2);
		System.out.println("总的值:" + pq.getAvg());
		pq.offer(3);
		System.out.println("总的值:" + pq.getAvg());
		pq.offer(4);
		System.out.println("总的值:" + pq.getAvg());
		pq.offer(5);
		System.out.println("队列中的元素是:" + pq.getQueqe());
		System.out.println("总的值:" + pq.getAvg());
		pq.offer(6);
		System.out.println("队列中的元素是:" + pq.getQueqe());
		System.out.println("总的值:" + pq.getAvg());
		pq.offer(7);
		System.out.println("队列中的元素是:" + pq.getQueqe());
		System.out.println("总的值:" + pq.getAvg());
		pq.offer(8);
		System.out.println("队列中的元素是:" + pq.getQueqe());
		System.out.println("总的值:" + pq.getAvg());
		pq.offer(9);
		System.out.println("队列中的元素是:" + pq.getQueqe());
		System.out.println("总的值:" + pq.getAvg());
		pq.offer(10);
		System.out.println("队列中的元素是:" + pq.getQueqe());
		System.out.println("总的值:" + pq.getAvg());
		pq.offer(11);
		System.out.println("队列中的元素是:" + pq.getQueqe());
		System.out.println("总的值:" + pq.getAvg());
		pq.offer(12);
		System.out.println("队列中的元素是:" + pq.getQueqe());
		System.out.println("总的值:" + pq.getAvg());
		pq.offer(13);
		System.out.println("队列中的元素是:" + pq.getQueqe());
		System.out.println("总的值:" + pq.getAvg());
		pq.offer(14);
		System.out.println("队列中的元素是:" + pq.getQueqe());
		System.out.println("总的值:" + pq.getAvg());
	}
}
