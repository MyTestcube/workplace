package sy4;

import static java.lang.StrictMath.atan;

public class Text7 {
    public static void main(String[] args) {
        int x=10;
        int y=2;
        double d=10.01;
        int a;
        System.out.println("x="+x+",y="+y);
        System.out.println("x的y次方"+Math.pow(x,y));
        if (x>y){
            a=y;
        }else a=x;
        System.out.println("x和y的最小值:"+a);
        System.out.println("d="+d);
        System.out.println("d取整后的结果"+(a=(int)d));
//        System.out.println(d);
        System.out.println("向上取整:" + (int) Math.ceil(d));//  (去掉小数凑整:不管小数是多少，都进一)
        System.out.println("向下取整" + (int) Math.floor(d));//  (去掉小数凑整:不论小数是多少，都不进位)
        System.out.println("四舍五入取整:" + Math.round(d));//
        System.out.println("四舍五入取整:" + Math.round(d));//
        System.out.println("atan(d)的数值"+atan(d));
    }
}
