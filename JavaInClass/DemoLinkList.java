package JavaInClass;
import java.util.*;
public class DemoLinkList{
	public static void main(String[] args) {
		//Linklist<String> list = new LinkedList<String>(); // not used because 
		// to get both methods of list and link list 
		List<String> list = new LinkedList<String>();
		list.add("India");
		list.add("USA");
		list.add("Africa");
		list.add("Germany");
		
		System.out.println("list of countries"+list);
		 list.add(1,"England");
		 System.out.println("element exsist"+list.contains("Germany"));
		 System.out.println("the country at given index 4 = "+list.get(4));
		 System.out.println("posn of germany ="+list.indexOf("Germany"));
		 list.set(1,"russia");
		 System.out.println("list1 = "+list);
		 Iterator<String> itr = list.iterator();
		 //early cursor on null on next take first one
		 //without next if give remove then throw error
		 //illegal state exception
		 itr.next();
		 itr.remove();
		 System.out.println("list2"+list);
		 //get gives the element 
		 // contains gives the name
		//set for update
		 ListIterator<String> listItr = list.listIterator();
		 listItr.add("Mongolia");
		 System.out.println("list3"+list);
		 listItr.next();
		 listItr.set("Taiwan");
		 System.out.println("list4"+list);
		 list.set(0,"newyork");
		
		 for(String str: list) {
			 System.out.println(str);
		 }
		
		}
}


		
