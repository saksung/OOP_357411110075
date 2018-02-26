package mid;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class EmployeeData {
//สร้าง method สำหรับรับค่าข้อมูลพนักงานประกอบด้วย
//1. รหัสพนักงาน
//2. ทชื่อพนักงาน
//3. ข้อมูลเงินเดือน
//4. ค่าล่วงเวลา
    public static BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
    public static String getName() throws IOException {
        System.out.print("Enter your name: ");
        return reader.readLine();
    }//getName
    public static String getEmpID() throws IOException {
        System.out.print("Enter your ID: ");
        return reader.readLine();
    }
    public static String getSalary() throws IOException {
        System.out.print("Enter your salary: ");
        return reader.readLine();
    }
    public static String getOverTime() throws IOException {
        System.out.print("Enter your OverTime: ");
        return reader.readLine();
    }
    public static void main(String[] args) throws IOException {
        String name = getName();
        String id = getEmpID();
        String salary = getSalary();
        String overtime = getOverTime();
        System.out.println(name+"\n"+id+"\n"
                +salary+"\n"+overtime);

    }

}//class