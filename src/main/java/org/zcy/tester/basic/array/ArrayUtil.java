package org.zcy.tester.basic.array;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Random;

class TestBean {

	String name;

	int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

public class ArrayUtil implements Serializable {
	/** 
     * 
     */
	private static final long serialVersionUID = 8057374625909011982L;

	// �����������
	private Object objArray;

	// ���鳤��
	private int size = 0;

	// �����������ʵ������
	private String objType;

	final static private Random rand = new Random();

	private static ArrayUtil instance = null;

	/**
	 * ֱ��ע��Collection
	 * 
	 * @param collection
	 * @return
	 */
	public static ArrayUtil getInstance(Collection collection) {
		return getInstance(collection.toArray());
	}

	/**
	 * ֱ��ע���������
	 * 
	 * @param array
	 */
	public static ArrayUtil getInstance(Object array) {
		if (instance == null) {
			instance = new ArrayUtil(array);
		}
		return instance;
	}

	/**
	 * ע�������ָ����С��������
	 * 
	 * @param clazz
	 * @param maxSize
	 */
	public static ArrayUtil getInstance(Class clazz, int maxSize) {
		if (instance == null) {
			instance = new ArrayUtil(clazz, maxSize);
		}
		return instance;
	}

	private ArrayUtil() {

	}

	/**
	 * ע������������ָ����С��������
	 * 
	 * @param clazz
	 * @param maxSize
	 */
	private ArrayUtil(Class clazz, int maxSize) {
		// תΪָ����С��������
		Object array = (Object[]) Array.newInstance(clazz, maxSize);
		// ��ʼ��
		init(array);
	}

	/**
	 * ֱ��ע���������
	 * 
	 * @param array
	 */
	private ArrayUtil(Object array) {
		init(array);
	}

	private void init(Object array) {
		// ����Ƿ��������
		if (!(array instanceof Object[])) {
			throw new IndexOutOfBoundsException("Not object arrays��");
		}
		// �����������
		objArray = array;
		// ����ʵ������
		objType = array.getClass().getComponentType().getSimpleName();
		// �������鳤��
		size = Array.getLength(objArray);
	}

	/**
	 * ����ָ����������λ��
	 * 
	 * @param obj
	 * @return
	 */
	public int get(Object obj) {
		// ����Ƿ�Ϸ�����
		checkObject(obj);
		Object[] object = (Object[]) objArray;
		for (int i = 0; i < size; i++)
			if (object[i] == obj) {
				return i;
			}
		return -1;
	}

	/**
	 * ����ָ������λ�ö���
	 * 
	 * @param index
	 * @return
	 */
	public Object get(int index) {
		checkIndex(index);
		return getObjectArray()[index];
	}

	/**
	 * ���ض�����ָ��λ��
	 * 
	 * @param obj
	 * @param index
	 */
	public void add(Object obj, int index) {
		// ��������Ƿ�Խ��
		checkIndex(index);
		// ����Ƿ�Ϸ�����
		checkObject(obj);
		Object[] objTemp = (Object[]) objArray;
		objTemp[index] = obj;
		// copy��ʱ���鵽objArray
		System.arraycopy(objTemp, 0, objArray, 0, objTemp.length);
	}

	/**
	 * ���ض���
	 * 
	 * @param obj
	 */
	public void add(Object obj) {
		// ���ͼ��
		checkObject(obj);
		// �ۼ�
		next();
		// ��ʱ�������������
		Object[] objTemp = new Object[size];
		// ���ض���
		objTemp[size - 1] = obj;
		// copy
		System.arraycopy(objArray, 0, objTemp, 0, Array.getLength(objArray));
		// ת��
		objArray = objTemp;
	}

	/**
	 * ɾ��ָ������λ���������
	 * 
	 * @param index
	 * @return
	 */
	public Object remove(int index) {
		// ��������Ƿ�Խ��
		checkIndex(index);
		Object[] objTemp = (Object[]) objArray;

		// ���¹���objArray
		int j;
		if ((j = size - index - 1) > 0) {
			System.arraycopy(objTemp, index + 1, objTemp, index, j);
		}
		// ����size
		back();

		return objTemp[index];
	}

	public boolean contains(Object obj) {
		Object[] objTemp = (Object[]) objArray;
		for (int i = 0; i < size; i++) {
			if (hash(objTemp[i]) == hash(obj)) {
				return true;
			}
		}
		return false;
	}

	public Object[] sub(int startIndex, int endIndex) {
		// ��֤����Χ
		checkIndex(startIndex);
		checkIndex(endIndex);
		int over = endIndex - startIndex;
		if (over < 0) {
			throw new IndexOutOfBoundsException(
					"Index beyond the end of the border!");
		}
		Object[] objTemp = (Object[]) objArray;
		Object[] objs = (Object[]) Array.newInstance(objArray.getClass()
				.getComponentType(), over);
		for (int i = startIndex; i < endIndex; i++) {
			objs[i - 1] = objTemp[i - 1];
		}
		return objs;
	}

	public void clear() {
		Object[] objTemp = (Object[]) objArray;
		// ������
		for (int i = 0; i < size; i++) {
			objTemp[i] = null;
			size = 0;
		}
	}

