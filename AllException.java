package Day3;
import java.util.*;

public class AllException {
	public static void main(String args[])
	{
		try
		{
			
			// IOException
			Scanner sc = new Scanner("Hello Sowmya!"); 
			System.out.println("" + sc.nextLine()); 
			System.out.println(sc.ioException()); 
			
			  
	  
			 // Number Format Exception
			  int num = Integer.parseInt ("sowmya") ; 
			 System.out.println(num);
		
		// StringIndexOutOfBoundsException
			String s = "This is Sowmya"; // length=16
		    char ch = s.charAt(24); 
			System.out.println(ch); 
            
         // ArrayIndexOutOfBoundsException
            int arr[]= {10,11,12,13,14,15};
            System.out.println(arr[6]); 
			
			
			// ArithmeticException
			int a=10;
			int b=0; 
			int c=a/b;
			System.out.println(c); 
			
			// NullPointerException
            String s1=null; 
		    System.out.println(s1.length()); 
		}
		
		 catch(NumberFormatException ne) { 
            System.out.println(ne); 
        } 
		 catch(StringIndexOutOfBoundsException si) 
		  { 
	            System.out.println(si); 
	      } 
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
		catch(ArrayIndexOutOfBoundsException ai)
		{
			System.out.println(ai);
		}
		catch(NullPointerException ni)
		{
			System.out.println(ni);
		}
		
		finally
		{
			System.out.println("Exception Raised");
		}
	}

}