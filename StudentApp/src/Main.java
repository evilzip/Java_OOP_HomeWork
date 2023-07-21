import Domen.GroupSizeComparator;
import Domen.Student;
import Domen.StudentGroup;
import Domen.StudentStream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Иван", 25, 121);
        Student s2 = new Student("Игорь", 23, 301);
        Student s3 = new Student("Иван", 22, 121);
        Student s4 = new Student("Игорь",  23, 444);
        //Student s5 = new Student("Даша",  23, 171);
        //Student s6 = new Student("Лена",  23, 104);

        List<Student> listStud1 = new ArrayList<Student>();
        listStud1.add(s1);
        listStud1.add(s2);
        listStud1.add(s3);
        listStud1.add(s4);
        //listStud1.add(s5);
        //listStud1.add(s6);

        Student s7 = new Student("Иван", 25, 1);
        Student s8 = new Student("Игорь", 23, 3);
        //Student s9 = new Student("Иван", 22, 12);
        //Student s10 = new Student("Игорь",  23, 4);
        //Student s11 = new Student("Даша",  23, 17);
       //Student s12 = new Student("Лена",  23, 1012);

        List<Student> listStud2 = new ArrayList<Student>();
        listStud2.add(s7);
        listStud2.add(s8);
        //listStud2.add(s9);
        //listStud2.add(s10);
        //listStud2.add(s11);
        //listStud2.add(s12);

        Student s13 = new Student("Иван", 25, 1211);
        Student s14 = new Student("Игорь", 23, 3011);
        Student s15 = new Student("Иван", 22, 1214);
        Student s16 = new Student("Игорь",  23, 4446);
/*        Student s17 = new Student("Даша",  23, 1711);
        Student s18 = new Student("Лена",  23, 1040);*/

        List<Student> listStud3 = new ArrayList<Student>();
        listStud3.add(s13);
        listStud3.add(s14);
        listStud3.add(s15);
        listStud3.add(s16);
        //listStud3.add(s17);
        //listStud3.add(s18);

        Student s17 = new Student("Иван", 20, 543);
        Student s18 = new Student("Игорь", 20, 544);
        Student s19 = new Student("Иван", 20, 545);
        Student s20 = new Student("Игорь",  23, 547);


        List<Student> listStud4 = new ArrayList<Student>();
        listStud4.add(s17);
        listStud4.add(s18);
        listStud4.add(s19);
        listStud4.add(s20);


        StudentGroup group4580 = new StudentGroup(listStud1, 4580);
        StudentGroup group4570 = new StudentGroup(listStud2, 4570);
        StudentGroup group4590 = new StudentGroup(listStud3, 4590);
        StudentGroup group4600 = new StudentGroup(listStud4, 4571);
        List<StudentGroup> listGroup = new ArrayList<>();
        listGroup.add(group4580);
        listGroup.add(group4570);
        listGroup.add(group4590);
        listGroup.add(group4600);


        StudentStream studentStream1 = new StudentStream(listGroup, 1);

        //System.out.println(group4580);
        System.out.println(studentStream1);

        //Collections.sort(studentStream1.getStudentStream());
        listGroup.sort(new GroupSizeComparator());
        Collections.sort(studentStream1.getStudentStream());

        for (StudentGroup stdGroup: studentStream1){
            System.out.println("Группа "+ stdGroup.getIdGroup());
            for(Student std : stdGroup)
            {
                System.out.println(std);
            }
            System.out.println("***");

        }

        //Collections.sort(studentStream1.getStudentStream());





        /*System.out.println("=========================================================");

        Collections.sort(group4580.getGroup());

        for(Student std: group4580.getGroup())
        {
             System.out.println(std);
        }*/


        /*Student s1 = new Student("Иван", 25, 121);
        Student s2 = new Student("Игорь", 23, 301);

        PersonComparator<Student> comS = new PersonComparator<Student>();
        comS.compare(s1, s2);

        Teacher t1 = new Teacher("Иван", 25, "Docent");
        Teacher t2 = new Teacher("Игорь", 23, "Professor");

        PersonComparator<Teacher> comT = new PersonComparator<Teacher>();
        comT.compare(t1, t2);

        //comS.compare(s1, t2);
        PersonComparator<Person> comP = new PersonComparator<Person>();
        comP.compare(s1, t2);

        Emploee e1 = new Emploee("Федорович", 60, "разнорабочим");
        //EmploeeController empControll = new EmploeeController();
        EmploeeController.paySalary(e1);
        // EmploeeController.paySalary(s1);
        //empControll.paySalary(e1);
        //empControll.paySalary(s1);*/

    }
}
