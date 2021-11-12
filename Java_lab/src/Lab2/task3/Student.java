package Lab2.task3;

public class Student {
    private String firstName;
    private String lastName;
    Subject subject=new Subject();
    Mark mark=new Mark();


    Student(final String firstName,final String lastName,final String subject,final int mark){
        this.firstName=firstName;
        this.lastName=lastName;
        this.subject.setSubject(subject);
        this.mark.setMark(mark);
    }

    public Student(){//default
        firstName="null";
        lastName="null";
        subject.setSubject("null");
        mark.setMark(0);

    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName=" + firstName +
                ", lastName=" + lastName +" "+subject+" "+mark+
                '}';
    }
}


