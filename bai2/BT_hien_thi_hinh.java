package bai2;
import java.util.Scanner;
public class BT_hien_thi_hinh {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int choice;

            do {
                System.out.println("Menu:");
                System.out.println("1.Hình chữ nhật ");
                System.out.println("2. Tam giác vuông");
                System.out.println("3.  tam giác cân");
                System.out.println("4. Thoát");
                System.out.print("Nhập: ");
                choice = input.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Nhập chiều rộng của hình chữ nhật: ");
                        int width = input.nextInt();
                        System.out.print("Nhập chiều dài của hình chữ nhật: ");
                        int height = input.nextInt();
                        for (int i = 1; i <= height; i++) {
                            for (int j = 1; j <= width; j++) {
                                System.out.print("* ");
                            }
                            System.out.println();
                        }
                        break;

                    case 2:
                        System.out.print("Nhập kích thước của hình tam giác: ");
                        int size = input.nextInt();
                        for (int i = 1; i <= size; i++) {
                            for (int j = 1; j <= i; j++) {
                                System.out.print("* ");
                            }
                            System.out.println();
                        }
                        break;

                    case 3:
                        System.out.print("Nhập chiều cao của tam giác: ");
                        int triHeight = input.nextInt();
                        for (int i = 1; i <= triHeight; i++) {
                            for (int j = 1; j <= triHeight - i; j++) {
                                System.out.print("  ");
                            }
                            for (int k = 1; k <= 2 * i - 1; k++) {
                                System.out.print("* ");
                            }
                            System.out.println();
                        }
                        break;

                    case 4:
                        System.out.println("Goodbye!");
                        break;

                    default:
                        System.out.println("Không hợp lệ.");
                        break;
                }
            } while (choice != 4);
        }
    }

