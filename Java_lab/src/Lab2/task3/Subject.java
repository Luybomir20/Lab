package Lab2.task3;

public class Subject  {
 private String subject;


    public String getSubject() {
        return subject;
    }

    public void setSubject(final String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subject=" + subject +
                '}';
    }
}
