package Stepdif;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;


public class Progrmas {
	public static void main(String[] args) {
		
		String[] names={"Mahesh","MOM","DAD","ANI","Mahesh",};
		ArrayList<Object> li = new ArrayList<>(Arrays.asList("Mahesh",2,2,3,3,34,4,"Mahesh","not","Maybe"));
		LinkedHashSet<String> list=new LinkedHashSet<String>(); 
		
       for (String string : names) {
		list.add(string);
	}
       System.out.println(list);
       
       System.out.println(li);
       Set<String> dup=new HashSet();
       for (String string : names) {
           dup.add(string);

	}
       System.out.println(dup);
       
	       for (Object no : li) {
	    	   if (no instanceof String) {
	    		   list.add((String)no);
				
			}
				
		}
    	   System.out.println("list"+list);
 
		
	}

	}


