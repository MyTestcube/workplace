package sy3;

public class Students extends Person{

    private String cname;

    public void setCname(String cname){

        this.cname=cname;

    }
    public  String get(){
//        System.out.println("姓名:"+this.name+"年级:"+this.cname+"地址:"+this.position+" 电话:"+this.phone+" 电子邮箱地址:"+this.mail);
        return cname;
    }

//    public static void main(String[] args) {
//        Students a=new Students("陈宇锃 ","广东省普宁市 ","软件工程二班 ",158891566,"1322843909@qq.com");
//
//        a.display();
//    }
}
