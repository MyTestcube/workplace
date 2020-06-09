package Transformers;

public class Robot extends Changer{
    public Robot(Transformer transform)
    {
        super(transform);
        System.out.println("吃到红苹果！");
    }
    public void  say()
    {
        System.out.println("产生保护罩！（抵消灰太狼的一次攻击）");
    }
}
