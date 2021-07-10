package ImmutableAndStudentHM;

import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private String group;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && name.equals(student.name) && group.equals(student.group);
    }

    @Override
    public int hashCode() {
        return (int)(31 * age + name.hashCode() + group.hashCode());
    }
}
