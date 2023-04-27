package bai3;

import java.util.Scanner;

public class BT_xoa_pt {
    // Bước 1
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Bước 1
            System.out.print("Nhập số phần tử của mảng: ");
            int N = scanner.nextInt();
            int[] array = new int[N];
            System.out.println("Nhập các phần tử của mảng:");
            for (int i = 0; i < N; i++) {
                array[i] = scanner.nextInt();
            }

            // Bước 2
            System.out.print("Nhập phần tử cần xoá: ");
            int X = scanner.nextInt();

            // Bước 3
            int index_del = -1;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == X) {
                    index_del = i;
                    break;
                }
            }

            if (index_del == -1) {
                // X không tồn tại trong mảng
                System.out.println("Không tìm thấy phần tử cần xoá trong mảng.");
            } else {
                // Bước 4
                for (int i = index_del; i < array.length - 1; i++) {
                    array[i] = array[i + 1];
                }

                // Bước 5
                array[array.length - 1] = 0;
                System.out.println("Mảng sau khi xoá phần tử " + X + ":");
                for (int i = 0; i < array.length; i++) {
                    System.out.print(array[i] + " ");
                }
            }
        }
    }
