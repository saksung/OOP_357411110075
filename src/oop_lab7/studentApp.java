package oop_lab7;
import java.util.Scanner;
public class studentApp {
    public static void  main (String[]args){
        //create objects as student
        Student student1 = new Student();
        student1.setId("1111111111111");
        student1.setMajor("Information System");
        student1.setFaculty("Management Technology");
        student1.setName("Boy Saiyai");
        System.out.println(student1.toString());

        Student student2 = new Student("22222222222","Management","Business Management","Girl Songkhla");
        System.out.println(student2.toString());
        student2.setName("Girl Trang");

        Student student3 = new Student();
       // student3= inputdata(student3);
       // System.out.println(student3.toString());
        System.out.println(student1.gender);
        System.out.println(Student.gender);
    }//main
    private static Student inputdata (Student s){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you student data");
        System.out.println("Name:  ");
        s.setName(scanner.nextLine());
        System.out.println("ID:  ");
        s.setId(scanner.nextLine());
        System.out.println("Major:  ");
        s.setMajor(scanner.nextLine());
        System.out.println("Faculty:  ");
        s.setFaculty(scanner.nextLine());
        return s;
    }
}//class
