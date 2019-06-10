import java.util.*;
public class MyClass{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int max=0,min=0,x=0,lcm=0;
        if(n>m)
        {
            max=n;
            min=m;
        }
        else
        {
            max=m;
            min=n;
        }
        for(int i=1;i<=min;i++)
        {
            x=max*i;
            if(x%min==0)
            {
                lcm=x;
                break;
            }
        }
           System.out.println(lcm);
       
        
    }
    
}
