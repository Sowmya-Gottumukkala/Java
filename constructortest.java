import java.io.*;
class demo
{
  int x,y,z;
  demo(int x,int y,int z)
  {
    this.x=x;
	this.y=y;
	this.z=z;
  }
  demo(int x,int y)
  {
    this(x,y,300);
   }
   demo(int x)
   {
     this(x,200);
	}
	demo()
	{
	  this(100);
	 }
	 public void display()
	 {
	   System.out.println("x="+x);
	   System.out.println("y="+y);
	   System.out.println("z="+z);
	 }
}	 
class constructorTest
{
 public static void main(String args[])
 {
   demo d=new demo();
    d.display();
}
}	
	   
	   
   
