//interface in java
import java.io.*;
interface A
{
  void accept();
  void display();
  void getinfo();
  void printinfo();
}
class B implements A
{
	 int i,j;
	 String city1,city2;
	 public void accept()
	 {
		  i=10;
		  j=20;
	 }
	 public void display()
	 {
		  System.out.println("i="+i);
		  System.out.println("j="+j);
	 }
	 public void getinfo()
	 {
		  city1="vizag";
		  city2="mumbai";
	 }
	 public void printinfo()
	 {
		 System.out.println("city1="+city1);
		 System.out.println("city2="+city2);
	 }
}
class interfaceTest
{
	public static void main(String args[])
	{
		A a;//reference variable
		B ob=new B();
		a=ob;
		a.accept();
		a.display();
		a.getinfo();
		a.printinfo();
	}
}
		 
		  