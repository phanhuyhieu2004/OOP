package bai5;

public class Circle{ private double radius = 1.0;
        private String color = "red";

        public Circle() {
        }

        public Circle(double radius) {
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }

        public double getArea() {
            return Math.PI * radius * radius;
        }
}
 class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(2.0);
        System.out.println("Radius = " + circle.getRadius());
        System.out.println("Area = " + circle.getArea());
    }
}
//public class Circle {
//    private double radius = 1.0;
//    private String color = "red";
//
//    public Circle() {
//    }
//
//    public Circle(double radius) {
//        this.radius = radius;
//    }
//
//    private double getRadius() {
//        return radius;
//    }
//
//    private double getArea() {
//        return Math.PI * radius * radius;
//    }
//}
//class TestCircle {
//    public static void main(String[] args) {
//        Circle circle = new Circle(2.0);
//        System.out.println("Radius = " + circle.getRadius()); // sẽ bị lỗi biên dịch vì phương thức getRadius() đã được chuyển sang private
//        System.out.println("Area = " + circle.getArea()); // sẽ bị lỗi biên dịch vì phương thức getArea() đã được chuyển sang private
//    }
//}
