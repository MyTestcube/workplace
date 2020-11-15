package sy4;

import java.util.Random;

public class Text8 {
    public static void main(String[] args) {
        final int ALLNUM=100000;
        int num[]=new int[1001];
        double rate[]=new double[1001];
        int a[]=new int[1001];
        Random r=new Random();
        int k=0,n=0;
        for(int i=0;i<1000;i++){//得出100中前10个随机数
            a[i]=r.nextInt(6)+1;
        }

        for(int i=1;i<ALLNUM;i++){//ALLNUM—1，因为前面多加了一次
            num[r.nextInt(6)+1]++;
        }
        for(int i=1;i<1001;i++){
            rate[i]=(double)num[i]*6/ALLNUM;
        }
        for(int i=0;i<1001;i++)
            for(int j=1;j<101;j++)
                if(a[i]==j)
                {
                    System.out.print("num["+j+"]'s rate:"+rate[j]+"%\t");
                    k++;
                    if(k==2){
                        System.out.println();
                        k=0;
                    }
                }
        System.exit(0);

    }
}
