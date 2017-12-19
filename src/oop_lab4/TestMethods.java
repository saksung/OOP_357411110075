package oop_lab4;

public class TestMethods {
    public static int number = 1000;

    //Method
    //type 1

    public static void A(){
        System.out.println("Hello A");
        B(20);
    }//A


    //type2
    public static void B(int x ){
        System.out.println("Hello B "+x);
    }//B


    //type3
    public static int c (int x,int y){
System.out.println("Hello c"+number);
        return x+y;
    }//c


    public static void main (String[]args){
        System.out.println("Hello Main");
        //calling method
       // A();
       // B(10);
       int number = c(10,20);
       System.out.println(number);
       System.out.println(c(50,50));
       int x = 100;


    }//main
}//class
