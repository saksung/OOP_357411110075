package mid;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        String name;
        int employee;
        int salary = 0;
        int net = 0;
        int salarynet = 0;

        Scanner oj = new Scanner(System.in);
        System.out.print("\nรหัสพนักงาน : ");
        employee = oj.nextInt();

        Scanner Keyboard = new Scanner(System.in);
        System.out.print("\nชื่อพนักงาน : ");
        name = Keyboard.nextLine();

        System.out.print("\nเงินเดือนพนักงาน : ");
        salary = oj.nextInt();

        if (salary <= 15000)
        {
            net = 0;
            salarynet=(salary+net);
            System.out.println("\nได้โบนัส : 0% ");
            System.out.println("\nโบนัส :" + net);
            System.out.println("\nเงินเดือนสุทธิ : " + salarynet);
        }
        else if (salary <= 20000)
        {
            net = (salary * 5) / 100;
            salarynet = (salary + net);
            System.out.println("\nได้โบนัส : 5% ");
            System.out.println("\nโบนัส :" + net);
            System.out.println("\nงินเดือนสุทธิ : " + salarynet);
        }
        else
        {
            net = (salary * 7) / 100;
            salarynet = (salary + net);
            System.out.println("\nได้โบนัส : 7% ");
            System.out.println("\nโบนัส :" + net);
            System.out.println("\nงินเดือนสุทธิ : " + salarynet);
        }
    }
}
