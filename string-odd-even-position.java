import java.util.*;
public class MyClass {
    public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    char ch[]=s.toCharArray();
    for(int i=0;i<s.length();i++)
    {
        if(i%2==0)
        {
            System.out.print(ch[i]);
        }
        
    }
   System.out.print(" ");
    for(int i=0;i<s.length();i++)
    {
        if(i%2!=0)
        {
            System.out.print(ch[i]);
        }
        
    }
    
    }
}
