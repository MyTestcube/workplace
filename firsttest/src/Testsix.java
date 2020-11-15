class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getInt() {
        return value;
    }

    public boolean isEven() {
        if (value%2!=0)
            return false;
        else
            return true;
    }

    public boolean isOdd() {
        if (value%2==0)
            return false;
        else
            return true;
    }

    public boolean isPrime() {
        if(value < 2) return false;

        for(int i = 2; i < value; ++i)

            if(value%i == 0) return false;

        return true;

    }
    public boolean equals(int x) {
        if(x==value)
            return true;
        else
            return false;
    }
    public  int parseInt(String x) {
        return Integer.parseInt(x);
    }
}



public class Testsix {

    public static void main(String[] args) {
        MyInteger myInteger=new MyInteger(10);
        System.out.println("调用getInt:"+myInteger.getInt()+
                "\n调用isEven():"+ myInteger.isEven()+
                "\n调用isOdd():"+myInteger.isOdd()+
                "\n调用isPrime():"+myInteger.isPrime()+
                "\n调用equals(int x):"+myInteger.equals(10)+
                "\n调用parseInt(String x):"+myInteger.parseInt("10"));


    }
}
