package org.zcy.tester.base;

public class Strings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String weweString = "����Ǽ�λ";
//		System.out.println(StringEscapeUtils.e());
		
//	    String specialStr = "<div id=\"testDiv\">test1;test2</div>";   
//        String str1 = StringEscapeUtils.htmlEscape(specialStr); ��ת��ΪHTMLת���ַ��ʾ   
//        System.out.println(str1);   
//          
//        String str2 = HtmlUtils.htmlEscapeDecimal(specialStr); ��ת��Ϊ���ת���ʾ   
//        System.out.println(str2);   
//          
//        String str3 = HtmlUtils.htmlEscapeHex(specialStr); ��ת��Ϊʮ��������ת���ʾ   
//        System.out.println(str3);   
//		testString();
	}
	
	
	private static void testString(){
		String a = "a"; // �ڳ��д���ֵ"a"     ���ص�ַ���a
		String b = "a"; //���ӳ���Ѱ��"a"ֵ�ĵ�ַ�����ظ�b   û���ٴ���
		System.out.println(a == b);
		System.out.println(a.equals(b));
		
		System.out.println("----------�����ķָ���---------");
		
		String c = new String("a"); //����c���󣬴����µ����õ�ַ����ֵ��ֵ"a"�����õ�ַ   
		String d = new String("a");//����d����,�����µ����õ�ַ����ֵ��ֵ"a"�����õ�ַ
		System.out.println(c == d);
		System.out.println(a == d);
		System.out.println(c.equals(d));
		//ע��  �����4������ a  b  c  d �����õ�ַ����"a"�ĵ�ַ��һ��ġ�
		
		/*
		 * ԭ�������������е�ʱ��ᴴ��һ���ַ���ص�ʹ�� s2 = "Monday" 
		 * ����ı���Ǵ����ַ��ʱ�򣬳������Ȼ������String�������Ѱ����ֵͬ�Ķ���
		 * �ڵ�һ�������У�s1�ȱ��ŵ��˳��У�������s2��������ʱ��
		 * �����ҵ��˾�����ֵͬ�� s1�� s2 ���� s1 �����õĶ���"Monday"�ڶ��γ����У�
		 * ʹ���� new �����������׵ĸ��߳��򣺡���Ҫһ���µģ���Ҫ�ɵģ���
		 * ����һ���µ�"Monday"Sting���󱻴������ڴ��С����ǵ�ֵ��ͬ������λ�ò�ͬ��һ���ڳ�����Ӿһ���ڰ�����Ϣ��
		 * ��ѽ��������Դ�˷ѣ�������һ��ķ�Ҫ�ֿ���ʲô�أ� */
		
		
		System.out.println("----------�����ķָ���---------");
		System.out.println("����String��intern");
		
		String s1 = "Monday"; //����һ��"Monday"��ֵ�����õ�ַ��s1
        String s2 = new String("Monday");//�����ҵ�"Monday"�����õ�ַ�����Ҵ���һ���µĵ�ַ��Ÿ����õ�ַ
        s2 = s2.intern(); //�����Ѿ���һ�����ڴ� String ������ַ��� equals(Object) ����ȷ�������򷵻س��е��ַ�
        if (s1 == s2) 
            System.out.println("s1 == s2"); 
        else 
            System.out.println("s1 != s2"); 
        if (s1.equals(s2)) 
            System.out.println("s1 equals s2"); 
        else 
            System.out.println("s1 not equals s2"); 
		//Ч���ͬ��
//        String s1 = "Monday";
//        String s2 = "Monday";
        
        System.out.println("----------�����ķָ���---------");
        
        System.out.println("����String��intern������");
        String s3 = "Monday"; 
        String s4 = new String("Monday").intern();
        System.out.println(s3 == s4); 
        System.out.println(s3.equals(s4)); 
        //�Ժ������Զ���ôд  �Ϳ���ֱ��ʹ��==
        
        System.out.println("----------�����ķָ���---------");
        
        String s = "Hi!"; 
        String t = "Hi!"; 
        if (s == t) 
            System.out.println("equals"); 
        else 
             System.out.println("not equals"); 
        
        String s5 = "HELLO"; 
        String t5 = s5.toUpperCase(); 
        if (s5 == t5) 
            System.out.println("equals"); 
        else 
            System.out.println("not equals"); 
        
        String s6 = "Hello"; 
        String t6 = s6.toUpperCase(); 
        if (s6 == t6) 
            System.out.println("equals"); 
        else 
            System.out.println("not equals"); 
        
        //toUpperCase() �� toLowerCase() ��������һ���µ�String������ԭ�ַ��ʾ�ַ�Ĵ�д��Сд���ƣ�����Ҫע�⣺���ԭ�ַ�����Ǵ�д��ʽ��Сд��ʽ����ô����ԭʼ����
        
        //String ��Ӿ�صĹ���ԱҲ�όͷ�ö���������ı��ַ������£��򵥵� String ����㹻��ʹ�����ˣ���ҪƵ���ĸ���ַ�����ݵ�ʱ�򣬾�Ҫ��������������ܳŴ���StringBuffer ��
	}
}
