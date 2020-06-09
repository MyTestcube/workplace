package Transformers;

public final class Car implements Transformer{
    public Car()
    {
        int life=5;
        System.out.println("喜羊羊有5条命（被灰太狼咬到就少一条命）");
        System.out.println("吃到绿苹果！");
    }
    public void move()
    {
        System.out.println("加速奔跑！（灰太狼追不到喜羊羊）");
    }
}
