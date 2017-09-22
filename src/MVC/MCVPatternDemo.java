package MVC;

/**
 * Created by hoang on 22/09/2017.
 */
public class MCVPatternDemo {

    private static Student fakeStudent(){
        Student student = new Student();
        student.setName("hoang");
        student.setRollNo("22");
        return student;
    }

    public static void main(String[] args) {
        Student student = fakeStudent();
        StudentView studentView = new StudentView();
        StudentController studentController = new StudentController(student, studentView);
        studentController.updateView();//display smt

        studentController.setStudentName("giang");
        studentController.setStudentRoll("33");
        studentController.updateView();
    }
}
