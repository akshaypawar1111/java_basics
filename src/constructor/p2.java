package constructor;

public class p2 {

	
	int num1;
	int num2;
	
	p2(int a, int b)
	{
		
	 num1=a;
	 num2=b;
	 
		
		
	}
	
	
	public void method1()
	{
		
	int sum=num1+num2;
		System.out.println(sum);
		
	}
	
	
	public static void main(String[] args) {
		
		
		p2 o =new p2(500, 400);
		
		o.method1();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
