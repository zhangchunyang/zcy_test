package org.zcy.tester.basic.collection;

import java.util.ArrayList;
import java.util.List;

public class ListAndArrayTransformation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String[] arr = {"a","b","c"};  
//		  
//	    ///����apache �� ArrayUtils �����������Ƿ����ĳһԪ��  
//	     System.out.println(Arrays.contains(arr, "b"));
//	     System.out.println(Arrays.indexOf(arr, "b")); 
//	  
//	   //����java api�е�Arrays ����array to list ת��  
//	     List<String> javaList = Arrays.asList(arr);    
//	    //javaList.add("d");  //�˴����׳�java.lang.UnsupportedOperationException�쳣���˷������ص�List����add,remove������Ϊ�÷�����ʵ����ʹ�ò������õ�����Ĵ�С��new��һ��ArrayList���Է����б�ĸ�Ļᡰֱд�������飬������û��add,remove������   
//	     System.out.println(javaList.size());   
//	  
//	     //����apache���CollectionUtils����array to list��ת��  
//	     List<String> apacheList = new ArrayList<String>();  
//	     CollectionUtils.addAll(apacheList, arr);  
//	     apacheList.add("d"); //����תCollection(��ת��)  CollectionUtils; ��������ȫת����һ���������͵�Collection   
//	     System.out.println(apacheList.size());   
//	       
//	     //Arrayת��ΪListһ�ַ�ʽ  
//	      String[] l = new String[javaList.size()];  
//	      javaList.toArray(l);  
//	      System.out.println(ArrayUtils.toString(l));  
//	     //Arrayת��ΪList����һ�ַ�ʽ  
//	      String[] l2 = (String [])javaList.toArray(new String[0]);  
//	      System.out.println(ArrayUtils.toString(l2));  
	}
	
//	1
//	Listת����Ϊ���顣�������List��ʵ����ArrayList)
//	��������ArrayList��toArray������
//	����toArray
//	����public <T> T[] toArray(T[] a)����һ��������ȷ��˳�����б�������Ԫ�ص����飻�������������ʱ���;���ָ�����������ʱ���͡�����б��ܷ���ָ�������飬�򷵻ط�����б�Ԫ�ص����顣���򣬽����ָ�����������ʱ���ͺʹ��б�Ĵ�С����һ���µ����顣
//	�������ָ���������������б?��ʣ��ռ䣨�������Ԫ�ر��б�Ķࣩ����ô�Ὣ�����н����ڼ���ĩβ��Ԫ������Ϊ null�����ȷ���б�ĳ��Ⱥ����ã���ֻ �ڵ��÷�֪���б��в����κ� null Ԫ��ʱ�����á�
//
//	����ָ���ߣ�
//	�����ӿ� Collection<E> �е� toArray
//
//	����ָ���ߣ�
//	�����ӿ� List<E> �е� toArray
//
//	�������ǣ�
//	������ AbstractCollection<E> �е� toArray
//
//	��������
//	����a - Ҫ�洢�б�Ԫ�ص����飬������㹻��Ļ�����������һ��Ϊ�洢�б�Ԫ�ض����ġ�������ͬ����ʱ���͵������顣
//
//	�������أ�
//
//	�������б�Ԫ�ص����顣
//
//	�����׳���
//
//	����ArrayStoreException - ��� a ������ʱ���Ͳ��Ǵ��б���ÿ��Ԫ�ص�����ʱ���͵ĳ����͡�
//
//	���������÷���
//
//	List list = new ArrayList();
//	list.add("1");
//	list.add("2");
//	final int size =��list.size();
//	String[] arr = (String[])list.toArray(new String[size]);
//
//	����2.����ת����ΪList��
//
//	��������Arrays��asList����.
//
//	����asList
//
//	����public static <T> List<T> asList(T... a)����һ����ָ������֧�ֵĹ̶���С���б?���Է����б�ĸ�Ļᡰֱд�������顣���˷���ͬ Collection.toArray һ�𣬳䵱�˻�������� API ����� collection �� API ֮������������ص��б��ǿ����л��ģ�����ʵ���� RandomAccess��
//
//	�����˷������ṩ��һ�������̶����ȵ��б�ı�ݷ��������б?��ʼ��Ϊ����Ԫ�أ�
//
//	���� List stooges = Arrays.asList("Larry", "Moe", "Curly");
//
//	��������
//
//	����a - ֧���б�����顣
//
//	�������أ�
//
//	����ָ��������б���ͼ��
//
//	��������μ�
//
//	����Collection.toArray()
//
//	���������÷�:
//
//	����String[] arr = new String[] {"1", "2"};
//
//	����List list = Arrays.asList(arr);

}
