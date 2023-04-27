package bai1;

import java.util.Scanner;

public class BT_ung_dung_chuyen_doi_tien_te {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số tiền cần quy đổi :");
        usd = sc.nextDouble();
        double quydoi = usd * 23000;
        System.out.println("Số tiền quy đổi :"+ quydoi);

    }
}

