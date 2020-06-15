import java.util.*;
public class Main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);    
        int x=sc.nextInt();
        int n=sc.nextInt();
        int s=0;int t=0;
        //for(int i=0;i<=n;i++)
        int[] st=new int[x];
        for(int i=0;i<x;i++)
        {
            st[i]=Integer.parseInt(sc.next());
        }
        //Arrays.sort(st);
        for(int i=0;i<x;i++){
            /*if(s[i]==n)
                {
                    t=1;
                    break;
                }*/
             if(s<n)
                {
                    s=s+st[i];
                    t=i;
                    {if(s>=n)
                        t=i;
                        //System.out.println(n-i);
                    }
                }
    }
    if(s>n)
        {
            if(s==n)
                 System.out.println(t+1);
        
            else
                 System.out.println(t);
        }
    else
        System.out.println("-1");
    }
}