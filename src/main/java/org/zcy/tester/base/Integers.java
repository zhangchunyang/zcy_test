package org.zcy.tester.base;

public class Integers {

	public static void main(String args[]){
//		int x = 3;
//		int y = 3;
//		System.out.println(x == y);
//		
//		Integer integerX = new Integer(3);
//		Integer integerY = new Integer(3);
//		System.out.println(integerX);
//		System.out.println(integerX == integerY);
//		System.out.println(integerX.equals(integerY));
//		System.err.println(integerX == 3);
		
		int total = 2100000;
		int rentNum = 0;
		// 最多遍历的个数  条件一：等于参与摇号的租赁个数
		for (int i = 0; i < total; i++) {
			//最多遍历的个数  条件二：被分配的个数不能大于参与摇号的车位的总数
			if(rentNum < 700000){
				long rom = Math.round(Math.random() * (total - i - 1));
				System.out.println(rom);
				total--;
				rentNum++;
				continue;
			}
			System.out.println("get out");
			break;
		}
		
		
		
	}
}
