package Java101Dögüler;

import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        /*int number= 20;
        do{
            System.out.println("verilen değer ile koyulan koşul arası ...");
            number++;
        }while(number<25);*/

        /*int age=20;
        do{
            age+=2;
        }while(age<20);
        System.out.println(age);*/

        int i=1 ,j=1;
        while(i<3){
            do{
                System.out.print(j + ",");
                j++;
            }while(j<4);
            i++;
        }
    }
}

