package lesson2_3;

public abstract class AbstractAnimal {
    private int age;

    public AbstractAnimal(int age) {
        this.age = age;
    }

    public abstract void go();

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
