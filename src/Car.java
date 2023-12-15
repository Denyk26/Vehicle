public class Car extends Vehicle {

    public String model;

    public Car(String brand, int year, String model) {
        super(brand, year);
        this.model = model;
    }

    public void info() {
        System.out.println("Марка машины: " + this.brand + ", " + "Модель машины: " + this.model + ", " + "Год выпуска: " + this.year);
    }
}

//Создайте класс Car, который будет являться дочерним для класса Vehicle.
// Добавьте дополнительное поле model (модель) и напишите конструктор для инициализации всех полей.

//Перепишите метод toString() в классе Car, чтобы он включал информацию о марке, модели и годе выпуска автомобиля.