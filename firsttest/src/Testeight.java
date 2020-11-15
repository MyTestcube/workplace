class Course{
    private int cNumber;
    private String cName;
    private int cuit;

    public Course(int cNumber,String cName,int cuit){
        this.cName=cName;
        this.cuit=cuit;
        this.cNumber=cNumber;
    }

    public void printCourseInfo(){
        System.out.println("课程编号:"+cNumber+"\n课程名:"+cName+"\n学分数:"+cuit);
    }

}



public class Testeight {
    public static void main(String[] args) {
        Course  course=new Course(123,"高等数学",4);
        course.printCourseInfo();
    }
}
