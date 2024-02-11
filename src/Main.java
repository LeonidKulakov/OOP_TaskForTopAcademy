import lesson1.SecondTestClass;
import lesson1.TestClass;
import lesson2.AnimalType;
import lesson2.Season;
import lesson2_3.*;

public class Main {
    public static void main(String[] args) {
        /**
         * Урок 1
         * */

        TestClass testClass = new TestClass();
        TestClass testClass1 = new TestClass("Goga", "worker");
        TestClass testClass2 = new TestClass("Seva", "student", new SecondTestClass());


        /**
         * Урок 2
         * */

        // Работа перечисления без конструктора
        // firstEnumTest();

        // Работа перечисления с конструктором
        // secondEnumTest();

        /**
         * Урок 2,3
         * */
//        Cat cat = new Cat(10,"Рыжая");
//        Dog dog = new Dog(5, true);
//        Frog frog = new Frog(1);
//
//        AbstractAnimal[] abstractAnimals = {cat,dog,frog};
//        //Ошибка
//        //Swimmable [] swimmables = {cat, dog,frog};
//        Swimmable[] swimmables = {dog,frog};
//
//        for (AbstractAnimal a: abstractAnimals) {
//            a.go();
//        }
//        for (Swimmable s: swimmables) {
//            s.swim();
//        }
    }


    /**
     * Метод для демонстрации наботы перечисления с дефолтным конструктором
     */
    private static void firstEnumTest() {
        Season season = Season.SUMMER;

        switch (season) {
            case AUTUMN -> System.out.println("Осень");
            case SPRING -> System.out.println("Весна");
            case SUMMER -> System.out.println("Лето");
            case WINTER -> System.out.println("Зима");
        }
    }

    /**
     * Метод для демонстрации наботы перечисления с конструктором
     */
    private static void secondEnumTest() {
        //Создание кошки через valueOf
        AnimalType animal = AnimalType.valueOf("CAT");

        System.out.println(animal.getInfo());
        //Работа переопределенного метода
        System.out.println(animal.toString());
    }
}