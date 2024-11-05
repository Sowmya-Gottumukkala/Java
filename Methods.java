package Day3;

public class Methods
{
    public static void main(String[] args) {
        String s1="hello";
        String s2="world";
        String s3="hello";
        String s4="  java is a programming language  ";
        System.out.println(s2.length());
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.concat(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s4.trim());
        System.out.println(s1.replace('l', 'p'));
        System.out.println(s4.replaceAll(" ", ""));
        String s5 = new String("Welcome");   
        String s6 = new String("Welcome");  
        System.out.println(s5 == s6); 
        String s7 = new String("Welcome to JavaTpoint").intern();   
        String s8 = new String("Welcome to JavaTpoint").intern();  
        System.out.println(s8 == s7);   
        System.out.println(s2.substring(2));
        System.out.println(s2.substring(2,4));
        System.out.println(s4.indexOf("is"));
        System.out.println(s2.contains("ec"));
        
    }

}