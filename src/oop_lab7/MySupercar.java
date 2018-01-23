package oop_lab7;
import java.util.ArrayList;
import java.util.Scanner;
public class MySupercar  {
    public static void  main (String[]args){
       Supercar s = new Supercar();
        s = inputdata(s);
    }
   private static Supercar in putData (Supercar){
        Scanner scanner=new Scanner(system.in);
        System.out.println("Enter car info:  ");
        System.out.println("Enter car br and:  ");
        s.setFaculty(scanner.nextLine());
        System.out.println("caren gine size:  ");
        s.setId(scanner.nextLine());
        System.out.println("max speed:  ");
        s.setMajor(scanner.nextLine());
        System.out.println("country of origin:  ");
        s.setFaculty(scanner.nextLine());
        return s;
    }
}//class
