package phone;

public class iPhoneFactory implements PhoneFactory{
    public Phone producePhone(){
        return new iPhone();
    }

}
