//java program to display runtime polymorphism
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
class runTimePolymorphism
{
  public static void main(String args[])
  {
   A a;//REFERENCE VARIABLE
   B ob=new B();
   C ob1=new C();
   a=ob;
   a.display();
   a=ob1;
   a.display();
   a=new A();
   a.display();
  }
 }