package bai4;
import java.util.Scanner;

public class TH_chuyen_doi_nhiet_do {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            double fahrenheit; // Khai báo biến lưu độ Fahrenheit
            double celsius; // Khai báo biến lưu độ Celsius
            int choice; // Khai báo biến lựa chọn của người dùng

            do {
                System.out.println("Menu."); // In ra menu chương trình
                System.out.println("1. Fahrenheit to Celsius"); // Lựa chọn chuyển đổi từ độ Fahrenheit sang độ Celsius
                System.out.println("2. Celsius to Fahrenheit"); // Lựa chọn chuyển đổi từ độ Celsius sang độ Fahrenheit
                System.out.println("0. Exit"); // Lựa chọn thoát chương trình
                System.out.println("Enter your choice: "); // Yêu cầu người dùng nhập lựa chọn
                choice = input.nextInt(); // Nhận giá trị lựa chọn từ người dùng

                switch (choice) {
                    case 1: { // Nếu lựa chọn là 1
                        System.out.println("Enter fahrenheit: "); // Yêu cầu người dùng nhập độ Fahrenheit
                        fahrenheit = input.nextDouble(); // Nhận giá trị độ Fahrenheit từ người dùng
                        System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelsius(fahrenheit)); // In ra giá trị sau khi chuyển đổi sang độ Celsius
                        break; // Thoát khỏi lựa chọn 1
                    }
                    case 2:{ // Nếu lựa chọn là 2
                        System.out.println("Enter Celsius: "); // Yêu cầu người dùng nhập độ Celsius
                        celsius = input.nextDouble(); // Nhận giá trị độ Celsius từ người dùng
                      System.out.println("Celsius to Fahrenheit: " + celsiusToFahrenheit(celsius)); // In ra giá trị sau khi chuyển đổi sang độ Fahrenheit
                        break; // Thoát khỏi lựa chọn 2
                    }
                    case 0: // Nếu lựa chọn là 0
                        System.exit(0); // Thoát khỏi chương trình
                }
            } while (choice != 0); // Lặp lại cho đến khi người dùng chọn thoát

        }

        public static double celsiusToFahrenheit(double celsius) { // Phương thức chuyển đổi từ độ Celsius sang độ Fahrenheit
            double fahrenheit = (9.0 / 5) * celsius + 32; // Tính giá trị độ Fahrenheit từ độ Celsius
            return fahrenheit; // Trả về giá trị độ Fahrenheit
        }

        public static double fahrenheitToCelsius(double fahrenheit) { // Phương thức chuyển đổi từ độ Fahrenheit sang độ Celsius
            double celsius = (5.0 / 9) * (fahrenheit - 32); // Tính giá trị độ Celsius từ độ Fahrenheit
            return celsius; // Trả về giá trị độ Celsius
        }
    }

