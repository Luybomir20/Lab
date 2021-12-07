package Lab3.task3;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Student {

        public List<Mark> getMarks() {
            return marks;
        }

        public void setMarks(final List<Mark> marks) {
            this.marks = marks;
        }

        private  Long id;
        private  String firstName;
        private  String lastName;
        private String fatherName;
        private  int age;
        private  List<Mark> marks;

        public void setId(final Long id) {
            this.id = id;
        }

        public void setFirstName(final String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(final String lastName) {
            this.lastName = lastName;
        }

        public void setAge(final int age) {
            this.age = age;
        }

        public Student(final Long id, final String firstName, final String lastName, final String fatherName, final int age) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.fatherName = fatherName;
            this.age = age;
        }

        public Student(final Long id, final String firstName, final String lastName, final String fatherName, final int age, final List<Mark> marks)
        {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.fatherName = fatherName;
            this.age= age;
            this.marks = marks;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getFatherName() {
            return fatherName;
        }

        public void setFatherName(final String fatherName) {
            this.fatherName = fatherName;
        }

        public int getAge() {
            return age;
        }


        public Long getId() {
            return id;
        }

        @Override
        public String toString() {
            return firstName + " "  + lastName +" "+fatherName+" " + age  + "\n\t" +
                    marks.stream().map(mr -> mr.toString()).collect(Collectors.joining("\n\t")) +
                    "\n\tAverage mark: "+getAverageMark() ;
        }

        public void addMark(final Mark mark)
        {
            marks.add(mark);
        }

        public double getAverageMark()
        {
            return marks.stream()
                    .mapToInt(Mark::getTypeMark).average().getAsDouble();

            //.mapToInt(Mark->Mark.getTypeMark()).average().getAsDouble(); //and so

        }

        public List<Mark> printMarkEnglish() {
            return marks.stream()
                   .filter (sub->sub.getSubjectName ().equals ("English"))
                  .distinct()//delete dublicate
                   .collect(Collectors.toList());//add my colections

        }
    }





