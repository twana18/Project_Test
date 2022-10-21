package providers;

import Enums.SchoolStudyType;
import characters.Student;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StudentsProvider {
    final static String [] zanstySubjects = {"Math", "Science", "Chemistry", "Physic", "Arabic", "English","Kurdish"};
        public static List<Student> zanstyStudents = Arrays.asList(
                new Student(
                        "s_1",
                        "Twana Abubakr Abdulla",
                        "12345678",
                        "Male",
                        "20-4-2003",
                        SchoolStudyType.Zansty,
                        Arrays.asList(zanstySubjects),
                        Arrays.asList(96.00, 100.00, 88.00, 100.00, 98.00, 98.00, 100.00)
                        ),
                new Student(
                        "s_2",
                        "Emad Adil Qadr",
                        "12345678",
                        "Male",
                        "10-5-2002",
                        SchoolStudyType.Zansty,
                        Arrays.asList(zanstySubjects),
                        Arrays.asList(98.00, 90.00, 94.00, 96.00, 92.00, 98.00, 100.00)
                )
        );

    public static List<Student> wezhaiyStudents = Arrays.asList(
            new Student(
                    "s_1",
                    "Twana Abubakr Abdulla",
                    "12345678",
                    "Male",
                    "20-4-2003",
                    SchoolStudyType.Wezhaiy,
                    Arrays.asList("Math", "Science", "Chemistry", "Physic", "Arabic", "English","Kurdish"),
                    Arrays.asList(96.00, 100.00, 88.00, 100.00, 98.00, 98.00, 100.00)
            ),
            new Student(
                    "s_2",
                    "Emad Adil Qadr",
                    "12345678",
                    "Male",
                    "10-5-2002",
                    SchoolStudyType.Wezhaiy,
                    Arrays.asList("Math", "Science", "Chemistry", "Physic", "Arabic", "English","Kurdish"),
                    Arrays.asList(98.00, 90.00, 94.00, 96.00, 92.00, 98.00, 100.00)
            )
    );

    public static List<Student> AynyStudents = Arrays.asList(
            new Student(
                    "s_1",
                    "Twana Abubakr Abdulla",
                    "12345678",
                    "Male",
                    "20-4-2003",
                    SchoolStudyType.Ayny,
                    Arrays.asList("Math", "Science", "Chemistry", "Physic", "Arabic", "English","Kurdish"),
                    Arrays.asList(96.00, 100.00, 88.00, 100.00, 98.00, 98.00, 100.00)
            ),
            new Student(
                    "s_2",
                    "Emad Adil Qadr",
                    "12345678",
                    "Male",
                    "10-5-2002",
                    SchoolStudyType.Ayny,
                    Arrays.asList("Math", "Science", "Chemistry", "Physic", "Arabic", "English","Kurdish"),
                    Arrays.asList(98.00, 90.00, 94.00, 96.00, 92.00, 98.00, 100.00)
            )
    );
}
