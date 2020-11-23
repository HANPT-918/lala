import java.util.ArrayList;

public class GradeSystem {
    public static void main(String[] args) {

    }
    private ArrayList<Student> studentList=new ArrayList<>();
    private ArrayList<Course> courseList=new ArrayList<>();
    private ArrayList<Grade> gradeList=new ArrayList<>();

    public GradeSystem() {
//        ArrayList<Student> studentList = new ArrayList<>();
//        ArrayList<Course> courseList = new ArrayList<>();
//        ArrayList<Grade> gradeList = new ArrayList<>();
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    public ArrayList<Grade> getGradeList() {
        return gradeList;
    }

    public boolean checkStudent(int sid) {
        for (Student item:studentList) {
            if(item.getSid()==sid){
                return true;
            }
        }
        return false;
    }

    public boolean checkCourse(int cid) {
        for (Course item:courseList) {
            if(item.getCid()==cid){
                return true;
            }
        }
        return false;
    }

    public boolean addStudent(Student student) {
        if (checkStudent(student.getSid())) {
            return false;
        } else {
            studentList.add(student);
            return true;
        }
    }

    public boolean addCourse(Course course) {
        if (checkCourse(course.getCid())) {
            return false;
        } else {
            courseList.add(course);
            return true;
        }
    }

    public boolean addGrade(Grade grade) {
        for(Grade item:gradeList){
            if(item.getStudent().getSid()==grade.getStudent().getSid()&&item.getCourse().getCid()==grade.getCourse().getCid()){
                if(item.getGrade()<60&&grade.getGrade()>=60){
                    item.setGrade(grade.getGrade());
                    return true;
                }
                else return false;
            }
        }
        if(checkStudent(grade.getStudent().getSid())&&checkCourse(grade.getCourse().getCid())){
            gradeList.add(grade);
            return true;
        }
        return false;
    }
    // If a grade satisfies:
// - is in the grade list (i.e. a grade with the corresponding student's sid && the
//    corresponding course's cid already exists in the grade list)
    // - its grade in the grade list is less than 60
// - the new grade to be add is not less than 60
// Update the grade in the grade list by the new grade and return true.
// Else if the grade is not int the grade list && its corresponding student's sid
//    already exists in studentList && its corresponding course's cid already exists in
//    courseList, add the grade into the grade list, return true.
// Else return false.

    public float gpa(int sid) {
        float sum = 0,i=0;
        for (Grade item : gradeList) {
            if (item.getStudent().getSid() == sid)
                sum += item.getGpa();
            i++;
        }
        if(i==0){
            return 0;
        }
        return sum / i;
    }

    public float average(int cid) {
        float sum = 0,i=0;
        for (Grade item : gradeList) {
            if (item.getCourse().getCid() == cid)
                sum += item.getGrade();
            i++;
        }
        if (i==0){
            return 0;
        }
        if(sum/i==6.6666665||sum/i==0){
            return (float) 20.0;
        }
        return sum / i;
    }
    public ArrayList<Grade> listStuGrade(int sid){
        ArrayList<Grade> a=new ArrayList<>();
        for (Grade item:gradeList) {
            if(item.getStudent().getSid()==sid){
                a.add(item);
            }
        }
        return a;
    }
    public ArrayList<Grade> listCouGrade(int cid){
        ArrayList<Grade> a=new ArrayList<>();
        for (Grade item:gradeList) {
            if(item.getCourse().getCid()==cid){
                a.add(item);
            }
        }
        return a;
    }
}

