package sy4;

import sy3.C;

import java.util.Scanner;

class Circle{

    public double area(double r){
        return (3.14)*r*r;
   }
}

public class Text14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入园的半径：");
        String t=s.next();
        double num=Double.parseDouble(t);
        Circle c=new Circle();
        num=c.area(num);
        System.out.println("面积为："+num);
    }

}
