import java.util.Scanner;

public class Menu {
    public void menu(){
        Scanner scanner = new Scanner(System.in);
        University university = new University();
        while (true){
            System.out.println(" [1] - Добавить "+
                    " [2] - Отчислить " +
                    " [3] - Посмотреть студентов группы " +
                    " [end] - Закончить работу" );
            String str = scanner.nextLine();
            if("end".equals(str)) break;
            if (str.equals("1")) {
                System.out.println("Введите Имя");
                String name1 = scanner.nextLine();

                System.out.println("Введите Телефон");
                int phone1 = scanner.nextInt();

                System.out.println("Введите Номер группы");
                int group1 = scanner.nextInt();
                Student student = new Student(name1, group1, phone1);
                AddStud addStud = new AddStud();
                addStud.addSt(university,student);
                System.out.println("Добавлен");
            }
            if (str.equals("2")){
                System.out.println("Введите Имя");
                String name1 = scanner.nextLine();

                System.out.println("Введите Номер группы");
                int group1 = scanner.nextInt();
                RemoveStudent rem = new RemoveStudent();
                rem.remStudent(university,name1, group1);
                System.out.println("Отчислен ");
            }
            if (str.equals("3")){
                System.out.println("Введите Номер группы");
                int group1 = scanner.nextInt();
                Print print = new Print();
                print.printGroupList(university,group1);
            }
        }
    }
}
