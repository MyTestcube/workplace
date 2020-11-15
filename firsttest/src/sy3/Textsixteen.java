package sy3;

class Vehicles{
    public String size,color,seats;
    public Vehicles(){
        this.size=null;
        this.color=null;
        this.seats=null;
    }
    public Vehicles(String size,String color,String seats){
        this.size=size;
        this.color=color;
        this.seats=seats;
    }
    public void display(){
        System.out.println(size+" "+color+" "+seats);
    }
}

class Car extends Vehicles{
    private String name;
    public Car(String name,String size,String color,String seats){
        this.name=name;
        this.size=size;
        this.color=color;
        this.seats=seats;
    }
    public void display(){
        System.out.println(name+" "+size+" "+color+" "+seats);
    }
}

public class Textsixteen {
    public static void main(String args[]){
        Car car=new Car("car","small","black","big");
        car.display();
    }

}
