package bai3;
import java.util.Scanner;

public class BT_gop_mang {
     public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            // Nhập kích thước của hai mảng số nguyên
            System.out.print("Nhập kích thước mảng thứ nhất: ");
            int size1 = input.nextInt();
            int[] array1 = new int[size1];

            System.out.print("Nhập kích thước mảng thứ hai: ");
            int size2 = input.nextInt();
            int[] array2 = new int[size2];

            // Nhập giá trị cho các phần tử trong hai mảng số nguyên
            System.out.println("Nhập giá trị cho các phần tử trong mảng thứ nhất:");
            for (int i = 0; i < size1; i++) {
                array1[i] = input.nextInt();
            }

            System.out.println("Nhập giá trị cho các phần tử trong mảng thứ hai:");
            for (int i = 0; i < size2; i++) {
                array2[i] = input.nextInt();
            }

            // Gộp hai mảng số nguyên thành một mảng số nguyên
            int[] mergedArray = new int[size1 + size2];

            // Sao chép các phần tử của mảng số nguyên thứ nhất vào mảng số nguyên đã gộp
            for (int i = 0; i < size1; i++) {
                mergedArray[i] = array1[i];
            }

            // Sao chép các phần tử của mảng số nguyên thứ hai vào mảng số nguyên đã gộp
            for (int i = 0; i < size2; i++) {
                mergedArray[size1 + i] = array2[i];
            }

            // In ra mảng số nguyên đã gộp
            System.out.print("Mảng số nguyên đã gộp: ");
            for (int i = 0; i < size1 + size2; i++) {
                System.out.print(mergedArray[i] + " ");
            }
        }
    }
