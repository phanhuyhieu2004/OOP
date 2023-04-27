package bai6;

// Lớp Circle
public class Circler {
    private double radius;
    private String color;

    public Circler() {
        this.radius = 1.0;
        this.color = "red";
    }

    public Circler(double radius) {
        this.radius = radius;
        this.color = "red";
    }

    public Circler(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + ",color=" + color + "]";
    }
}

// Lớp Cylinder
class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        super();
        this.height = 1.0;
    }

    public Cylinder(double height) {
        super();
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius,color,false);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double volume() {
        return super.getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder[" + super.toString() + ",height=" + height + "]";
    }
}

// Chương trình kiểm thử
 class Test {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1.toString());
        System.out.println("Radius is " + c1.getRadius());
        System.out.println("Color is " + c1.getColor());
        System.out.printf("Area is %.2f%n", c1.getArea());

        Cylinder cyl1 = new Cylinder();
        System.out.println(cyl1.toString());
        System.out.println("Radius is " + cyl1.getRadius());
        System.out.println("Color is " + cyl1.getColor());
        System.out.println("Height is " + cyl1.getHeight());
        System.out.printf("Volume is %.2f%n", cyl1.volume());

        Cylinder cyl2 = new Cylinder(5.0, 2.0);
        System.out.println(cyl2.toString());
        System.out.println("Radius is " + cyl2.getRadius());
        System.out.println("Color is " + cyl2.getColor());
        System.out.println("Height is " + cyl2.getHeight());
        System.out.printf("Volume is %.2f%n", cyl2.volume());
    }
}