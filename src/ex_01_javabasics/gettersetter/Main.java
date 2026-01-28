// 1. Remove 'static' from the top-level class
 static class course{

    int course_id;
    String course_name;

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }
    course(int a,String b){
        this.course_id=a;
        this.course_name=b;
    }
}

static class student extends course{
    String stud_name;
    int Stud_id;


    public int getStud_id() {
        return Stud_id;
    }

    public void setStud_id(int stud_id) {
        Stud_id = stud_id;
    }

    public String getStud_name() {
        return stud_name;
    }

    public void setStud_name(String stud_name) {
        this.stud_name = stud_name;
    }
    student(String k,int p)
    { this.Stud_id=p;
     this.stud_name=k;
    super(p,k);

    }
}
public static void main(String[] args)
{
    student c1=new student("DSA course",34);
    System.out.println(c1.getStud_id()+" "+c1.getStud_id());
}