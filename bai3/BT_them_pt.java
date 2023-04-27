package bai3;
import java.util.Scanner;
public class BT_them_pt {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Bước 1: Khai báo và khởi tạo mảng số nguyên gồm N phần tử cho trước.
            int N;
            System.out.print("Nhập số phần tử của mảng: ");
            N = sc.nextInt();
            int[] arr = new int[N];
            System.out.println("Nhập các phần tử của mảng:");
            for (int i = 0; i < N; i++) {
                System.out.print("arr[" + i + "] = ");
                arr[i] = sc.nextInt();
            }

            // Bước 2: Nhập giá trị cần chèn
            System.out.print("Nhập giá trị cần chèn: ");
            int X = sc.nextInt();

            // Bước 3: Nhập vào vị trí index cần chèn X vào trong mảng
            System.out.print("Nhập vị trí cần chèn (từ 0 đến " + (N - 1) + "): ");
            int index = sc.nextInt();

            // Bước 4: Nếu index <= -1 và index >= array.length – 1 thì hiển thị không chèn được phần tử vào mảng.
            if (index < 0 || index >= arr.length) {
                System.out.println("Không chèn được phần tử vào mảng.");
            } else {
                // Bước 5: Thực hiện chèn phần tử X ở vị trí index vào mảng
                // Dịch các phần tử từ vị trí index đến cuối mảng sang phải một vị trí
                for (int i = N - 1; i > index; i--) {
                    arr[i] = arr[i - 1];
                }
                // Chèn phần tử X vào vị trí index
                arr[index] = X;

                // Bước 6: In ra mảng
                System.out.print("Mảng sau khi chèn " + X + " vào vị trí " + index + " là: ");
                for (int i = 0; i < N; i++) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }