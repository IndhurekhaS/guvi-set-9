import java.util.*;
public class MyClass{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char ch=sc.next().charAt(0);
        int m=sc.nextInt();
        if(ch=='/')
        {
            int r=n / m;
            System.out.println(r);
        }
        else
        {
            int r1=n % m;
            System.out.println(r1);
        }
    
        
    }
}
