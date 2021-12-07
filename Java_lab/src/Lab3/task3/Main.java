package Lab3.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


    public class Main {
        public static void main(final String[] args) {
            final Subject physics = new Subject (1L,"Physics");
            final Subject english = new Subject (2L,"English");
            final Subject math = new Subject (3L,"Mathematics");

            final List<Subject> subjects = new ArrayList<> (Arrays.asList(
                    physics,
                    english,
                    math
            ));
            final List<Student> students = new ArrayList<Student> (List.of (
                    new Student (11L,"Luybomir","Martsiniuk","Vasyliovich",20,List.of (
                            new Mark (5,5,physics),
                            new Mark (6,4,english),
                            new Mark (7,4,math)
                    )),
                    new Student (12L,"Yuriy","Ivanov","Petrovych",18,List.of (
                            new Mark (8,3,physics),
                            new Mark (9,2,english),
                            new Mark (10,3,math)
                    )),
                    new Student (13L,"Anna","Cosolovich","Maxymivna",20,List.of (
                            new Mark (11,5,physics),
                            new Mark (12,5,english),
                            new Mark (13,5,math)
                    ))
            ));
            final Group group = new Group ( students);


            final StudentSimple studentSimple = new StudentSimple();
            studentSimple.transformationList(students);
            System.out.println (studentSimple.toString ());


            System.out.println ("\nThe best student:");
            group.bestStudentStream ();
            System.out.println ("\nThe average mar of students is above 3 ");
            System.out.println ("\nLast name through dashes: "+group.filterUser ());

            System.out.println (group.getPrintLastName ());
            System.out.println ("Marks English: \n"+group.filterEnglish ());
            group.sortListStudents ();
            System.out.println(group.toString ());

        }
    }


