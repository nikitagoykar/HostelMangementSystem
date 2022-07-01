package collection;

import java.util.*;

public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		list.add("Ram");
		list.add("jiya");
		list.add("riya");
		list.add("karan");
		System.out.println("original linkedlist:"+list);
		Collections.sort(list);
		System.out.println("sorted linkedlist:"+list);
		list.remove(2);
		System.out.println("updated linkedlist:"+list);
		}

}
