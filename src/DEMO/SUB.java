package DEMO;

public class SUB 
{
	public void m2()
	{
		int a=10;
		System.out.println("The value of A="+ a);
		int b=5;
		System.out.println("The value of B="+ b);
		int c=a-b;
		System.out.println("The value of C="+ c);
	System.out.println(c);
	}
	public static void main (String[] args)
	{
		SUB sub=new SUB();
		sub.m2();
	}

}

