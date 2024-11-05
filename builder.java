package Day3;


public class builder {
    public static void main(String args[])
    {
    StringBuilder sb1=new StringBuilder("Hello "); 
    StringBuilder sb=new StringBuilder("india");  
    System.out.println(sb1.append("Java"));
    System.out.println(sb1.insert(1,"we"));
    System.out.println(sb1.replace(1,4,"Java"));
    System.out.println(sb1.reverse());
    System.out.println(sb.delete(1,4));
    System.out.println(sb.capacity());
    }

}