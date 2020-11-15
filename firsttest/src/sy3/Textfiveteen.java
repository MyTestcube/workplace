package sy3;

class Point{
    public int x,y;

    public Point(){
        System.out.println(x);
        System.out.println(y);
    }
    public Point(int x,int y){
        this.x=x;
        this.y=y;
        System.out.println("x:"+this.x);
        System.out.println("y:"+this.y);
    }

    public void setall(int x,int y){
        this.x=x;
        this.y=y;
    }//将两个一起设置更简单
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void display(){

    }

    public String toString() {
        return "Point{" + "x=" + this.x + ", y=" + this.y + '}';
    }


    public boolean equals(Point p1,Point p2) {
        if (p1==p2) {
            return true;
        }else return false;


    }

}


public class Textfiveteen {
    public static void main(String[] args) {
        System.out.println("p1的 x，y:");
        Point p1=new Point(1,1);
        System.out.println("p2的 x，y:");
        Point p2=new Point(2,2);
        System.out.println("用setall改p1 的x,y=(1,34)");
        p1.setall(1,34);
        System.out.println("判断是否相等:"+p1.equals(p1,p2)+"\n调用toString:"+p1.toString()+"\n调用distance计算距离");

//        p1.setX(1);
//        p1.setY(2);
//        p1.getX();
//        p1.getY();
//        p1.equals(p1,p2);
        distance(p1,p2);
    }
    public static void distance(Point p1, Point p2){
        System.out.println(Math.sqrt(Math.pow(p1.x-p2.x,2)+Math.pow(p1.y-p2.y,2)));
    }
}
