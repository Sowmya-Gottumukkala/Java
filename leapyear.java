//program to find whether the year is leap year or not
import java.util.*;
import java.io.*;
class LeapYear
{
 public void leap(int year)
 {
   if(year%4==0&&year%100!=0||year%400==0)
     System.out.println(year+ "is a leap year");
   else
     System.out.println(year+ "is  not a leap year=");
 } 
}
class LeapTest
{
 public static void main(String args[])
{
 int year;
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the year :");
 year=sc.nextInt();
 LeapYear ob=new LeapYear();
 ob.leap(year);
 
 
  
 } 
 }

 
  
   