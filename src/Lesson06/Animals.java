package Lesson06;

/*
    1. Создать классы Собака и Кот с наследованием от класса Животное.
    2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
    Результатом выполнения действия будет печать в консоль. (Например, dog.run(150); -> 'Бобик пробежал 150 м.');
    3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
    4. * Добавить подсчет созданных котов, собак и животных.
 */

public class Animals {
    protected String nickName;
    protected String breed;
    protected int age;
    protected int numberOfLives;
    protected int numbersAllAnimals = 0;

    public Animals(String nickNameAnimal, String breedAnimal, int ageAnimal){
        this.nickName = nickNameAnimal;
        this.breed = breedAnimal;
        this.age = ageAnimal;
        this.numberOfLives=1;
        this.numbersAllAnimals++;
    }

    public int getNumbersAllAnimals() {
        return numbersAllAnimals;
    }

    public Animals(String nickNameAnimal){
        this.nickName = nickNameAnimal;
    }

    public void speak(){
        if(numberOfLives<1) {
            this.finalize();
        } //else if (this instanceof Cats || this instanceof Dogs){
            //}
        else {
            System.out.println(nickName + " making animals sounds ");
        }
    }

    public void speak(String say){
        if(numberOfLives<1) {
            this.finalize();
        }
        else {
            System.out.println(nickName + " sound: " + say);
        }
    }
//    public abstract void speak();

    public void run(int length){
        if(numberOfLives<1) {
            this.finalize("run");
        } else {
            System.out.println(nickName +" run " + length);
        }
    }

    public void swim(int length){
        if(numberOfLives<1) {
            this.finalize("swim");
        } else {
            System.out.println(nickName +" swim " + length);
        }
    }

    public int getNumberOfLives(){
        return numberOfLives;
    }

    public void move(String typeMove, int length){
        if (length==1)
        System.out.println("MOVE: " + nickName + " "+ typeMove + " " + length + " metr");
        else if (1<length && length<5) {
            System.out.println("MOVE: " + nickName + " "+ typeMove + " " + length + " metra");
        } else if (length>=5) {
            System.out.println("MOVE: " + nickName + " "+ typeMove + " " + length + " metrov");
        } else {
            System.out.println("MOVE: " + nickName + " not "+ typeMove);
        }
    }
    protected void finalize(String type){
        System.out.println(nickName+ " can't any move (" + type + ") his DIED");
    }

    protected void finalize(){
        System.out.println(nickName+ " can't any move, his DIED");
    }

}
