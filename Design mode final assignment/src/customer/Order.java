package customer;

public class Order {
    private String name;
    private String goods;
    private String address;

    public Order(OrderBuilder builder){
        this.name=builder.getName();
        this.goods=builder.getGoods();
        this.address=builder.getAddress();
    }

    public void createOrder(){
        System.out.println("-----订单已经生成-----");
        if (name!=null){
            System.out.println("顾客姓名："+name);
        }
        System.out.println("购买商品："+goods);
        System.out.println("地址"+address);
    }
    public String getName(){
        return name;
    }

    public String getGoods(){
        return goods;
    }

    public String getAddress(){
        return address;
    }
}
