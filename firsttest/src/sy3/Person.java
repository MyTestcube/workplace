package sy3;

 class Person {
    public String name;
    public String position;
    public int phone;
    public String mail;

    public void setall(String name,String position,String mail,int phone){
        this.mail=mail;
        this.position=position;
        this.phone=phone;
        this.name=name;
    }



     public String toString() {
            return " 名字:"+name+" 地址:"+position+" 电话:"+phone+" 电子邮箱:"+mail;
     }
 }