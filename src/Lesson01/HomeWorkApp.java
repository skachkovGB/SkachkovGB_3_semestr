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
        printColor(101);
        compareNumbers();
    }
    public static void printThreeWords(){            // второе задание
        System.out.println("Orange");
        System.out.print("Banana \n");
        System.out.println("Apple");
        System.out.print("\n");
    }

    public static void checkSumSign(){              // третье задание
        int a = 20;
        int b = -21;
        if (a+b>0) {
            System.out.println("Sum numbers " + a + " and " + b + " above zero");
            //System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Sum numbers " + a + " and " + b + " sub zero");
            //System.out.println("Сумма отрицательная");
        }
        System.out.print("\n");
    }


    public static void printColor(int value){        // четвертое задание
        //int value = 0;
        if (value <= 0) {
            System.out.println("Red");
            //System.out.println("Красный");
        }
        else if (value > 0 && value <= 100) {
            System.out.println("Yellow");
            //System.out.println("Желтый");
        }
        else {
            System.out.println("Green");
            //System.out.println("Зеленый");
        }
        System.out.print("\n");
    }

    public static void compareNumbers() {        // пятое задание
    int a = 110;
    int b = 100;
    if (a >= b){
        System.out.println("a >= b");
    }
    else
        System.out.println("a < b");
    }
// for new branch
}
