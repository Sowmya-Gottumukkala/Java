//java program to define class using constructor 
class student
{
  public String name;
  public String rollno;
  public int age;
  public void getData()
  {
    name="rajendar";
	rollno="21kd1a1529";
	age=52;
  }
  student()
  {
   System.out.println("Name="+name);
   System.out.println("Roll no="+rollno);
   System.out.println("Age="+age);
  }
 }
 class constructorTest
 {
  public static void main(String args[])
  {
    student ob=new student();
	ob.displayData();
  }
 }
 