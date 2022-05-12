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

    public Cats(String nickNameAnimal, String breedAnimal, int ageAnimal){
        super(nickNameAnimal, breedAnimal, ageAnimal);
        this.numberOfLives = 9;
        this.numbersAllAnimals++;
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
        /* единственная мысль пришла как сделать, весь код так не переделал, потому что не уверен что именно так надо.
        Не хватило времени все переписать без копипасты, сердце обливается так сдавать, но хочу сдать до оглашения правильных ответов
         */
    }

        /* Я не понимаю как правильно сделать У меня условие если у животного жизней меньше 1 то оно не может издать звук,
        если больше отрабатывает другая часть условия со стандартным звуком для класса Animals.
        То же условие у меня есть и для классов Cats и Dogs, но звук там другой, поэтому в чистом виде использровать super.метод() я не могу
        я не понимаю как уменьшить копипасту с if и вызывать метод из родительского класса. Здесь ошибка в логике построеня кода?*/

    @Override
    public void run(int length){
        if(length<=200){
            System.out.println(nickName +" run " + length);
        } else if (length>200) {
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
