package org.zcy.tester.basic.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListCollection {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(3);

		Iterator iterator = list.iterator();
		System.out.println("------����һ-------");
		while (iterator.hasNext()) {
			int i = Integer.parseInt(iterator.next().toString());
			System.out.println(i);
		}

		System.out.println("------������-------");
		for (Iterator iter = list.iterator(); iter.hasNext();) {
			int i = Integer.parseInt(iter.next().toString());
			System.out.println(i);
		}

		System.out.println("------������-------");
		for (Object obj : list) {
			System.out.println(obj);
		}

		System.out.println("------������-------");
		for (int i = 0; i < list.size(); i++) {
			int k = Integer.parseInt(list.get(i).toString());
			System.out.println(k);
		}
	}
}