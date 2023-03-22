public class RemoveStudent {
    public void remStudent(University university, String name, int group) {
        boolean result = false;
        for (Student st : university.list) {
            if (st.getName().equals(name) && st.getGroup() == group) {
                university.list.remove(st);
                result = true;
                break;
            }
        }
        if (result) {
            System.out.println("Отчислен");
        } else {
            System.out.println("Нет таких студентов");
        }
    }
}
