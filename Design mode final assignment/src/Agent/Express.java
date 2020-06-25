package Agent;

public class Express implements DeliverGoods{
    boolean flag;
    String m=null;

    public Express(boolean flag) {
        this.flag=flag;
    }

    public  String sendCoke(String method){
        if (flag==true){
            m=method;
        }
        return "您的订单已经生成，已经通过"+m+"方式为你发货，请注意查收";
    }
    public String selectMethod(){
        return null;
    }

}
