//java program to create a class as registration with properties 
//as class full name(string),enter (char),age(int),phonenum(long)and is married(boolean) and 
//print their values
import java.io.*;
class Registration
{
  String Name;
  char Gender;
  int Age;
  double Height;
  long phonenum;
  boolean is_Married;
 
  public void getData(String N,char G,int A,double H,long P,boolean M)
{
  Name=N;
  Gender=G;
  Age=A;
  Height=H;
  phonenum=P;
  is_Married=M;
}
public void displayData()
{
  System.out.println("name="+Name);
  System.out.println("gender="+Gender);
  System.out.println("age="+Age);
  System.out.println("height="+Height);
  System.out.println("phonenum="+phonenum);
  System.out.println("is_Married="+is_Married);
}
}
class MainRegistration
{
  public static void main(String args[])
{
  Registration ob=new Registration();
  ob.getData("raj",'M',52,5.4,987654321,true);
  ob.displayData();
}
}
  
 
  
  
