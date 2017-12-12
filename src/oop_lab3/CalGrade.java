package oop_lab3;
//0-49 =F
//50-59 =D
//60-69 =c
//70-79 = B
//80-100 = A

import java.util.Scanner;

public class CalGrade {
 public static   void  main  (String[] args){

        // 1.Create object for get input from user.
     Scanner scanner = new Scanner(System.in);
        // 2.Create variable for Store data.
     int score;
     System.out.println("Emter your score : ");
     score = scanner .nextInt();
        //3.test variable with condition above.
        //4.Show the output on screen.
     if (score <=49)System.out.println("You grade is F ") ;
     else if (score <=49) System.out.println("You grade is D");
     else if (score <=69) System.out.println("You grade is C");
     else if (score <=79) System.out.println("You grade is B");
     else  System.out.println("You grade is A");


        }//main
}//Class