package homeWork.conditions;

import javax.swing.*;
import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        // Сравнить два числа на равеноство

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = scn.nextInt();
        System.out.println("Enter b: ");
        int b = scn.nextInt();
        if (a == b) {
            System.out.println("a равно b");
        }
        else{
            System.out.println("a не равно b");
        }

        // Сравнить две строки на равенство

        Scanner scn1 = new Scanner(System.in);
        System.out.print("Enter c:");
        String c = scn1.next();
        System.out.print("Enter d:");
        String d = scn1.next();
        if(c.equals(d)){
            System.out.println("c равно d");
        }
        else{
            System.out.println("c не равно d");
        }

        // Сравнить два числа на больше или меньше

        Scanner scn2 = new Scanner(System.in);
        System.out.println("Enter i:");
        int i = scn2.nextInt();
        System.out.println("Enter h:");
        int h = scn2.nextInt();
        if(i == h){
            System.out.println("i равно h");
        } else if (i>h) {
            System.out.println("i больше h");
        } else if (i<h) {
            System.out.println("i меньше h");

        }

        // Проанализировать варианты ответа покупателя

        Scanner scn3 = new Scanner(System.in);

        System.out.println("Enter answer:");
        String answer = scn3.nextLine();

        if(answer.equals("да")){
            System.out.println("К оплате 100 рублей");
        }
        else if (answer.equals("нет")) {
            System.out.println("А почему?");
        }
        else if (answer.equals("не знаю")) {
            System.out.println("Что вас смущает?");
        }
        else if (answer.equals("мне надо подумать")) {
            System.out.println("Да конечно, но у нас сейчас действует скидка, которая скоро кончится");
        }
        else {
            System.out.println("Вас понял");
        }


    }
}