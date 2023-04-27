package bai4;

public class Temperature {
    private double celsius;

    public Temperature(double celsius) {
        if (celsius < -273) {
            throw new IllegalArgumentException("Nhiệt độ không hợp lệ!");
        }
        this.celsius = celsius;
    }

    public double getCelsius() {
        return celsius;
    }

    public double getFahrenheit() {
        return celsius * 1.8 + 32;
    }

    public double getKelvin() {
        return celsius + 273.15;
    }
}
 class Test {
    public static void main(String[] args) {
        // Khởi tạo một đối tượng Temperature
        Temperature temp = new Temperature(25);

        // Hiển thị ra màn hình nhiệt độ F và độ Kenvin tương ứng
        System.out.println("Nhiệt độ F: " + temp.getFahrenheit());
        System.out.println("Nhiệt độ K: " + temp.getKelvin());
    }
}