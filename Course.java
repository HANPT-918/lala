public class Course {
    public static void main(String[] args){

    }
    private int cid;
    private String name;
    private static int courseCnt=0;
    public Course(String name){
        setName(name);
        courseCnt++;
        this.cid=courseCnt;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }
    public int getCid(){
        return cid;
    }
    public static int getCourseCnt(){
        return courseCnt+1;
    }
    public String toString(){
        return String.format("Course: %s, cid: %d",getName(),getCid());
    }
}
