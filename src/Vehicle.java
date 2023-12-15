public class Vehicle {

    public String brand;
    public int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
    public void displayInfo(){
        System.out.println("Марка: " + brand + " , Год выпуска: " + year);
    }
}

//Определите класс Vehicle как родительский класс. Добавьте поля, такие как brand (марка) и year (год выпуска).
// Напишите конструктор для инициализации этих полей.

//Добавьте в класс Vehicle метод displayInfo(), который будет выводить на консоль информацию о марке и годе выпуска.