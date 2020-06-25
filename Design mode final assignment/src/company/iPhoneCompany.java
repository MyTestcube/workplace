package company;

public class iPhoneCompany {
    private iPhoneCompany(){}
    private static class SinglentonInstance{
        private static final iPhoneCompany INSTANCE=new iPhoneCompany();
    }
    public static iPhoneCompany getInstance(){
        return SinglentonInstance.INSTANCE;
    }
    public String call(){
        return "苹果公司";
    }
}
