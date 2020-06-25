package Message;

public class Message {
    String sender;
    Recipient recipient;
    public Message(String sender,Recipient recipient){
        this.sender=sender;
        this.recipient=recipient;
    }

    public Object clone(){
        Message clone=null;
        try{
            clone=(Message) super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return  clone;
    }
    public String getSender(){
        return sender;
    }

    public void setSender(String sender){
        this.sender=sender;
    }

    public Recipient getRecipient(){
        return recipient;
    }
    public void setRecipient(Recipient recipient){
        this.recipient=recipient;
    }
}
