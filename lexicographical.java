import java.util.*;
public class MyClass{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        String s=sc.next();
        char a[]=s.toCharArray();
        Arrays.sort(a);
        String s1=new String(a);
        System.out.println(s1);
        
    }
}
