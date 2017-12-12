package oop_lab3;

import jdk.internal.dynalink.beans.StaticClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestSwitchCase {
    public Static void maid (String[]args) throws IOException {
        //switch-case
        BufferedReader reader=new BufferedReader(
                new InputStreamReader(System.in));
        int input;
        System.out.print("Plese enter number (1-3): ");
        input = Integer.parseInt(reader.readLine());
        switch (input){
            case 1: System.out.print("You entered 1. ");break;
            case 2: System.out.print("You entered 2. ");break;
            case 3: System.out.print("You entered 3. ");break;
            default: System.out.print("Please  entered number 1-3. ");break;


        }//switch

    }//main
}//Class

