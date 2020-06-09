package Appearanceseries;

import java.util.Scanner;

public class Client {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        Solution a=new Solution();
        a.countAndSay(s);
    }
}
