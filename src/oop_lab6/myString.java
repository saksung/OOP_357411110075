package oop_lab6;

public class myString {
    public static void main (String[]args) {
        char[] c = {'H', 'e', 'l', 'l', 'o'};

        String str1 = new String(c);
        System.out.println(str1);
        String str2 = "Puriwat Lertkai";
        System.out.println(str2);
        //string concatenation
        //type1(+)
        String str3 = str1 + "" + str2;
        System.out.println(str3);
        //type2(concat()method)
        String Str4 = str3.concat("RMUTSV");
        System.out.println(str3);

//String Methods
        System.out.println(Str4.length());
        System.out.println(Str4.substring(10,20));
        System.out.println(Str4.toUpperCase());
        System.out.println(Str4.toLowerCase());
        Str4.replace('r','t');
        System.out.println(Str4.replace('r','t');


    }//main
}//class
