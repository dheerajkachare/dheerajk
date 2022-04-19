package DEMO;

public class ADD 
{
 public void m1()
 {
	 int a=10;
	 System.out.println("the value of A=" +a);
	 int b=20;
	 System.out.println("the value of B="+ b);
	 int c=a+b;
	 System.out.println("total value of C=" +c);
 }
 public static void main (String[] args)
 {
	 ADD add=new ADD();
	 add.m1();
 }
}
