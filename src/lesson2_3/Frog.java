package lesson2_3;

public class Frog extends AbstractAnimal implements Swimmable {
    public Frog(int age) {
        super(age);
    }

    @Override
    public void swim() {
        System.out.println("Хорошо плавает");
    }

    @Override
    public void go() {
        System.out.println("Скачет по кувшинкам");
    }
}