	/**
	 * ɾ��ָ���Ķ���ʵ��
	 * 
	 * @param obj
	 * @return
	 */
	public boolean remove(Object obj) {
		// ����Ƿ�Ϸ�����
		checkObject(obj);
		Object[] object = (Object[]) objArray;
		for (int i = 0; i < size; i++)
			if (object[i] == obj) {
				remove(i);
				return true;
			}
		return false;
	}

	/**
	 * ��������Ԫ��
	 * 
	 * @return
	 */
	public void mixElements() {
		mixElements(objArray);
	}

	/**
	 * ���������Ԫ���Ƿ�Ϊ��
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		return (size == 0);
	}

	/**
	 * תΪlist
	 * 
	 * @return
	 */
	public List getList() {
		return Arrays.asList((Object[]) objArray);
	}

	/**
	 * ����size
	 * 
	 */
	private void back() {
		size--;
	}

	/**
	 * ����size
	 * 
	 */
	private void next() {
		size++;
	}

	/**
	 * ��������Ƿ����
	 * 
	 * @param index
	 */
	private void checkIndex(int index) {

		if (index >= size || index < 0) {
			throw new IndexOutOfBoundsException("Index " + index
					+ " out of bounds��");
		}
	}

	/**
	 * ����������
	 * 
	 * @param obj
	 */
	private void checkObject(Object obj) {
		if (obj instanceof Object[]) {
			throw new IndexOutOfBoundsException("Not loading arrays��");
		}
		String type;
		if (!objType.equals(type = obj.getClass().getSimpleName())) {
			throw new IndexOutOfBoundsException("Not this " + type
					+ " type of loading��");
		}
	}

	/**
	 * �����������
	 * 
	 * @param obj
	 * @param i
	 * @param flag
	 * @return
	 */
	static public Object expand(Object obj, int i, boolean flag) {
		int j = Array.getLength(obj);
		Object obj1 = Array.newInstance(obj.getClass().getComponentType(), j
				+ i);
		System.arraycopy(obj, 0, obj1, flag ? 0 : i, j);
		return obj1;
	}

	/**
	 * �����������
	 * 
	 * @param obj
	 * @param i
	 * @param flag
	 * @return
	 */
	static public Object expand(Object obj, int i) {
		return expand(obj, i, true);
	}

	/**
	 * ������������
	 * 
	 * @param obj
	 */
	static public void mixElements(Object obj) {
		int i = Array.getLength(obj);
		for (int k = 0; k < i; k++) {
			int j = getRandom(k, i - 1);
			Object obj1 = Array.get(obj, j);
			Array.set(obj, j, Array.get(obj, k));
			Array.set(obj, k, obj1);
		}

	}

	static public Random getRandomObject() {
		return rand;
	}

	static public int getRandom(int i, int j) {
		return i + rand.nextInt((j - i) + 1);
	}

	private int hash(Object obj) {
		int h = obj.hashCode();
		h += ~(h << 9);
		h ^= (h >>> 14);
		h += (h << 4);
		h ^= (h >>> 10);
		return h;
	}

	public int hashCode() {
		return hash(objArray.getClass());
	}

	public int size() {
		return size;
	}

	/**
	 * ���ص�ǰ�������
	 * 
	 * @return
	 */
	public Object[] getObjectArray() {
		return (Object[]) objArray;
	}

	public static void main(String[] args) {
//		TestBean[] tb = new TestBean[3];
//		for (int i = 0; i < tb.length; i++) {
//			tb[i] = new TestBean();
//			tb[i].setName("name" + i);
//			tb[i].setId(i);
//		} 
//		// ֱ����������������� 
//		ArrayUtil arrayUtil = ArrayUtil.getInstance(tb);
//		TestBean tb1 = new TestBean(); //
//		arrayUtil.add(tb[0]);
//		arrayUtil.remove(tb[0]); //
//		arrayUtil.remove(tb[2]);
//		System.out.println(arrayUtil.contains(tb1));
//		System.out.println(((TestBean) arrayUtil.get(0)).getName());
//		System.out.println(arrayUtil.size()); 
//		// ��������
//		arrayUtil.mixElements();
//		System.out.println("�������");
//		for (int i = 0; i < arrayUtil.size(); i++) {
//			System.out.println(((TestBean) arrayUtil.get(i)).getName());
//		}

		// ���TestBean������ʵ���ʼ����Ϊ5
		ArrayUtil arrayUtil2 = ArrayUtil.getInstance(TestBean.class, 5);
		TestBean t = new TestBean();
		t.setName("test");
		TestBean t1 = new TestBean();
		t1.setName("test1");
		// ����������t��ʵ��
		arrayUtil2.add(t, 0);
		arrayUtil2.add(t1, 1);
		arrayUtil2.add(t, 2);
		arrayUtil2.add(t, 3);
		arrayUtil2.add(t, 4);
		// ���Զ�������������
		arrayUtil2.add(t);
		// ��ʾ����5���
		System.out.println(((TestBean) arrayUtil2.get(5)).getName());
		// ��ȡ����1-3����ʾ1���
		System.out.println(((TestBean) arrayUtil2.sub(1, 3)[1]).getName());
	}
}
