//java program to implement palindrome using method
import java.io.*;

class Palin
{
  public static void main(String args[])
  {
	String s="malayalam",s1="";
	char ch;
	for (int i=0;i<s.length();i++)
	{
		ch=s.charAt(i);
		s1=ch+s1;
	}
	if(s1.equals(s)==true)
		 System.out.println("the given string is palindrome");
	else
		 System.out.println("the given string is not palindrome");
  }
}

	
		
	