package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class practice1
{
public static void main(String[] args) {
	
	
	ArrayList a = new ArrayList();
	
	a.add(100);
	a.add(200);
	a.add("akshay");
	a.add(1000);
	a.add(100);
	a.add(700);
	a.add(900);
	a.add(600);
	a.add(50);
	
	System.out.println(a.remove(3));
	
//	System.out.println(a.set(1, 111111111));
	
	
	System.out.println(a.size());
	
	
	
	System.out.println(".............for loop...........................");
	
	Iterator cc = a.iterator();
	
	
//	for(Object z:a)
//	{
//		System.out.println(z);
//		
//	}
	
	
	while(cc.hasNext())
	{
		
		
		System.out.println(cc.next());
	}
	
	
	
	
}
}
