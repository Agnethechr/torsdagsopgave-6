import java.util.ArrayList;

public class Teacher extends Person{

    ArrayList<String> canTeach = new ArrayList<>();
    ArrayList<String> currentCourses = new ArrayList<>();
    public Teacher(String name, ArrayList<String> canTeach) {
        super(name);
        this.canTeach = canTeach;
    }

    public boolean addCourse(String course){
        if(canTeach.contains(course)) {
        return false;
        }else{
            canTeach.add(course);
            return true;
        }
    }
}
