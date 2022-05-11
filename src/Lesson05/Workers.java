package Lesson05;

    /*1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
    2. Конструктор класса должен заполнять эти поля при создании объекта.
    3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
    4. Создать массив из 5 сотрудников.
    5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.*/

public class Workers {
    private String surname;
    private String name;
    private String patronymic;
    private String position;
    private String email;
    private String telephone;
    private int salary;
    private int age;

    public Workers(String surname, String name, String patronymic, String position, String email, String telephone, int salary, int age){
        this.surname=surname;
        this.name=name;
        this.patronymic=patronymic;
        this.position=position;
        this.email=email;
        this.telephone=telephone;
        this.salary=salary;
        this.age=age;
    }

    public int getAge() {
        return age;
    }

    public String getSurname() {
        return surname;
    }

    public void printInfo(){
        System.out.println("Familia: " + this.surname);
        System.out.println("Imia: " + this.name);
        System.out.println("Otchectvo: " + this.patronymic);
        System.out.println("Dolzhnost': " + this.position);
        System.out.println("Email: " + this.email);
        System.out.println("Zarplata: " + this.salary);
        System.out.println("Vozrast: " + this.age);
    }
}
