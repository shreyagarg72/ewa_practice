package org.ncu.arraylistpract;

import java.util.*;
public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<Integer>();
        List<Integer> ll = new LinkedList<Integer>();

        
        
        // to get all the methods of list as well
        arr.add(12);
        arr.add(34);
        arr.add(23);
        arr.add(67);
        arr.add(77);
        Iterator<Integer> itr = arr.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+",");
        }
        // traversing in reverse direction 
        ListIterator<Integer> litr = arr.listIterator(arr.size());
        System.out.println("");
        while(litr.hasPrevious()){
        	
            System.out.print(litr.previous()+" ");
        }


     }
}
