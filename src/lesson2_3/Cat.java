package lesson2_3;

public class Cat extends AbstractAnimal {

    private String color;

    public Cat(int age, String color) {
        super(age);
        this.color = color;
    }

    @Override
    public void go() {
        System.out.println("Бегает кошка цвет которой: " + color);
    }
}
