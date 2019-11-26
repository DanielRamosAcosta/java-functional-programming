package org.incyde.fp.imperativevsfunctional;

public class Student {
    private final int enrollment;
    private final int grade;

    Student(int enrollment, int grade) {
        this.enrollment = enrollment;
        this.grade = grade;
    }

    public int getEnrollment() {
        return enrollment;
    }

    public int getGrade() {
        return grade;
    }
}
