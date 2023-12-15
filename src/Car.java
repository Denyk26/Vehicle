public class Car extends Vehicle {

    public String model;

    public Car(String brand, int year, String model) {
        super(brand, year);
        this.model = model;
    }
}

//Создайте класс Car, который будет являться дочерним для класса Vehicle.
// Добавьте дополнительное поле model (модель) и напишите конструктор для инициализации всех полей.

//Перепишите метод toString() в классе Car, чтобы он включал информацию о марке, модели и годе выпуска автомобиля.