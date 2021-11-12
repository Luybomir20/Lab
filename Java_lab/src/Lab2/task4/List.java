package Lab2.task4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import static java.util.Collections.addAll;

public class List {
    private final java.util.List<Student> studentList;
    private final java.util.List<String> subjectList;
    private final Map <String, Map<Long, Integer>> map;

    public List(final String[] subjectList) {
        this.subjectList = new ArrayList<>();
        this.studentList = new ArrayList<>();
        addAll(this.subjectList, subjectList);

        this.map = new HashMap<>();
        for (final String subject : subjectList) {
            this.map.put(subject, new HashMap<>());
        }
    }

    public void addStudent(final Student student) {
        studentList.add(student);
    }

    public void addSubject(final String subject) {
        subjectList.add(subject);
    }

    public void infoAboutStudents() {
        for(final Student student: studentList) {
            System.out.print("id " + student.getId() + " Name - "+ student.getFirstName()+"  LastName - " +student.getLastName());

            subjectList.stream().map((subject) -> (subject) + " - " + getMark(subject, student.getId()) + "  ").forEach(System.out::print);
            System.out.println();
        }
    }

    public void setMark(final Long id, final String subject, final int mark) {
        final Map<Long, Integer> m = map.computeIfAbsent(subject, k -> new HashMap<>());
        m.put(id, mark);
    }

    public int getMark(final String subject, final long id) {
        final Map<Long, Integer> m = map.computeIfAbsent(subject, k -> new HashMap<>());
        final Integer mark = m.get(id);
        if (mark == null) {
            return 0;
        }
        return mark;
    }

    private int getMarksSum(final Long id) {
        int sum = 0;

        for (final String subject : subjectList) {
            sum += getMark(subject, id);
        }
        return sum;
    }

    public Long getBestStudentId() {
        Student bestStudent = null;
        int max=0;
        int sum;
        for (final Student student : studentList) {
            sum = getMarksSum(student.getId());
            if (sum > max) {
                max = sum;
                bestStudent = student;
            }
        }
        return bestStudent.getId();
    }

    public void getBestStudent() {
        final Long bestStudentId = getBestStudentId();
        System.out.print("id " + bestStudentId + " - ");

        subjectList.stream().map((subject) -> (subject) + " - " + getMark(subject, bestStudentId) + " ").forEach(System.out::print);
        System.out.println();
    }

    public Map<Long, Integer> getGrades(final String subject) {
        return map.get(subject);
    }

}