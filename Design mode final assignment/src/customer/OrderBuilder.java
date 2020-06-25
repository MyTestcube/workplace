package customer;

public class OrderBuilder {
    private String name;
    private String goods;
    private String address;

    public OrderBuilder(String name,String goods,String address){
        this.name=name;
        this.goods=goods;
        this.address=address;
    }

    public Order create(){
        return new Order(this);
    }


    public String getName(){
        return  name;
    }
    public String getGoods(){
        return goods;
    }
    public String getAddress(){
        return address;
    }
}
