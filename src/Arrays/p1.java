package Arrays;

import java.util.Arrays;

public class p1 
 {
public static void main(String[] args) {
	
	
	
	
	int a [] = new int[5]; 
	
	a[0]=100;
	a[1]=600;
	a[2]=400;
	a[3]=900;
	a[4]=50;
	
	
	System.out.println(a[2]);

	System.out.println(a.length);
	
	System.out.println("..............................................");
	
	Arrays.sort(a);
	for(int i=0; i<=a.length-1; i++)
	{
		
		System.out.println(a[i]);
	}
	
	
	
	
	
	
	
}
}
