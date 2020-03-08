package collections;

import java.util.Arrays;
import java.util.Objects;

public class InitClass {
    final int number;
    final String name;
    final String surname;
    final boolean firstYearStudent;
    final int[] marks;
    final String[] subjects;

    InitClass(Builder builder) {
        this.number = builder.number;
        this.name = builder.name;
        this.surname = builder.surname;
        this.firstYearStudent = builder.firstYearStudent;
        this.marks = builder.marks;
        this.subjects = builder.subjects;
    }

    static class Builder {
        final int number;
        final String name;
        final String surname;
        boolean firstYearStudent;
        final int[] marks;
        final String[] subjects;

        Builder(int number, String name, String surname, int[] marks, String[] subjects) {
            this.number = number;
            this.name = name;
            this.surname = surname;
            this.marks = marks;
            this.subjects = subjects;
        }

        Builder doesStudentIsFirstYear(boolean firstYearStudent) {
            this.firstYearStudent = firstYearStudent;
            return this;
        }

        InitClass build() {
            return new InitClass(this);
        }
    }

    @Override
    public String toString() {
        return "Student's details: " +
                "number = " + number +
                ", name - " + name +
                ", surname - " + surname +
                ", marks = " + Arrays.toString(marks) +
                ", subjects = " + Arrays.toString(subjects) +
                ", firstYearStudent = " + firstYearStudent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InitClass initClass = (InitClass) o;
        return number == initClass.number &&
                firstYearStudent == initClass.firstYearStudent &&
                name.equals(initClass.name) &&
                surname.equals(initClass.surname) &&
                Arrays.equals(marks, initClass.marks) &&
                Arrays.equals(subjects, initClass.subjects);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(number, name, surname, firstYearStudent);
        result = 31 * result + Arrays.hashCode(marks);
        result = 31 * result + Arrays.hashCode(subjects);
        return result;
    }
}
