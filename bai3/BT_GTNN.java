package bai3;
import java.util.Scanner;
public class BT_GTNN {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            // Khai báo và nhập kích thước mảng từ bàn phím
            System.out.print("Nhap kich thuoc mang: ");
            int size = input.nextInt();

            // Khai báo mảng
            int[] arr = new int[size];

            // Nhập giá trị cho các phần tử trong mảng từ bàn phím
            System.out.println("Nhap cac phan tu trong mang:");
            for (int i = 0; i < size; i++) {
                arr[i] = input.nextInt();
            }

            // Gán phần tử đầu tiên trong mảng là phần tử có giá trị nhỏ nhất
            int minValue = arr[0];

            // Duyệt mảng từ phần tử thứ 2 đến hết mảng
            for (int i = 1; i < size; i++) {
                // So sánh lần lượt các phần tử tiếp theo với giá trị nhỏ nhất
                if (arr[i] < minValue) {
                    // Nếu phần tử tiếp theo nhỏ hơn giá trị nhỏ nhất thì gán giá trị nhỏ nhất là phần tử tiếp theo
                    minValue = arr[i];
                }
            }

            // In ra giá trị nhỏ nhất
            System.out.println("Gia tri nho nhat trong mang la: " + minValue);
        }
    }

