package oop_lab4;

import jdk.nashorn.internal.runtime.regexp.JoniRegExp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

//สร้าง method สำหรับรับค่าข้อมูลนักศึกษาประกอบด้วย
//1.ชื่อ-นามสกุล
//2.ที่อยู่
//3.รหัสนักศึกษา
//4.สาขาและมหาลัย
//5.email
public class StudentData {
    public  static BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
public static String getName()throws IOException{
    System.out.println("Enter your Name: ");
    return reader.readLine();
}//getName

    public static String getAddress()throws IOException {
        System.out.println("Enter your address: ");
        return reader.readLine();
    }


    public static String getStdID()throws IOException {
        System.out.println("Enter your ID: ");
        return reader.readLine();
    }


    public static String getFaculty()throws IOException {
        System.out.println("Enter your Faculty: ");
        return reader.readLine();
    }


    public static String getEmail()throws IOException {
        System.out.println("Enter your Email: ");
        return reader.readLine();
    }


    public static void main(String[]args) throws IOException {
    String Name =getName();
    String address =getAddress();
    String id = getStdID();
    String fac = getFaculty();
    String email = getEmail();

    System.out.println(Name +"\n"  +address+"\n"  +id+"\n" + fac +"\n" + email+"\n");
       System.out.println(getName()+ "\n"+getAddress());
    }



}//class
