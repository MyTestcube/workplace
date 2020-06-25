package Agent;

public class DeliverMethod implements DeliverGoods{
    boolean flag;


    public DeliverMethod(boolean flag){
        this.flag=flag;


    }
    @Override
    public  String sendCoke(String method){
        return null;
    }

    @Override
    public String selectMethod() {
        if (flag) {
            DeliverGoods express = new Express(flag);
            return express.sendCoke("快递公司代理");
        } else {
            DeliverGoods tradition=new Tradition(flag);
            return tradition.sendCoke("到店自取");
        }
    }
}

