public class Grade{
    public static void main(String[] args) {

    }
    private Course course;
    private Student student;
    private float grade;
    private float gpa;
    public Grade(Course course,Student student,float grade){
        this.course=course;
        this.student=student;
        this.grade=grade;
        this.gpa=calGpa(grade);
        setGrade(grade);
    }
    public static float calGpa(float grade){
        float a=0;
        if(grade<=59&&grade>=0){
            a=0;
        }
        else if(grade<=62&&grade>=60){
            a=(float) 1.15;
        }
        else if(grade<=66&&grade>=63){
            a=(float)1.63;
        }
        else if(grade<=69&&grade>=67){
            a=(float)2.08;
        }
        else if(grade<=72&&grade>=70){
            a=(float)2.42;
        }
        else if(grade<=76&&grade>=73){
            a=(float)2.78;
        }
        else if(grade<=79&&grade>=77){
            a=(float)3.09;
        }
        else if(grade<=82&&grade>=80){
            a=(float)3.32;
        }
        else if(grade<=86&&grade>=83){
            a=(float)3.55;
        }
        else if(grade<=89&&grade>=87){
            a=(float)3.73;
        }
        else if(grade<=92&&grade>=90){
            a=(float)3.85;
        }
        else if(grade<=96&&grade>=93){
            a=(float)3.94;
        }
        else if(grade<=100&&grade>=97){
            a=(float)4.00;
        }
        return a;
    }
    public void setGrade(float grade) {
        if(grade<0) return;
        this.grade=grade;
        this.gpa=calGpa(grade);
    }
    public float getGpa(){
        return gpa;
    }
    public Course getCourse(){
        return course;
    }
    public Student getStudent(){
        return student;
    }

    public float getGrade() {
        return grade;
    }
    public String toString(){
        return String.format("sid: %d, cid: %d, grade: %.1f, gpa: %.2f",getStudent().getSid(),getCourse().getCid(),getGrade(),getGpa());
    }
}

