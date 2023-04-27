package bai2;

public class BT_hien_thi_cac_snt_nho_hon_100 {

        // Hàm kiểm tra số nguyên tố
        public static boolean isPrime(int n) {
            if (n <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }

        // Hàm main
        public static void main(String[] args) {
            // Duyệt các số từ 2 đến 100 và kiểm tra số nguyên tố
            for (int i = 2; i <= 100; i++) {
                if (isPrime(i)) {
                    System.out.println(i);
                }
            }
        }
    }

