package sy4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static javax.swing.UIManager.get;

public class Text10 {
    public static void main(String[] args) throws IOException {
        String str ,s,c;
        System.out.println("请输入一个字符串：");
        BufferedReader buf1= new BufferedReader(new InputStreamReader(System.in));
        str = buf1.readLine();
        System.out.println("请输入一个要删除的字符：");
        BufferedReader buf2= new BufferedReader(new InputStreamReader(System.in));
        c = buf2.readLine();
//        str.replaceFirst(""+c, "");
        System.out.println(str.replaceFirst(c, ""));

    }
}
