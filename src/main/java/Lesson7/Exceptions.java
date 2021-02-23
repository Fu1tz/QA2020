package Lesson7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {

        /*

        Scanner sc = new Scanner(System.in);
        int res = 0;
        System.out.println("Enter a = ");
        int a = sc.nextInt();
        System.out.println("Enter b = ");
        int b = sc.nextInt();
        System.out.println("Enter operation = ");
        String op = sc.next();
        switch (op.charAt(0)){
            case'+':
                res = a + b;
                break;
            case '-':
                res = a - b;
                break;
            case '*':
                res = a * b;
                break;
            case '/':
                if (b!=0)
                res = a / b;
                else
                    System.out.println("Делить на 0 нельзя");
                break;

        }
        System.out.println(res);

         */



/*
        Scanner sc = new Scanner(System.in);
        int res = 0;
        System.out.println("Enter a = ");
        String temp = sc.next();
        int a = Integer.parseInt(temp);
        System.out.println("Enter b = ");
        int b = sc.nextInt();
        System.out.println("Enter operation = ");
        String op = sc.next();
        switch (op.charAt(0)){
            case'+':
                res = a + b;
                break;
            case '-':
                res = a - b;
                break;
            case '*':
                res = a * b;
                break;
            case '/':
                if (b!=0)
                    res = a / b;
                else
                    System.out.println("Делить на 0 нельзя");
                break;

        }
        System.out.println(res);

 */


        Scanner sc = new Scanner(System.in);
        int res = 0;
        int a = 0;
        byte b = 0;
        try {
        System.out.println("Enter a = ");
            a = sc.nextInt();
        System.out.println("Enter b = ");
        try {
            b = sc.nextByte();
        } catch (InputMismatchException exception )  {
            System.out.println("Программа выбросил иключение");
        }
        System.out.println("Enter operation = ");
        String op = sc.next();
        switch (op.charAt(0)) {
            case '+':
                res = a + b;
                break;
            case '-':
                res = a - b;
                break;
            case '*':
                res = a * b;
                break;
            case '/':
                    res = a / b;;
                break;

        }

    }catch (InputMismatchException exception){
        System.out.println("Ошибка ввода");
        }catch (ArithmeticException exception){
        System.out.println("Арефметическая ошибка");
        }
        System.out.println("Программа отработала, результат = " + res);

        try {
            Thread.sleep(5000);
        } catch (InputMismatchException | InterruptedException e) {
           e.printStackTrace();
              }catch (Exception e){
           e.printStackTrace();
        }




    }
}
