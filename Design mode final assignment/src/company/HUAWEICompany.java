package company;

import phone.HUAWEI;

public class HUAWEICompany {
    private HUAWEICompany(){}
    private static class SingletonInstance {
        private static final HUAWEICompany INSTANCE = new HUAWEICompany();
    }


    public static HUAWEICompany getInstance(){
        return SingletonInstance.INSTANCE;
    }
    public String call(){
        return "华为公司";
    }

}
