package Array_linearserch;

import java.util.Scanner;

public class Findelement{

    public void check_element(int[] arr){
        System.out.println("arr={11,43,55,33,55} => which number you want to find provide this:");
        Scanner scnan = new Scanner(System.in);
            int num = scnan.nextInt();

            for(int i=0 ; i<arr.length ; i++){
                if(arr[i]==num){
                  System.out.println("your selected number index is :"+i);
                }
            }
    }
    public static void main(String[] args){
        Findelement find=new Findelement();  
        int[] arr={11,43,55,33,55};
        find.check_element(arr);
    }
}
