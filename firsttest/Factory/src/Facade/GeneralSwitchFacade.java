package Facade;

public class GeneralSwitchFacade {
    private Light light[]=new Light[4];
    private Sensor sensor;
    private Alarm ac;
    private Camera tv;
    public GeneralSwitchFacade()
    {
        light[0]=new Light("左前");
        light[1]=new Light("右前");
        light[2]=new Light("左后");
        light[3]=new Light("右后");
        sensor =new Sensor();
        ac=new Alarm();
        tv=new Camera();
    }
    public void on()
    {
        light[0].on();
        light[1].on();
        light[2].on();
        light[3].on();
        sensor.on();
        ac.on();
        tv.on();
    }
    public void off()
    {
        light[0].off();
        light[1].off();
        light[2].off();
        light[3].off();
        sensor.off();
        ac.off();
        tv.off();
    }
}
