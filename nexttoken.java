//printing next token 

import java.util.*;
class Main
{
  public static void main(String[] args)
    {
        StringTokenizer st1 = new StringTokenizer("Hello", " ");
        while (st1.hasMoreTokens())
              System.out.println(st1.nextToken());
     
    }
}
