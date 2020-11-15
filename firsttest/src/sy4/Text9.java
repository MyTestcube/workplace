package sy4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Text9 {
    public static void main(String[] args) {
        String s=null; int n=0;arr ab=null;
        try
        {
            System.out.println("输入元素个数n");
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            s=br.readLine();
            n=Integer.parseInt(s);
            ab=new arr(n);
            for(int i=0;i<n;i++)
            {
                System.out.println("输入a[ "+i+" ]:");
                s=br.readLine();
                ab.a[i]=Integer.parseInt(s);
            }
        }catch(IOException e) {System.out.println(e.toString());}
        System.out.println("最大值："+ab.getmax());
        System.out.println("最小值："+ab.getmin());
        System.out.println("平均值"+ab.getave());
        System.out.println("元素和"+ab.getsum());
    }
}
class arr{
    int a[];
    arr(int n)
    {
        a=new int[n];
    }
    int getmax()
    {
        int max=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max) max=a[i];
        }
        return max;
    }
    int getmin()
    {
        int min=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<min) min=a[i];
        }
        return min;
    }
    int getsum()
    {
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum+=a[i];
        }
        return sum;
    }
    int getave()
    {
        int ave=getsum()/a.length;
        return ave;
    }

}
