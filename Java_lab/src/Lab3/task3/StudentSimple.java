package Lab3.task3;

    import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

    public class StudentSimple {
        private  Long id;
        private  String firstName;
        private  String lastName;
        private  String fatherName;
        private  double age;

        public StudentSimple(final Long id, final String firstName, final String lastName, final String fatherName, final double age) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.fatherName = fatherName;
            this.age = age;
        }

        public StudentSimple() {

        }

        public StudentSimple(final Student student) {
            this.id = student.getId ();
            this.firstName =student.getFirstName ();
            this.lastName = student.getLastName ();
            this.fatherName = student.getFatherName ();
            this.age = student.getAge ();
        }

        public Long getId() {
            return id;
        }

        public void setId(final Long id) {
            this.id = id;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(final String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(final String lastName) {
            this.lastName = lastName;
        }

        public String getFatherName() {
            return fatherName;
        }

        public void setFatherName(final String fatherName) {
            this.fatherName = fatherName;
        }

        public double getAge() {
            return age;
        }

        public void setAge(final double age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "StudentSimple{" +
                    "id=" + id +
                    ", firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", fatherName='" + fatherName + '\'' +
                    ", age=" + age +
                    '}';
        }

        public List<StudentSimple> transformationList(final List<Student> students) {
            return students.stream()
                    .map(StudentSimple::new)
                    .collect(Collectors.toList());
        }

    }


