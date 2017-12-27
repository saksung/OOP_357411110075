package oop_lab5;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
//1.input Data from user
//2.find summation of data in array
//3.find average value data in array
//4.find maximum value of data in array
//5.find minimum valule of data in array
//6.Soring data with descending order
//7.Sorting data with Ascending order

import java.util.Arrays;
import java.util.Collections;
        import java.util.Scanner;


public class InputDataToArray {
    private static final int MAX =10;

    public static void main (String[]args){
        Integer[] num = new Integer[MAX];
        num = inputData(num);
ShowData(num);
findMax(num);
DescendingOrder(num);


    }//main
    private static void Ascending Order(Integer[] num) {

        Array.Sort(num);
        System.out.println("Ascending Order: "  );
        ShowData(num);

    }//Ascending Order
    private static void DescendingOrder(Integer[] num) {

        Array.Sort(num);
        System.out.println("DescendingOrder:"  );
                ShowData(num);

    }//DescendingOrder


    private static void findMax(Integer[]num) {
        System.out.println("The maximum value is : " +(Collections.min(Arrays.asList(num))));
    }//findMax

    private static void findMax(Integer[]num) {
        System.out.println("The maximum value is : " +(Collections.max(Arrays.asList(num))));
    }//findMax
    //max value with basic code
    Integer max = num[0];
    for (int i=0; i<num.length;i++){
        if (max < num[i]){
                max = num[i];
        }
    }
    System.out.println("The maxnum value is :" + max);



    private static void summation(Integer[]num){
        Integer total=0;
        for (Integer i=0;i<num.length;i++){
            total+= num[i];

        }
        System.out.println("\nThe summation of"+"value in array is : "+total);
    System.out.println("The average value"+"in array is : "+total/MAX);
}

    private static void ShowData(Integer[] num) {
        System.out.println("Data in array: ");
        for (Integer val:num)
            System.out.println(val+" ");
    }

    private static Integer[] inputData(Integer[]num) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Plese enter data to array; ");
        for (Integer i=0;i<num .length;i++){
            System.out.println("number["+i+"]: ");
            num[i]=scanner.nextInt();
        }
        return num;
    }
}//class
