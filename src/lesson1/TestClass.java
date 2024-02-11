package lesson1;
/**
 * class TestClass дял объяснения создания классов
 * */
public class TestClass {
    //Поля класса
    public String name;
    public String info;

    public SecondTestClass secondTestClass;
    //Пустой конструктор (дефолтный)
    public TestClass() {
    }
    //Конструктор с параметрами
    public TestClass(String name, String info) {
        this.name = name;
        this.info = info;
    }

    public TestClass(String name, String info, SecondTestClass secondTestClass) {
        this.name = name;
        this.info = info;
        this.secondTestClass = secondTestClass;
    }
}
