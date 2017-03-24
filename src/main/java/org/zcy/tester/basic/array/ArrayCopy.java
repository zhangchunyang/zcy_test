package org.zcy.tester.basic.array;


public class ArrayCopy {

	public static void main(String[] args) {
		
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = new int[5];
		//��ʽһ
		System.out.println("��ʽһ");
		for (int i = 0; i < arr1.length; i++)
			arr2[i] = arr1[i];

		for (int i = 0; i < arr2.length; i++)
			System.out.print(arr2[i] + " ");
		System.out.println();
		
		//��ʽ
		System.out.println("��ʽ��");
		int[] arr3 = new int[5];
		System.arraycopy(arr1, 0, arr3, 0, arr1.length);
		for (int i = 0; i < arr3.length; i++)
			System.out.print(arr3[i] + " ");
		System.out.println();
	}
}
