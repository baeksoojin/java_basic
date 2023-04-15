package 문법정리;

import java.util.Scanner;

public class CBR {

    public static void nonPrimitive(){

        String str1 = new String("string");
        String str2 = new String("string");
        String str3 = str2;

        if(str1==str2){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
        if(str2==str3){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
        if(str1.equals(str2)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }

    public static void primitive(){
        String str1 = "string";
        String str2 = "string";

        if(str1==str2){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

    }
    public static void main(String[] args) {
        CBR.nonPrimitive();
        CBR.primitive();
    }
}
