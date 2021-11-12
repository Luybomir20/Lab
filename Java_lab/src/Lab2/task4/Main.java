package Lab2.task4;

public class Main {
    public static void main(final String[] args) {

        final List subjects = new List(new String[]{"Physics", "Math", "English"});

        final Student Luybomir = new Student(1L, "Luybomir", "Martsiniuk");
        final Student Volodimir = new Student(2L,"Volodinir","Shevchuk");
        final Student Anatolii = new Student(3L,"Anatolii","Boichuk");

        subjects.addStudent(Luybomir);
        subjects.addStudent(Volodimir);
        subjects.addStudent(Anatolii);


        subjects.setMark( 1L,"English", 4);
        subjects.setMark( 1L,"Math", 4);//Student 1
        subjects.setMark( 1L,"Physics", 2);

        subjects.setMark( 2L,"English", 3);
        subjects.setMark( 2L,"Math", 5);//Student 2
        subjects.setMark( 2L,"Physics", 4);

        subjects.setMark( 3L,"English", 4);
        subjects.setMark( 3L,"Math", 2);//Student 3
        subjects.setMark( 3L,"Physics", 5);

        subjects.infoAboutStudents();// display all info about students
        System.out.println();

        System.out.println("added new subject TIMS ");
        System.out.println();

        subjects.addSubject("TIMS");//add new subject

        subjects.setMark( 1L,"TIMS", 2);//added mark to a new subject
        subjects.setMark( 2L,"TIMS", 4);
        subjects.setMark( 3L,"TIMS", 3);

        subjects.infoAboutStudents();
        System.out.println();

        System.out.println("Student with the highest grades");
        subjects.getBestStudent();  //the highest average grades
        System.out.println();

        System.out.println("Grades from given subjects");
        System.out.println(subjects.getGrades("English"));


    }
}
