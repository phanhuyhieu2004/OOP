package bai3;
import java.util.Scanner;
public class BT_pt_lon_nhat_trong_mang_2_chieu {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            // Nhập kích thước ma trận từ người dùng
            System.out.print("Nhập số hàng của ma trận: ");
            int rows = input.nextInt();

            System.out.print("Nhập số cột của ma trận: ");
            int cols = input.nextInt();

            // Tạo ma trận và khởi tạo giá trị lớn nhất
            double[][] matrix = new double[rows][cols];
            double max = matrix[0][0];
            int maxRow = 0;
            int maxCol = 0;

            // Nhập giá trị cho các phần tử trong ma trận
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print("Nhập giá trị cho phần tử [" + i + "][" + j + "]: ");
                    matrix[i][j] = input.nextDouble();

                    // Tìm giá trị lớn nhất và tọa độ của nó
                    if (matrix[i][j] > max) {
                        max = matrix[i][j];
                        maxRow = i;
                        maxCol = j;
                    }
                }
            }

            // In ra giá trị lớn nhất và tọa độ của nó
            System.out.println("Phần tử lớn nhất trong ma trận là " + max + " tại tọa độ [" + maxRow + "][" + maxCol + "]");
        }
    }

