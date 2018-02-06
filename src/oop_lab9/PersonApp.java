package oop_lab9;

public class PersonApp {
    public  static void (String[]args){


        Address Address = new Address("12/5","Suarat","80110");

        Job Job = new Job("Police","1200");
        System.out.println(Job.toString());

        Person Person = new Person ("ID123454","Paut",Address,Job);
        System.out.println(Person.toString());




    }//main
}//class


