package sy4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Text11 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入一串字符");
        String t = s.next();
        System.out.println("请输入要查询次数的字符");
        String t1=s.next();
        String y = null;
        String[] A = new String[t.length()];
        for (int o = 0; o < t.length(); o++) {
            A[o] = t.substring(o, o + 1);
            //System.out.println(A[o]);
        }
        s(A, t1);
        //System.out.println(s(A, t1));
        int l=0;
        if(A[0].equals(t1)) {
            l++;
        }if(A[A.length-1].equals(t1)) {
            l++;
        }
        System.out.println("字符"+t1+"在"+t+"中出现的次数为"+(s(A, t1)+l));
    }
    static int s(String[]A,String t1) {
        int count = 0;
        for (int p = 0; p < A.length; p++) {
            for (int q = 1; q < A.length - 1; q++) {
                if (A[p] == (A[q]) && A[p].equals(t1+"")) {
                    // System.out.println("p的值为"+A[p]+",q的值为"+A[q]);
                    count++;
                    //System.out.println(count);
                }
            }

        }return count;
    }
}
