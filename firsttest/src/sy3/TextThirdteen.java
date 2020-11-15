package sy3;
class A1{
    public final void f(String s){
        char cStart='a',cEnd='z';
        for(char c=cStart;c<=cEnd;c++){
            System.out.println("  "+c);
        }
    }
}
class B1 extends A1{
   public void g(String s){
       char cStart='啊',cEnd='锃';
       for(char c=cStart;c<=cEnd;c++){
           System.out.println("  "+c);
       }
   }
}
public class TextThirdteen {
    public static void main(String[] args) {
        B1 b=new B1();
        b.f("abc陈宇锃");
        b.g("abc陈宇锃");
    }
}
