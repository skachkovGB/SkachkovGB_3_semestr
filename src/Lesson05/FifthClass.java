package Lesson05;

/**
 * Created by Skachkov
 * Date: 11.05.2022
 * Geek Brains 3.1 - Java
 * Lesson 5
 */


    /*1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
    2. Конструктор класса должен заполнять эти поля при создании объекта.
    3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
    4. Создать массив из 5 сотрудников.
    5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.*/


public class FifthClass {

    public static void main(String[] args) {
        Workers director = new Workers("Ivanov","Ivan", "Ivanovich",
                                       "director", "ivanov@mail.ru","89009009090", 100000, 50);
        director.printInfo();

        Workers[] fiveWorkers = new Workers[5];
        fiveWorkers[0]=director;
        fiveWorkers[1]=new Workers("Petrov","Petr", "Petrovich",
                                   "analytic", "petrov@mail.ru","89119119191", 100000, 39);
        fiveWorkers[2]=new Workers("Ivanova","Maria", "Ivanovna",
                                   "Hr", "ivanova@mail.ru","89229229292", 100000, 41);
        fiveWorkers[3]=new Workers("Sidorov","Sidor", "Sidorovich",
                                   "Programmer", "sidorov@mail.ru","89339339393", 100000, 25);
        fiveWorkers[4]=new Workers("Sidorova","Dasha", "Sidorovna",
                                   "Cleaning", "sidorova@mail.ru","89449449494", 100000, 30);

        filtrAge(fiveWorkers, 40);

    }

    public static void filtrAge(Workers[] workers, int filtrAge){
        System.out.println("=============Filtr=============");
        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getAge() > filtrAge){
                System.out.println(workers[i].getSurname()+ " starche "+ filtrAge + " let.");
            }
        }
        System.out.println("=============Filtr=============");
    }
}


