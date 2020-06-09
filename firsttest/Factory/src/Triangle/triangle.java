package Triangle;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class triangle {
    public static void main(String[] args)
    {
        String str1= JOptionPane.showInputDialog("输入第一边长");
        double n1=Double.parseDouble(str1);
        String str2=JOptionPane.showInputDialog("输入第二边长");
        double n2=Double.parseDouble(str2);
        String str3=JOptionPane.showInputDialog("输入第三边长");
        double n3=Double.parseDouble(str3);
        triangle dlk=new triangle();
        System.out.println("您输入的是："+n1+", "+n2+", "+n3);
        dlk.fn(n1,n2,n3);
    }
    public static void fn(double n1,double n2,double n3)
    {

        if((n1+n2>n3)&&(n3+n2>n1)&&(n1+n3>n1))
        {
            System.out.println("该图形是三角形");
            String x= new String();
            String y= new String();

            x=right.test(n1,n2,n3);
            y=isosceles.text(n1,n2,n3);

            System.out.println(x+y);
        }
        else
        {
            System.out.println("不可以构成三角形");
        }
    }

}

