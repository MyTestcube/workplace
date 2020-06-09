public abstract class IgoChessman {
    public abstract String getColor();

    public void display(){
        System.out.println("棋子颜色："+this.getColor());
    }
}
