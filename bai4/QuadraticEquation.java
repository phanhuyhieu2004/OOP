package bai4;
import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    // Phương thức khởi tạo để khởi tạo giá trị cho các thuộc tính a, b, c
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Phương thức getter để lấy giá trị của thuộc tính a
    public double getA() {
        return a;
    }

    // Phương thức getter để lấy giá trị của thuộc tính b
    public double getB() {
        return b;
    }

    // Phương thức getter để lấy giá trị của thuộc tính c
    public double getC() {
        return c;
    }

    // Phương thức tính delta theo công thức delta = b^2 - 4ac
    public double getDiscriminant() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    // Phương thức tính nghiệm thứ nhất của phương trình bậc hai
    public double getRoot1() {
        if (getDiscriminant() < 0) { // Nếu delta < 0 thì phương trình vô nghiệm
            return 0;
        } else { // Nếu delta >= 0 thì tính nghiệm thứ nhất của phương trình
            return (-b + Math.pow(getDiscriminant(), 0.5)) / (2 * a);
        }
    }

    // Phương thức tính nghiệm thứ hai của phương trình bậc hai
    public double getRoot2() {
        if (getDiscriminant() < 0) { // Nếu delta < 0 thì phương trình vô nghiệm
            return 0;
        } else { // Nếu delta >= 0 thì tính nghiệm thứ hai của phương trình
            return (-b - Math.pow(getDiscriminant(), 0.5)) / (2 * a);
        }
    }
}

 class tain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter c: ");
        double c = sc.nextDouble();
        sc.close();

        // Tạo đối tượng QuadraticEquation với các giá trị a, b, c đã nhập
        QuadraticEquation equation = new QuadraticEquation(a, b, c);

        // Tính toán delta
        double discriminant = equation.getDiscriminant();

        // Hiển thị kết quả tương ứng với giá trị delta
        if (discriminant > 0) {
            System.out.println("The equation has two roots: " + equation.getRoot1() + " and " + equation.getRoot2());
        } else if (discriminant == 0) {
            System.out.println("The equation has one root: " + equation.getRoot1());
        } else {
            System.out.println("The equation has no roots");
        }
    }
}
