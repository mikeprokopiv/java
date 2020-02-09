package task;

import java.util.Arrays;

public class FirstClass {
    private final String name;
    private final String surname;
    private final int age;
    private final Object obj;
    private final int[] primitiveArray;
    private final String[] strArray;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public Object getObj() {
        return obj;
    }

    public int[] getPrimitiveArray() {
        return primitiveArray;
    }

    public String[] getStrArray() {
        return strArray;
    }

    FirstClass(Builder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
        this.age = builder.age;
        this.obj = builder.obj;
        this.primitiveArray = builder.primitiveArray;
        this.strArray = builder.strArray;
    }

    static class Builder {
        private final String name;
        private final String surname;
        private final int age;
        private Object obj;
        private int[] primitiveArray;
        private String[] strArray;

        Builder(String name, String surname, int age) {
            this.name = name;
            this.surname = surname;
            this.age = age;
        }

        Builder classObject(Object obj) {
            this.obj = obj;
            return this;
        }

        Builder classPrimArray(int[] primitiveArray) {
            this.primitiveArray = primitiveArray;
            return this;
        }

        Builder classStringArray(String[] strArray) {
            this.strArray = strArray;
            return this;
        }

        FirstClass build() {
            return new FirstClass(this);
        }


    }

    public String toString() {
        return "In this task user's name is " + name +
                " and surname is " + surname + " and his age is " + age +
                " and assosiated with this user object is " + obj +
                " and primitive array is " + Arrays.toString(primitiveArray) +
                " and string array is " + Arrays.toString(strArray);
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FirstClass)) {
            return false;
        }
        FirstClass newFirstClass = (FirstClass) o;
        return name == newFirstClass.name &&
                age == newFirstClass.age &&
                obj == newFirstClass.obj &&
                Arrays.equals(primitiveArray, newFirstClass.primitiveArray) &&
                Arrays.equals(strArray, newFirstClass.strArray);
    }

    public int hashCode() {
        // is it better to use native hashCode() method of primitive (e.g. String) or Objects.hash() can be used (available from jdk 7 );
        // Why I can not call hashCode method for int field (age)? despite Integer class has it;

        int result = 17;
        result = 31 * result + name.hashCode();
        result = 31 * result + surname.hashCode();
        result = 31 * result + age;
        result = 31 * result + obj.hashCode();
        result = 31 * result + Arrays.hashCode(primitiveArray);
        result = 31 * result + Arrays.hashCode(strArray);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Builder("John", "Smith", 54).classObject("someObj")
                .classPrimArray(new int[]{1, 2, 3, 4, 5})
                .classStringArray(new String[]{"One", "Two", "Three"})
                .build());
    }
}
