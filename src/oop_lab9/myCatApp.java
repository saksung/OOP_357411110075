package oop_lab9;

public class myCatApp {
    public  static void (String[])args{
        Engine engine = new Engine("1500 cc","v-TEC");
        //car
        car car =new car("Honda","Black",engine);
        System.out.println(car.toString());

        car car1=new car ("Honda","Red",engine);
        System.out.println(car1.toString());


    }//main
}//class
