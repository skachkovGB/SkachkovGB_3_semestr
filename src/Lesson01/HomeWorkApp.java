package Lesson01;

/**
 * Skachkov
 * Geek Brains 3.1 - Java
 * Lesson 1
 */

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
    }


    // второе задание
    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.print("Banana \n");
        System.out.println("Apple");
    }

    // третье задание
    public static void checkSumSign(){
        int a = 20;
        int b = -21;
        if (a+b>0) {
            System.out.println("Sum numbers " + a + " and " + b + " above zero");
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Sum numbers " + a + " and " + b + " sub zero");
            System.out.println("Сумма отрицательная");
        }
    }


}
