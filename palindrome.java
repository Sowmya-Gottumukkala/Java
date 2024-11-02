import java.io.*;
import java.util.*;
class Palindrome
{
 public void palin(int n)
 {
  int t=n;
  int rev=0,digit;
  while(n!=0)
  {
   digit=n%10;
   rev=(rev*10)+digit;
   n=n/10;
  }
   if(t==rev)
    System.out.println(t+"is a palindrome");
   else
    System.out.println(t+"is not a palindrome");
 }
}
class PalinTest
{
 public static void main(String args[])
 {
  Scanner Sc=new Scanner(System.in);
  System.out.println("enter the n value:");
  int n=Sc.nextInt();
  Palindrome ob=new Palindrome();
  ob.palin(n);
 }
}
   