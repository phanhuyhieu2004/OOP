package bai2;
import java.util.Scanner;
public class BT_20_snt_dau_tien {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Nhập số lượng số nguyên tố bạn muốn in\n: ");
            int numbers = input.nextInt();

            int count = 0;

            int N = 2;

            while (count < numbers) {
                boolean isPrime = true;
                for (int i = 2; i <= Math.sqrt(N); i++) {
                    if (N % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.println(N);
                    count++;
                }
                N++;
            }

            System.out.println("Kết thức ct.");
        }
    }

