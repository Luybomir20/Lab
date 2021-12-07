package Lab3.task3;

public class Subject {
    private long id;
    private String nameSubject;

    public Subject(final long id, final String nameSubject) {
        this.id = id;
        this.nameSubject = nameSubject;
    }

    public Subject() {
    }

    public long getId() {
        return id;
    }

    public void setId(final long id) {
        this.id = id;
    }

    public String getNameSubject() {
        return nameSubject;
    }

    public void setNameSubject(final String nameSubject) {
        this.nameSubject = nameSubject;
    }


    @Override
    public String toString() {
        return nameSubject;

    }

}


