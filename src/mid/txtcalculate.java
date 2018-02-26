package mid;
import java.util.Scanner;
public class txtcalculate {
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        String id = getID();
        String name = getName();
        String salary = getSalary();
        String overtime = getOverTime();
    }
    private static String getID() {
        System.out.print("Enter employee id: ");
        return scanner.nextLine();
    }
    private static String getName() {
        System.out.print("Enter employee name: ");
        return scanner.nextLine();
    }
    private static String getSalary() {
        System.out.print("Enter employee salary: ");
        return scanner.nextLine();

        if (Salary < 30000) {
            int Vat = (Salary * 1) / 100;
            System.out.println("YOUR VAT: " + Vat);
        } else if (Salary < 30000 && Salary < 30000) ;
        {
            int Vat = (Salary * 3) / 100;
            System.out.println("YOUR  VAT: " + Vat);
        }else if (Salary >= 30000 && Salary <= 49999) ;
        {
            int Vat = (Salary * 5) / 100;
            System.out.println("YOUR HAVE VAT: " + Vat);
        }else if (Salary >= 50000 && Salary <= 49999);
        {

        }
    private static String getOverTime() {
        System.out.print("Enter employee overtime: ");
        return scanner.nextLine();
    }

}//class