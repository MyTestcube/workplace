package beans;

public class UserCheckBean {
    private String username=null;
    private String password=null;
    public UserCheckBean(){}

    public void setUsername(String value){username=value;}
    public String getUsername(){return username;}
    public void setPassword(String value){password=value;}
    public String getPassword(){return password;}

    public boolean check(){
        if (username.equals("admin") && password.equals("12345")){
            return true;
        }
        else {
            return false;
        }
    }
}
