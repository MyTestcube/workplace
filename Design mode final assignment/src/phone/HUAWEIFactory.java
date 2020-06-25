package phone;

public class HUAWEIFactory implements PhoneFactory{
    public Phone producePhone(){
        return new HUAWEI();
    }

}
