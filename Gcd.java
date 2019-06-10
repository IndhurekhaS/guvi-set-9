import java.util.*;
public class MyClass{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int gcd=0;
        for(int i=1;i<=n&&i<=m;i++)
        {
            if(n%i==0&&m%i==0)
            {
                gcd=i;
            }
        }
        System.out.println(gcd);
        
    }
    
}
