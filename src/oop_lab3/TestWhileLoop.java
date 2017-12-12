package oop_lab3;

public class TestWhileLoop {
    public static void main (String[]args){
        //While
        int i = 1;
        while(i<=10){
            System.out.print(i+"");
            if (i%10==0)
                System.out.print(" Hello");
            i++;
        }//While


        int i = 1;
        while(i<=50){
            System.out.print(i+"");
            if (i%50==0)
                System.out.print(" Hello");
            i++;
        }//While


        //do-while
        System.out.print(" \n");
        int j = 1;
        do{
            System.out.print(j+"");
            j++;
        }while (j<=10);


//do-while
        System.out.print(" \n");
        int j = 1;
        do{
            System.out.print(j+"");
            if (j%2 !=0)
                System.out.print("Hello");
            j++;
        }while (j<=10);

    }//mail
}//Class
