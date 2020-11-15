package sy3;

public class Employee extends Person{
    public String office;
    double salary;
//    public String level;
//    public String post;
//    public String wages;
//    public String data;
    public void em(String office,double salary){
        this.office=office;
        this.salary=salary;
    }
    public String get(){

        return "办公室:"+office+"薪水:"+salary;
    }

}
