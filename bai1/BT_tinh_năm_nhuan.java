package bai1;

import java.util.Scanner;

public class BT_tinh_năm_nhuan {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int year;
            year = sc.nextInt();
            if (year % 4== 0 & year % 100 !=0){
                System.out.println("Năm nhuận:");
            } else if (year % 100 ==0 & year % 400 ==0 ) {
                System.out.println("Năm nhuận:");
            } else if (year % 100==0 & year % 400 != 0) {
                System.out.println("Không phải năm nhuận :");
            } else {
                System.out.println("Không phải năm nhuận :");
            }
        }
}
