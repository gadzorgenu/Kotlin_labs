public class Student {
    private String name;
    private int level;

    public Student(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", level=" + level +
                '}';
    }
}
