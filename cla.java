import java.io.*;
class CommandLineTest
{
  public static void main(String args[])
  {
	  System.out.println("the command line arguments are:");
   for (int i=0;i<args.length;i++)
      System.out.print(" "+args[i]);
  }
}
