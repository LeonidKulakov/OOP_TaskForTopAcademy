package lesson2;

/**
 * перечисление, для объяснения Enum с конструктором
 * */
public enum AnimalType {

    //Передаем в конструктор для заполнения поля info
    CAT("У кошки четыре ноги, позади у нее длинный хвост"),
    DOG("Собака - друг человека, а у нас управдом - друг человека");

    private String info;

    //Модификатор доступа для наглядности (private по умолчанию)
    private AnimalType(String info) {
        this.info = info;
    }
    //Обычный геттер
    public String getInfo() {
        return info;
    }

    @Override
    public String toString() {
        //Обращение к классу родителю через super
        return super.toString() + " " + info;
    }
}
