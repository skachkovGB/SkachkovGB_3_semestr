package Lesson03;

import java.util.Random;

/**
 * Skachkov
 * Geek Brains 3.1 - Java
 * Lesson 3
 */
public class ThirdClass {

    public static Random random = new Random();

    public static int randMY (int min, int max){

        return min + random.nextInt(max-min)  ;
    }

   public static void main(String[] args) {

        for (int i=1; i<10; i++){
            System.out.print(randMY(-2,4)+ "|");

        }
        System.out.println();
        for (int i=1; i<10; i++){
            System.out.print(random.nextInt(6) + "|");
        }

        /* Задание 1*/
       System.out.println();
       System.out.println("******************TASK 1******************");
       int[] arrayTaskOne = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
       printArray(arrayTaskOne);
       System.out.println("Change array");
       printArray(cnangeArray(arrayTaskOne));
       System.out.println();
       boolean[] arrayTaskOneBool = {true, false, false, true};
       printArray(arrayTaskOneBool);
       System.out.println("Overload boolean");
       printArray(cnangeArray(arrayTaskOneBool));


       /* Задание 2*/
       System.out.println();
       System.out.println("******************TASK 2******************");
       int[] arrayHundred = new int[100];
       printArray(arrayHundred);
       System.out.println("Fill array < 6");
       printArray(fillEmptyArray(arrayHundred));

       /* Задание 3*/
       System.out.println();
       System.out.println("******************TASK 3******************");
       int[] arrayTaskThree = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
       printArray(arrayTaskThree);
       System.out.println("Doubling array");
       printArray(doublingArray(arrayTaskThree));

       /* Задание 4*/
       System.out.println();
       System.out.println("******************TASK 4******************");
       printArray(createArray(5));

       /* Задание 5*/
       System.out.println();
       System.out.println("******************TASK 5******************");
       printArray(createArray(5,100));

       /* Задание 6*/
       System.out.println();
       System.out.println("******************TASK 6******************");
       printArray(arrayTaskThree);
       System.out.println(arrayMinMaxSearch(arrayTaskThree));

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " | ");
        }
        System.out.println();
    }

    public static void printArray(boolean[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " | ");
        }
        System.out.println();
    }

    //  1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    //  С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static int[] cnangeArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i]==0){
                array[i]=1;
            }
                else array[i]=0;
        }
        return array;
    }

    public static int[] cnangeArray(boolean[] arrayBool) {
        int[] arrayInt = new int[arrayBool.length];
        for (int i = 0; i < arrayBool.length; i++) {
            if (arrayBool[i]){
                arrayInt[i]=0;
            }
            else arrayInt[i]=1;
        }
        return arrayInt;
    }


    //  2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
    public static int[] fillEmptyArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i]=i+1;
        }
        return array;
    }

    // 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

    public static int[] doublingArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i]<6){
                array[i]*=2;
            }
        }
        return array;
    }



    // 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    // и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
    // определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];

    //public static int[][] createSquareArray(int size){
    public static int[][] createArray(int size){
        int[][] arraySquare = new int[size][size];
        for (int i = 0; i <size; i++) {
            for (int j = 0; j <size; j++) {
                if (i==j || i+j==size-1){
                    arraySquare[i][j]=1;
                }
            }
        }
        return arraySquare;
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(" | ");
            for (int j = 0; j <array.length ; j++) {
                System.out.print(array[i][j] + " | ");
            }
            System.out.println();
        }
    }


    // 5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len,
    // каждая ячейка которого равна initialValue;

    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i]=initialValue;
        }
        return array;
    }


    // 6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы;
    public static String arrayMinMaxSearch(int[] array){
        String stringMinMax;

        int minArray, maxArray;
        minArray=maxArray=array[0];

        for (int i = 0; i < array.length; i++) {
            if (minArray>array[i]){
                minArray=array[i];
            }
            if (maxArray<array[i]){
                maxArray=array[i];
            }
        }
        stringMinMax = "Min: " + minArray + " | Max: "+ maxArray;
        return stringMinMax;
    }
}


