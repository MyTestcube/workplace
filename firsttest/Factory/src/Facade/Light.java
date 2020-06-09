package Facade;

public class Light {
    private String posotion;
    public Light(String posotion)
    {
        this.posotion=posotion;
    }
    public void on()
    {
        System.out.println(this.posotion+"灯打开！");
    }
    public void off()
    {
        System.out.println(this.posotion+"灯关闭！");
    }
}
