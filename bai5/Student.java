package bai5;

public class Student {
    private int rollno; // biến instance (non-static) rollno dùng để lưu thông tin số thứ tự của sinh viên
    private String name; // biến instance (non-static) name dùng để lưu thông tin tên của sinh viên
    private static String college = "BBDIT"; // biến static college dùng để lưu tên trường đại học mặc định của tất cả sinh viên

    // constructor để khởi tạo các biến instance của lớp Student
    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    // phương thức static change() dùng để thay đổi giá trị của biến static college
    static void change() {
        college = "CODEGYM";
    }

    // phương thức display() dùng để hiển thị thông tin của một sinh viên
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }

}
 class TestStaticMethod {
    public static void main(String[] args) {
        Student.change(); // gọi phương thức static change trong lớp Student để thay đổi giá trị của biến static college

        // tạo các đối tượng sinh viên
        Student s1 = new Student(111, "Hoang");
        Student s2 = new Student(222, "Khanh");
        Student s3 = new Student(333, "Nam");

        // gọi phương thức display để hiển thị thông tin của từng đối tượng sinh viên
        s1.display();
        s2.display();
        s3.display();
    }
}
