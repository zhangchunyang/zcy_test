package org.zcy.tester.basic.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;


public class MapCollection {
	public static void main(String[] args) {
		MapCollection.testTreeMap();
	}
	
	
	private static void testTreeMap(){
	    TreeMap<Integer, Integer> treemap = new TreeMap<Integer, Integer>();  
//	    ArrayList<Entry<String,Integer>> l = new ArrayList<Entry<String,Integer>>(keyfreqs.entrySet());    
//        Collections.sort(l, new Comparator<Map.Entry<String, Integer>>() {    
//            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {    
//                return (o2.getValue() - o1.getValue());    
//            }    
//        });  
//          
//        for(Entry<String,Integer> e : l) {  
//            System.out.println(e.getKey() + "::::" + e.getValue());  
//        }  
	}
	
	/**
	 * 测试遍历HashMap
	 */
	private static void testTraverseHashMap(){
		Map<String, String> cardData = new HashMap<String, String>();
		cardData.put("1", "test1");
		cardData.put("2", "test2");
		cardData.put("3", "test3");
		cardData.put("4", "test4");
		cardData.put("5", "test5");
		
		System.out.println("方式一");
		Iterator<Entry<String, String>> iter = cardData.entrySet().iterator();
		while (iter.hasNext()) {
			Map.Entry entry = (Map.Entry) iter.next();
			System.out.println(entry);
			Object key = entry.getKey();
			System.out.println("key:" + key);
			System.out.println("value:" + entry.getValue());
			System.out.println("");
		}//高效,使用此种方式
		
		System.out.println("方式二");
		for (Iterator<Entry<String, String>> iter2 = cardData.entrySet().iterator(); iter2.hasNext(); ) {
			Map.Entry entry = (Map.Entry) iter2.next();
			System.out.println(entry);
			Object key = entry.getKey();
			System.out.println("key:" + key);
			System.out.println("value:" + entry.getValue());
			System.out.println("");
		}		
	}
}
