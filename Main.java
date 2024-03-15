import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> passedCourses = new ArrayList<>();
        passedCourses.add("Intro");
        passedCourses.add("Videregående");


        ArrayList<String> canTeach = new ArrayList<>();
        canTeach.add("Elev");
        canTeach.add("Læge");
        canTeach.add("Jurist");

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Student("Hans",passedCourses));
        persons.add(new Teacher("Ole", canTeach));

        ArrayList<Person> persons1 = new ArrayList<>();
        persons1.add(new Student("Jens",passedCourses));
        persons1.add(new Teacher("Klaus",canTeach));
        canTeach.add("Java 1.0");

        for (Person person: persons){
            boolean succes = person.addCourse("Java 1.0");
            if(succes == false){
                System.out.println(person.getName());
                if(person instanceof Student){
                    System.out.println("Har allerede bestået");
                }else{
                    System.out.println("Kan ikke undervise");
                }
            }
        }
    }
}
