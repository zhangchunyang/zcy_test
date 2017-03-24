package org.zcy.tester.base;

//��������Ͳ���
//�����Ϳ��Է�Ϊ���࣬�ַ�����char����������boolean�Լ���ֵ����byte��short��int��long��float��double��
public class Basic {
	 public static void main(String[] args) {  
	        // byte
		 	byte xByte = 127;
		 	System.out.println(xByte);
	        System.out.println("�����ͣ�byte ������λ��" + Byte.SIZE);  
	        System.out.println("��װ�ࣺjava.lang.Byte");  
	        System.out.println("��Сֵ��Byte.MIN_VALUE=" + Byte.MIN_VALUE);  
	        System.out.println("���ֵ��Byte.MAX_VALUE=" + Byte.MAX_VALUE);  
	        System.out.println();  
	  
	        // short
	        short xShort = 32767;
	        System.out.println(xShort);
	        System.out.println("�����ͣ�short ������λ��" + Short.SIZE);  
	        System.out.println("��װ�ࣺjava.lang.Short");  
	        System.out.println("��Сֵ��Short.MIN_VALUE=" + Short.MIN_VALUE);  
	        System.out.println("���ֵ��Short.MAX_VALUE=" + Short.MAX_VALUE);  
	        System.out.println();  
	  
	        // int
	        int xInt = 2147483647;
	        System.out.println(xInt);
	        System.out.println("�����ͣ�int ������λ��" + Integer.SIZE);  
	        System.out.println("��װ�ࣺjava.lang.Integer");  
	        System.out.println("��Сֵ��Integer.MIN_VALUE=" + Integer.MIN_VALUE);  
	        System.out.println("���ֵ��Integer.MAX_VALUE=" + Integer.MAX_VALUE);  
	        System.out.println();  
	  
	        // long
	        long xLong = 54775807;
	        System.out.println(xLong);
	        System.out.println("�����ͣ�long ������λ��" + Long.SIZE);  
	        System.out.println("��װ�ࣺjava.lang.Long");  
	        System.out.println("��Сֵ��Long.MIN_VALUE=" + Long.MIN_VALUE);  
	        System.out.println("���ֵ��Long.MAX_VALUE=" + Long.MAX_VALUE);  
	        System.out.println();  
	  
	        // float
	        float xFloat = 323.453434f;
	        System.out.println(xFloat);
	        System.out.println("�����ͣ�float ������λ��" + Float.SIZE);  
	        System.out.println("��װ�ࣺjava.lang.Float");  
	        System.out.println("��Сֵ��Float.MIN_VALUE=" + Float.MIN_VALUE);  
	        System.out.println("���ֵ��Float.MAX_VALUE=" + Float.MAX_VALUE);  
	        System.out.println();  
	  
	        // double
	        double xDouble = 3232.343434;
	        double xDouble2 = 3232.343435d;
	        double xDouble3 = 3232.343436D;
	        System.out.println(xDouble);
	        System.out.println(xDouble2);
	        System.out.println(xDouble3);
	        System.out.println("�����ͣ�double ������λ��" + Double.SIZE);  
	        System.out.println("��װ�ࣺjava.lang.Double");  
	        System.out.println("��Сֵ��Double.MIN_VALUE=" + Double.MIN_VALUE);  
	        System.out.println("���ֵ��Double.MAX_VALUE=" + Double.MAX_VALUE);  
	        System.out.println();  
	  
	        // char
	        char xChar = 'd';
	        System.out.println(xChar);
	        System.out.println("�����ͣ�char ������λ��" + Character.SIZE);  
	        System.out.println("��װ�ࣺjava.lang.Character");  
	        // ����ֵ��ʽ�����ַ���ʽ��Character.MIN_VALUE���������̨  
	        System.out.println("��Сֵ��Character.MIN_VALUE="  
	                + (int) Character.MIN_VALUE);  
	        // ����ֵ��ʽ�����ַ���ʽ��Character.MAX_VALUE���������̨  
	        System.out.println("���ֵ��Character.MAX_VALUE="  
	                + (int) Character.MAX_VALUE);  
	    }  
}

