package oop_lab4;
//1.Overload Methods
//2.Overloading Methds
//3.Method Overloading/Overload
public class OverLoadMethod {
    public static void main(String[]args){

       public String void A (){
       System.out.println("Hello Al");
       }


    }
        public String void A (int x){
        System.out.println("Hello "+x);
    }

        public String void A (int x,int y) {
        System.out.println("Hello " + (x + y));
        A();
        A(10);
        A(10, 20);

    }//main
}//class
