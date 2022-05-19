package Lesson06;

/*
    1. Создать классы Собака и Кот с наследованием от класса Животное.
    2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
    Результатом выполнения действия будет печать в консоль. (Например, dog.run(150); -> 'Бобик пробежал 150 м.');
    3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
    4. * Добавить подсчет созданных котов, собак и животных.
 */
public class Cats extends Animals {

    private final String soundSpeak = "maaaaay";
    private final int lengthRun = 200;


    public Cats(String nickNameAnimal, String breedAnimal, int ageAnimal){
        super(nickNameAnimal, breedAnimal, ageAnimal);
        this.numberOfLives = 9;
    }

    public Cats(String nickNameAnimal){
        super(nickNameAnimal);
        this.numberOfLives = 9;
    }

    @Override
    public void speak(){
//        if(numberOfLives<1) {
//            this.finalize();
//        } else {
//            System.out.println(nickName + " " + soundSpeak);
//        }
        super.speak(this.soundSpeak);
    }


    @Override
    public void run(int length){
        if(length<=lengthRun){
            System.out.println(nickName +" run " + length);
        } else if (length>lengthRun) {
            System.out.println(nickName +" run " + length);
        } else {
            System.out.println("WRONG");
        }
    }

    @Override
    public void swim(int length){
        if(numberOfLives<1){
            this.finalize("swim");
        } else {
            if (length<0){
                System.out.println("WRONG");
            } else {
                System.out.println(nickName + " try to swim and DIED ");
                numberOfLives--;
            }
        }
    }
}
