import java.io.*;
import java.util.*;
//import java.lang.Math.*;
class Ams
 {

    public static void main(String[] args) 
	{

        double num ,n, t, result = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		num=sc.nextDouble();
		n = num;
	
        while (n!= 0)
        {
            t= n % 10;
            result=result+(t*t*t);
			//System.out.println("  "+result);
            n = n/10;
        }

        if(result == n)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");
    }
}
