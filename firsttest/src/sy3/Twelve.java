package sy3;

public class Twelve {
    public static void main(String[] args) {
        Person a=new Person();
        Students s=new Students();
        Employee e=new Employee();
        Faculty f=new Faculty();
        f.title="  普通人";
        a.setall("陈宇锃 ","广东省 ","123@qq.com ",132);
        s.setCname("18软件工程二班  ");
        e.em("101  ",10000);
        System.out.println(a.toString()+s.get()+e.get()+f.title);
    }
}
