package beans;

public class UserBean {
    private String username=null;
    private String password=null;
    public UserBean(){}
    public void setUsername(String value){
        username=value;
    }

    public String getUsername(){
        return username;
    }

    public void setPassword(String value){
        password=value;
    }

    public String getPassword(){
        return password;
    }
}
