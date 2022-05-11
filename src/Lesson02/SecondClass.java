package Lesson02;

/**
 * Skachkov
 * Geek Brains 3.1 - Java
 * Lesson 2
 */
public class SecondClass {
    public static void main(String[] args) {

        System.out.println("#1:  10<=Summa<=20 is: "+checkNumberZone(12, -1));

        System.out.print("\n");
        printPositivOrNegativNumber(0);

        System.out.print("\n");
        System.out.println("#3:  "+ checkPositiveNegativeReverse(-1));

        System.out.print("\n");
        printStringFewTimes("testPrint",2);

        System.out.print("\n");
        int year=1900;
        System.out.println("#5:  God "+year+" visokosnii - "+checkLeapYear(year));

    }

    public static boolean checkNumberZone(int value1, int value2) {             //первое задание
        return ((value1 + value2) >= 10 && (value1 + value2) <= 20);
    }

    public static void printPositivOrNegativNumber(int value){                    //второе задание
        if (value >= 0) {
            System.out.println("#2:  Number " + value + " is positive");
        }
        else
            System.out.println("#2:  Number " + value + " is negative");
    }

    public static boolean checkPositiveNegativeReverse(int value) {                 //третье задание
        return (value < 0);
    }

    public static void printStringFewTimes(String stringForPrint, int howTimes){    //четвертое задание
        if (howTimes<1){
            System.out.println("#4:  Vvedite cheloe chislo ot 1 i bolishe");
        }
        else {
            for (int i=1; i<=howTimes; i++)
                System.out.println("#4:  "+i+"."+stringForPrint);
        }
    }

    public static boolean checkLeapYear (int year){

        boolean div4 = (year % 4 == 0);
        boolean div100 = (year % 100 == 0);
        boolean div400 = (year % 400 == 0);

        return (div4 && !div100 || div400);
    }

}
