package Transformers;

public class Client {
    public static void main(String args[])
    {
        Transformer camaro;
        camaro=new Car();
        camaro.move();
        System.out.println("-----------------");

        Airplane bumblebee=new Airplane(camaro);

        bumblebee.move();
        bumblebee.fly();
        Robot robot=new Robot(camaro);
        robot.say();

    }
}