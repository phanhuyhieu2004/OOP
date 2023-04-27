package bai5;


public class Car {

    private String name; // biến instance (non-static) name dùng để lưu thông tin tên của xe hơi
    private String engine; // biến instance (non-static) engine dùng để lưu thông tin loại động cơ của xe hơi

    public static int numberOfCars; // biến static numberOfCars dùng để lưu số lượng xe hơi đã được tạo

    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCars++; // mỗi khi tạo một đối tượng xe hơi mới, số lượng xe hơi được tăng lên 1
    }

    // getter và setter cho biến name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // getter và setter cho biến engine
    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
}
 class TestStaticProperty {

    public static void main(String[] args) {

        Car car1 = new Car("Mazda 3","Skyactiv 3"); // Tạo một đối tượng xe hơi car1 với tên "Mazda 3" và động cơ "Skyactiv 3"

        System.out.println(Car.numberOfCars); // In ra số lượng xe hơi đã được tạo (1)

        Car car2 = new Car("Mazda 6","Skyactiv 6"); // Tạo một đối tượng xe hơi car2 với tên "Mazda 6" và động cơ "Skyactiv 6"

        System.out.println(Car.numberOfCars); // In ra số lượng xe hơi đã được tạo (2)

    }
}