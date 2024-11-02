//java program to read the input integers from command line arguments and print first and second largest number
import java.io.*;
import java.util.*;
class CommandLineTest
{
  public static void main(String args[])
  {
  int i,j,t,n;
   
   n=args.length;
   int[]a=new int[n];
   System.out.println("elements in the array are:");
   for(i=0;i<args.length;i++)
   {
	   a[i]= Integer.parseInt(args[i]);
	   System.out.println(" "+a[i]);
   }
  
  for(i=0;i<n-1;i++)
  {
	  for( j=i+1;j<n;j++)
	  {
	  if(a[i]<a[j])
	  { 
		  t=a[i];
		  a[i]=a[j];
		  a[j]=t;
	  }
	  }
  }
   System.out.println("elements after sorting are:");
  for(i=0;i<args.length;i++)
   {
	   
	   System.out.print("  "+a[i]);
   }
  
  System.out.println("elements are:");
  System.out.println(" the first largest element is"+a[0]);
  System.out.println(" the second largest element is"+a[1]);
	  
  }
}