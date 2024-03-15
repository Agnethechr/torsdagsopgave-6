import java.util.ArrayList;

public class Student extends Person{


    ArrayList<String> passedCourses = new ArrayList<>();
    ArrayList<String> currentCourses = new ArrayList<>();
    public Student(String name, ArrayList<String> passedCourses){
    super(name);
    this.passedCourses = passedCourses;
    }

    public boolean addCourse(String course){
        if(passedCourses.contains(course)) {
        return true;
        }else{
            passedCourses.add(course);
            return true;
        }
    }
}
