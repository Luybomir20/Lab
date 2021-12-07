package Lab3.task3;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Group {

        private final List<Student> students;


        public Group(final List<Student> students) {
            this.students = students;
        }

        private  List<Student> addStudent(final Student student){
            students.add (student);
            return students;
        }

        public void bestStudentStream() {
            students.stream()
                    .reduce((s1, s2) -> s1.getAverageMark() > s2.getAverageMark () ? s1 : s2)
                    .ifPresent (System.out::println );
        }

        public List<Student> filterUser(){
            return students.stream().
                    filter(e -> e.getAverageMark () > 3.0)
                    .collect(Collectors.toList ());
        }

        public List<List<Mark>> filterEnglish(){
            return students.stream()
                    .map (Student::printMarkEnglish)
                    .collect(Collectors.toList ());
        }


        @Override
        public String toString() {
            return students.stream().map(Student::toString).collect(Collectors.joining("\n"));
        }
        public Student getTheBestMarksWithStudent()
        {
            final List<Student> arrayList = new ArrayList<Student> (students);
            arrayList.sort(Comparator.comparingDouble(Student::getAverageMark).reversed());//sort descending(на спад)
            return arrayList.get(0);//We return 0 element
        }

        public List<Student> getStudents() {
            return students;
        }

        public String getPrintLastName() {
            return students.stream()
                    .map(Student::getLastName)
                    .reduce((s1, s2) -> s1 + "-" + s2).orElse("Null, don't Lastname");//If the value is empty
        }

        public void sortListStudents() {//Sorting students
            students.sort (
                    Comparator.comparing (Student::getFirstName)
                            .thenComparing (Student::getLastName)
                            .thenComparing (Student::getFatherName)
                            .thenComparingDouble (Student::getAverageMark));
        }

    }


