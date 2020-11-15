package sy3;

import java.util.Scanner;

class SA{
    public int divisor(int a,int b){
        int r;
        while((r=a%b)!=0){
            a=b;
            b=r;
        }
        return b;
    }
    public int f(int a,int b){
        if(a>b)return a;
        else return b;
    }
}

class SB extends SA{
    public int f(int a,int b){
        int d;
        d=divisor(a,b);
        return a*b/d;
    }
}

public class TextFourteen {
    public static void main(String args[]){
        int a,b;
        Scanner in=new Scanner(System.in);
        a=in.nextInt();
        b=in.nextInt();
        SA sa=new SA();
        SB sb=new SB();
        System.out.println("最小公约数： "+sa.divisor(a,b)+" 最大公倍数： "+sb.f(a,b));
    }

}
