package bai4;

public class Circle {
    private double radius; // Thuộc tính bán kính
    private String color; // Thuộc tính màu sắc

    public Circle(double radius) { // Phương thức khởi tạo với 1 tham số truyền vào
        this.radius = radius;
        this.color = "red"; // Giá trị mặc định cho thuộc tính màu sắc là "red"
    }

    public double getRadius() { // Phương thức trả về bán kính của hình tròn
        return this.radius;
    }

    public double getArea() { // Phương thức tính diện tích hình tròn theo công thức S = Math.PI * radius * radius
        return Math.PI * this.radius * this.radius;
    }

    public static void main(String[] args) {
        // Tạo đối tượng hình tròn với bán kính là 2
        Circle circle1 = new Circle(2);

        // Truy cập phương thức của lớp hình tròn vừa tạo và gán cho các biến radius, area
        double radius = circle1.getRadius();
        double area = circle1.getArea();

        // Hiển thị bán kính và diện tích
        System.out.println("Bán kính: " + radius);
        System.out.println("Diện tích: " + area);

        // Tạo đối tượng hình tròn khác, với bán kính có giá trị khác nhau
        Circle circle2 = new Circle(3.5);
        radius = circle2.getRadius();
        area = circle2.getArea();

        // Hiển thị bán kính và diện tích
        System.out.println("Bán kính: " + radius);
        System.out.println("Diện tích: " + area);
    }
}
