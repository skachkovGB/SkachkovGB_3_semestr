package Lesson06;

/**
 * Created by Skachkov
 * Date: 12.05.2022
 * Geek Brains 3.1 - Java
 * Lesson 6
 */

/*
    1. Создать классы Собака и Кот с наследованием от класса Животное.
    2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
    Результатом выполнения действия будет печать в консоль. (Например, dog.run(150); -> 'Бобик пробежал 150 м.');
    3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
    4. * Добавить подсчет созданных котов, собак и животных.
 */
public class SixthClass {
    public static void main(String[] args) {



        System.out.println("================================");
        Animals horse = new Animals("Plotva", "Koni v iablokax", 10);
        System.out.println("Kol:vo :"+ horse.getNumbersAllAnimals());
        horse.swim(30);
        horse.run(1000);
        for (int i = 0; i < 7; i++) {
            horse.move("jump", i);
        }
        horse.speak();

        System.out.println("================================");

        Cats barsik = new Cats("Barsik", "outbred", 1);
        System.out.println("Kol:vo :"+ barsik.getNumbersAllAnimals());
        barsik.speak();
        for (int i = -1; i < 10; i++) {
            barsik.swim(i);
            printLives(barsik);
        }
        barsik.run(10);

        System.out.println("================================");

        Dogs reks = new Dogs("Reks", "sheepdog", 3);
        System.out.println("Kol:vo :"+ reks.getNumbersAllAnimals());
        reks.speak();
        printLives(reks);
        reks.run(600);
        reks.swim(9);
        reks.swim(11);
        reks.swim(-1);
        printLives(reks);
        reks.swim(10);  // объект не удалился!!!!
        reks.speak();
        reks.run(10);

        Cats Mashka = new Cats("Mashka");
        System.out.println("Kol:vo :"+ reks.getNumbersAllAnimals());

    }

    public static void printLives(Animals animal){
        System.out.println(animal.nickName + " Kol-vo chiznei: " + animal.getNumberOfLives());
    }
}


