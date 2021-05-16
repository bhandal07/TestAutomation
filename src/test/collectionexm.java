package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class collectionexm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       ArrayList<String> mylist = new ArrayList<String>();
       mylist.add("3");
       mylist.add("2");
       mylist.add("Priya");
       
       
       System.out.println("Before Sorting");
       System.out.println(mylist);
       
       Collections.sort(mylist);
       
       System.out.println("Before Sorting");
       System.out.println(mylist.size());
       System.out.println(mylist.get(2));
       
       
       Collections.sort(mylist,Collections.reverseOrder());
       
       System.out.println("After Descending order");
       System.out.println(mylist);
       
     
       
       
      
       
       Stack<String> mystack = new Stack<String>();
       
       mystack.push("abc");
       mystack.push("xyz");
       System.out.println(mystack);
       
       mystack.pop();
       mystack.push("pqr");
       mystack.pop();
       System.out.println(mystack);
       
       
       
	}

}
