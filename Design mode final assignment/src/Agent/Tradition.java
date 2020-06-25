package Agent;

public class Tradition implements DeliverGoods{
    boolean flag;
    String m=null;
    public Tradition(boolean flag){
        this.flag=flag;
    }
    public String sendCoke(String method){
        if (flag==false){
            m=method;
        }
        return "您的订单已经生成，请持订单到线下各大"+m+"，谢谢！";
    }
    public String selectMethod(){
        return null;
    }
}

