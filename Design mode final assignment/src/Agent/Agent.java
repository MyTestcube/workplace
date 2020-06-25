package Agent;

import Message.Message;

public class Agent {
    private Message message;
    private Agent(){}
    private static  class SingletonInstance{
        private static final Agent INSTANCE=new Agent();
    }

    public static Agent getInstance(){
        return SingletonInstance.INSTANCE;
    }


    public String call(){
        return "Agent";
    }

    public Message getMessage(){
        return message;
    }

    public void setMessage(Message message){
        this.message=message;
    }


}
