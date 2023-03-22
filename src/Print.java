public class Print {
    public void printGroupList(University university, int group) {
       StringBuilder str = new StringBuilder();
        for (Student st : university.list) {
            if (st.getGroup() == group){
                str.append(st.getName() + " " + st.getPhone());
            }
            System.out.println(str);
        }

    }
}
