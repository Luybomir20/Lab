package Lab2.task4;

public class Student {
    private Long id;
    private String firstName;
    private String lastName;

    public Student(final Long id,final String firstName,final String lastName ) {
        this.id = id;
        this.firstName = firstName;
        this.lastName=lastName;
    }

    public Long getId() {
        return id;
    }


    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}