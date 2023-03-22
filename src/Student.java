public class Student {
    String name;

    public int getPhone() {
        return phone;
    }

    int group;
    int phone;

    public Student(String name, int group, int phone) {
        this.name = name;
        this.group = group;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public int getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group=" + group +
                ", phone=" + phone +
                '}';
    }
}
