package Transformers;

public class Airplane extends Changer{
    public Airplane(Transformer transform)
    {
        super(transform);
        System.out.println("吃到黄苹果！" );
    }
    public void fly()
    {
        System.out.println("可以趟水!（灰太狼无法趟水，可以甩开灰太狼）");
    }
}
