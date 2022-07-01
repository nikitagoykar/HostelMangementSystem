package collection;
import java.util.*;
public class ArrayList1 {

	public static void main(String[] args) {
		List <String> list=new ArrayList <String>();
		//add elements into arraylist
		list.add("Ram");
		list.add("karan");
		list.add("riya");
		list.add("jiya");
		System.out.println("original arraylist:"+list);
		Collections.sort(list);
		System.out.println("sorted arraylist:"+list);
	}

}
