package DEMO;

public class DIV 
{
	public void m3()
	{
		int a=20;
		System.out.println("the value of A=" +a);
		int b=30;
		System.out.println("the value of B=" +b);
		int c=b/a;
		System.out.println("Divsion=" +a);
		System.out.println(c);
	}
	public static void main (String[] args)
	{
		DIV div=new DIV();
		div.m3();
	}
}
