import java.io.*;
import java.util.*;
import java.lang.Math.*;
class ArmstrongNum
 {

    public static void main(String[] args) 
	{

        int num ,n, t, result = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		num=sc.nextInt();
		n = num;

        while (n!= 0)
        {
            t= n % 10;
            result+=Math.pow(t,3);
            n = n/10;
        }

        if(result == n)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");
    }
}
