import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TestInput {
    public  void main(string)[]args{

        //BufferedReader
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("What is your name? : ");
    String name = reader.readLine();
    System.out.println("your name is "+name);

    System.out.print("How old are you? :");
    int age =Integer.parseInt(reader.readLine());
    System.out.println("You are "+age "years old.");

    //scanner
    Scanner scanner = new scanner(System.in);
    System.out.print("where are you com frme? :);
            String city = scanner.nextLine();
    System.out.print("You came form "+city);

}//main


}//class
