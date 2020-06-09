package beans;

public class Student {
    private String stuno;
    private String stuname;
    public Student(){ }

    public String getStuno(){return stuno;}
    public void setStuno(String stuno){
        this.stuno=stuno;
    }

    public String getStuname(){return stuname; }
    public void setStuname(String stuname){
        this.stuname=stuname;
    }
}
