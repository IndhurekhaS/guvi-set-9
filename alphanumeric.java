import java.util.*;
public class MyClass{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char a[]=s.toCharArray();
        for(int i=0;i<a.length;i++)
        {
            if(Character.isDigit(a[i]))
        {
            System.out.print(a[i]);
        }    
        }
        
    }
    
}
