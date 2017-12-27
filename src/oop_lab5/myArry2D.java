package oop_lab5;

import java.io.InputStreamReader;
import java.lang.management.BufferPoolMXBean;

public class myArry2D {
    @Override
    public static void main (String []args){
        //array2D

        int[][]num = new int [2][3];

        num [0][0]=100;
        num[0][2]=200;
        num = inputData(num);
        showData(num);
    }//main


    private static int[][] inputData(int[][] num) {
        BufferPoolMXBean reader = new BufferdReader(new InputStreamReader(System.in));
        System.out.println("Enter an integer: ");
        for (int i=0; i<num.length;i++ {
            for  (int j=0; j< num [i].length;i++){
                System.out.println("num["+j+"]["+j+"]:");
                num[i][j]=Integer.parseInt(reade.readLine());
            }//j
        }//i
        return num;
    }//inputData



    private static void showData(int[][]num){
        System.out.println("Data in array: ");
        for (int i= 0; i< num.length;i++){
            for (int j = 0 ; j< num [i].length;j++){
                System.out.println(num[i][j]+"" );

            }//j
        }//i
    }//ShowData
}//class
