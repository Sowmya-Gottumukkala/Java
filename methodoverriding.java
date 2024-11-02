//to display method overriding
class A
{
  public void display()
  {
   System.out.println("this is A class");
  }
 }
class B extends A
{
  public void display()
  {
   System.out.println("this is B class");
  }
}
class C extends B
{
  public void display()
  {
   System.out.println("this is C class");
  }
}
class methodOverRiding
{
	 public static void main(String args[])
	 {
		  C ob=new C();
		  A ob1=new A();
		  B ob2=new B();
		  ob.display();
		  ob1.display();
		  ob2.display();
	 }
}
 