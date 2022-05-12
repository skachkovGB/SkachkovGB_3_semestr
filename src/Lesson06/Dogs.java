package Lesson06;

/*
    1. Создать классы Собака и Кот с наследованием от класса Животное.
    2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
    Результатом выполнения действия будет печать в консоль. (Например, dog.run(150); -> 'Бобик пробежал 150 м.');
    3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
    4. * Добавить подсчет созданных котов, собак и животных.
 */
public class Dogs extends Animals {

    private final String soundSpeak = "gaaaaav";
    private final int length =500;

    public Dogs(String nickNameAnimal, String breedAnimal, int ageAnimal){
        super(nickNameAnimal, breedAnimal, ageAnimal);
        this.numberOfLives = 1;

    }

    public Dogs(String nickNameAnimal){
        super(nickNameAnimal);
        this.numberOfLives = 1;
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
        if (numberOfLives<1) {
            this.finalize("run");
        }else{
            if(length<=this.length){
                System.out.println(nickName +" run " + length);
            } else if (length>this.length) {
                System.out.println(nickName +" run 500 metrov and tired, can't run " + (length-this.length));
            } else {
                System.out.println("WRONG");
            }
        }
    }

    @Override
    public void swim(int length){
        if (numberOfLives<1) {
            this.finalize("swim");
        }else{
            if (length>10) {
                System.out.println(nickName + " swim 10 metrov and DIED, can't swim " + (length - 10));
                numberOfLives--;
            } else if (length<=10 && length>0) {
                // тут 2 условия для того, чтобы не запуться как вы говорили ранее. По идее хватило бы 1 условия >0
                System.out.println(nickName + " swim " + length);
            } else {
                System.out.println("WRONG");
            }

        }

    }
}


