
class MyPoint{
    private double x;
    private double y;
    public MyPoint(){
        x=0;
        y=0;
    }
    public MyPoint(double x,double y){
        this.x=x;
        this.y=y;
    }


    public double getX(){
        return x;
    }
    public double gety(){
        return y;
    }

    public double distance(double x1,double y1,double x2,double y2){
        return Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
    }
}

public class Testseven {
    public static void main(String[] args) {
        MyPoint myPoint=new MyPoint();
        System.out.println(myPoint.distance(2,3,10,30.5));
    }
}
