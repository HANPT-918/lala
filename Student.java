public class Student{
    public static void main(String[] args){

    }
    private int sid;
    private String name;
    private static int studentCnt=0;
    public Student(String name){
        setName(name);
        studentCnt++;
        this.sid=studentCnt;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public int getSid(){
        return sid;
    }
    public static int getStudentCnt(){
        return studentCnt+1;
    }
    public String toString(){
        return String.format("Student: %s, sid: %d",getName(),getSid());
    }
}


