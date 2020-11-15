
class Rectangle {
    private  double width;
    private double height;
    private String  color;

    public Rectangle(double width, double height, String  color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double getwidth() {
        return width;//获得宽
    }

    public void setwidth(int width) {
        this.width = width;//更改宽

    }

    public double getheight() {
        return height;//获得长
    }

    public void setheight(int height) {
        this.height = height;//更改长

    }

    public String  getcolor() {
        return color;//获得颜色
    }
    public void setcolor(String  color){
        this.color=color;//更改颜色

    }

    public void printcolor() {//输出颜色
        System.out.println("颜色："+color);
    }
    public void getArea(){//输出面积
        System.out.println("面积："+height*width);
    }
    public void getPerimeter(){//输出周长

        System.out.println("周长："+(height+width)*2);
    }
}


public class TestFive {
    public static void main(String[] args) {
        Rectangle md = new Rectangle(3.5/*4*/, 35.9/*40*/, "红色"/*"黄色"*/);
        md.printcolor();
        md.getArea();
        md.getPerimeter();
    }
}
