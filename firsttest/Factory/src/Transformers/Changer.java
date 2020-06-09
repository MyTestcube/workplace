package Transformers;

public class Changer implements Transformer{
    private Transformer transform;
    public  Changer(Transformer transform)
    {
        this.transform=transform;
    }
    public void move()
    {
        transform.move();
    }
}
