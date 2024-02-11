package lesson2_3;

public class Dog extends AbstractAnimal implements Swimmable {
    private boolean isAHunter;

    public Dog(int age, boolean isAHunter) {
        super(age);
        this.isAHunter = isAHunter;
    }

    @Override
    public void swim() {
        System.out.println("Плавает по собачьи");
    }

    @Override
    public void go() {
        if (isAHunter){
            System.out.println("Хорошо бегает");
        }else {
            System.out.println("Плохо бегает");
        }
    }
}
