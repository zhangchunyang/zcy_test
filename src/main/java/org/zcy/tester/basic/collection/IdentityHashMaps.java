package org.zcy.tester.basic.collection;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Person {
	// ����Person��
	private String name;
	// ����name����
	private int age;

	// ����age����
	public Person(String name, int age) {
		// ͨ���췽��Ϊ���Ը�ֵ
		this.name = name;
		// Ϊname���Ը�ֵ
		this.age = age;
		// Ϊage���Ը�ֵ
	}

	public boolean equals(Object obj) {
		// ��дequals()����
		if (this == obj) {
			// �жϵ�ַ�Ƿ����
			return true;
			// ����true��ʾͬһ����
		}
		if (!(obj instanceof Person)) {
			// ���ݽ����Ĳ��Ǳ���Ķ���
			return false;
			// ����false��ʾ����ͬһ����
		}
		Person p = (Person) obj;
		// ��������ת��
		if (this.name.equals(p.name) && this.age == p.age) {
			return true;
			// �������αȽϣ���ȷ���true
		} else {
			return false;
			// �������ݲ���ȣ�����false
		}
	}

	public int hashCode() {
		// ��дhashCode()����
		return this.name.hashCode() * this.age;
		// ���㹫ʽ
	}

	public String toString() {
		// ��дtoString()����
		return "����" + this.name + "�����䣺" + this.age; // ������Ϣ
	}
}

public class IdentityHashMaps {

	public static void main(String[] args) {
		// ���Բ����ظ���key��map - hashMap
		 testHasMap();

		System.out.println("--------------�����ָ���-------------");

		// ���Կ��ظ���key��map - IdentityHashMap
		testIdentityHashMap();
		
	}

	private static void testHasMap() {
		Map<Person, String> map = null;
		// ����Map����ָ�� ��������
		map = new HashMap<Person, String>();
		// ʵ��Map����
		map.put(new Person("����", 30), "zhangsan_1");
		// ��������
		map.put(new Person("����", 30), "zhangsan_2");
		// �������ݣ�key�ظ�
		map.put(new Person("����", 31), "lisi");
		// ��������
		Set<Map.Entry<Person, String>> allSet = null;
		// ����һ��Set����
		allSet = map.entrySet();
		// ��Map�ӿ�ʵ���Ϊ Set�ӿ�ʵ��
		Iterator<Map.Entry<Person, String>> iter = null; // ����Iterator ����
		iter = allSet.iterator();
		// ʵ��Iterator ����
		while (iter.hasNext()) {
			// ������
			Map.Entry<Person, String> me = iter.next();// ÿ��������Map.Entryʵ��
			System.out.println(me.getKey() + " --> " + me.getValue());
			// ���key��value
		}
	}
	
	
	private static void testIdentityHashMap(){
		Map<Person, String> map = null;
		// ����Map����ָ�� ��������
		map = new IdentityHashMap<Person, String>();
		// ʵ��Map����
		map.put(new Person("����", 30), "zhangsan_1");
		// ��������
		map.put(new Person("����", 30), "zhangsan_2");
		// �������ݣ�key�ظ�
		map.put(new Person("����", 31), "lisi");
		// ��������
		Set<Map.Entry<Person, String>> allSet = null; // ����һ��Set����
		allSet = map.entrySet();
		// ��Map�ӿ�ʵ���Ϊ Set�ӿ�ʵ��
		Iterator<Map.Entry<Person, String>> iter = null;// ����Iterator����
		iter = allSet.iterator();
		// ʵ��Iterator ����
		while (iter.hasNext()) {
			// ������
			Map.Entry<Person, String> me = iter.next();// ÿ��������Map. Entryʵ��
			System.out.println(me.getKey() + " --> " + me.getValue());
			// ���key��value
		}
	}
}
