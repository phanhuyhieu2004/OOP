package bai4;

import java.util.Scanner;

public class Rectangle {
    // Khai báo biến instance width và height kiểu double để lưu chiều rộng và chiều dài của hình chữ nhật
    double width, height;

    // Constructor mặc định không tham số
    public Rectangle() {
    }

    // Constructor có tham số để khởi tạo giá trị width và height cho hình chữ nhật
    public Rectangle(double width, double height) {
        this.width = width; // Gán giá trị width cho biến instance width của hình chữ nhật
        this.height = height; // Gán giá trị height cho biến instance height của hình chữ nhật
    }

    // Phương thức tính diện tích hình chữ nhật
    public double getArea() {
        return this.width * this.height; // Diện tích = chiều rộng * chiều dài
    }

    // Phương thức tính chu vi hình chữ nhật
    public double getPerimeter() {
        return (this.width + this.height) * 2; // Chu vi = (chiều rộng + chiều dài) * 2
    }

    // Phương thức trả về một chuỗi String mô tả các giá trị width và height của hình chữ nhật
    public String display() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }
}
 class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width:");
        double width = scanner.nextDouble();
        System.out.print("Enter the height:");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Your Rectangle \n"+ rectangle.display());
        System.out.println("Perimeter of the Rectangle: "+ rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rectangle.getArea());
    }
}