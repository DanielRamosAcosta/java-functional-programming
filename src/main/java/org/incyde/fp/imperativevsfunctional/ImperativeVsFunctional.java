package org.incyde.fp.imperativevsfunctional;

import java.util.List;

public class ImperativeVsFunctional {
    static Integer imperative() {
        Student[] enrollment = {
                new Student(2, 100),
                new Student(2, 80),
                new Student(1, 89)
        };

        int totalGrades = 0;
        int totalStudentsFound = 0;
        for (int i = 0; i < enrollment.length; i++) {
            Student student = enrollment[i];
            if (student.getEnrollment() > 1) {
                totalGrades += student.getGrade();
                totalStudentsFound++;
            }
        }

        return totalGrades / totalStudentsFound;
    }

    public static Integer functional() {
        double average = List.of(
            new Student(2, 100),
            new Student(2, 80),
            new Student(1, 89)
        )
        .stream()
        .filter(s -> s.getEnrollment() > 1)
        .map(s -> s.getGrade())
        .mapToInt(Integer::intValue)
        .average()
        .orElse(0.0);

        return (int) average;
    }
}
