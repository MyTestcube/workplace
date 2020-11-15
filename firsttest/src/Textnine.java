class Account{
    private int id;
    private double balance;
    private double annualInterestRate;
    private String  dateCreated;

    public Account(){
        id=0;
        balance=0;
        annualInterestRate=0;
        dateCreated="2020.01.01";
    }
    public int getid(){
        return id;//获得id账号
    }
    public void setid(int id){
        this.id=id;//修改id账号
    }
    public double getbalance(){
        return balance;//获得账户余额
    }
    public void setbalance(int balance){
        this.balance=balance;//修改账户余额
    }
    public double getannualInterestRate(){
        return annualInterestRate;//获得年利率
    }
    public void setannualInterestRate(double annualInterestRate){
        this.annualInterestRate=annualInterestRate;//修改年利率
    }
    public String  getdateCreated(){
        return dateCreated;//获得开户的日期
    }

    public  double getMonthlyInterestRate(){
        return annualInterestRate/12;
    }


    public double withDraw(double x){
        return balance-=x;
    }

    public double deposit(double x){
        return balance+=x;
    }

}



public class Textnine {
    public static void main(String[] args) {
        Account account=new Account();
        account.setid(1122);
        account.setbalance(20000);
        account.setannualInterestRate(0.045);
       System.out.println(
               "查看账户余额："+account.getbalance()+"\n取出2500，查看账户余额："+account.withDraw(2500)+"\n存入3000，查看账户余额："+account.deposit(3000)+"\n月利率："+account.getMonthlyInterestRate()+ "\n账户创建时间："+account.getdateCreated());
    }
}
