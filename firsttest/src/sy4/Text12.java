package sy4;

public class Text12 {
    public static void main(String[] args) {
        String a="Let us study Java";
        String Upstr = a.toUpperCase();
        String Lowstr = a.toLowerCase();
        a.toString().replaceAll("  ","#");
        System.out.println(a+"\n大写："+Upstr+"\n小写："+Lowstr+"\n替换："+a.toString().replaceAll(" ","#"));
    }
}
