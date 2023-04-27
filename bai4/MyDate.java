import java.util.Scanner;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return String.format("%02d/%02d/%04d", day, month, year);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập ngày, tháng, năm từ bàn phím
        System.out.print("Nhập ngày: ");
        int day = scanner.nextInt();

        System.out.print("Nhập tháng: ");
        int month = scanner.nextInt();

        System.out.print("Nhập năm: ");
        int year = scanner.nextInt();

        // Tạo đối tượng MyDate với giá trị vừa nhập
        MyDate date = new MyDate(day, month, year);

        // In ra ngày, tháng, năm
        System.out.println("Ngày tháng năm: " + date.toString());

        scanner.close();
    }
}