package testPkg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<Integer>();
		list.add(5);
		list.add(50);
		list.add(15);
		list.add(85);
		list.add(65);
		
		Collections.sort(list,Collections.reverseOrder());
		
		System.out.println("Forward Direction:::");
		
		ListIterator<Integer> li=list.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println("*******************");
		
		System.out.println("Backward Direction:::");
		
		ListIterator<Integer> bli=list.listIterator(list.size());
		while(bli.hasPrevious())
		{
			System.out.println(bli.previous());
		}
		System.out.println("*******************");
		
		for(Integer lst:list)
		{
			System.out.println(lst);
		}
		System.out.println("*******************");
		System.out.println(list.get(2));
		list.remove(2);
		System.out.println("*******************");
		for(Integer lst:list)
		{
			System.out.println(lst);
		}
		list.clear();
		System.out.println("Size of list:: "+list.size());
		

	}

}
