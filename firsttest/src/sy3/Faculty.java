package sy3;

public class Faculty extends Employee{
    String title;
   public String toSring(){
       return "办公室:"+super.office+"薪水:"+super.salary+"称号:"+title;
   }
}
