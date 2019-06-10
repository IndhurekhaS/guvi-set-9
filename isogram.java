import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int count=0;
        char a[]=s.toCharArray();
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    count++;
                }
            }
        }
        if(count==0)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}
