package bai2;

import java.util.Scanner;

public class TH_thiet_ke_menu {

    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1.\"Vẽ hình tam giág");
            System.out.println("2. Vẽ hình vuông");
            System.out.println("3.\"Vẽ hình chữ nhật");
            System.out.println("0. Thoát");
            System.out.println("Nhập lựa chọn của bạn\ne: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Vẽ hình tam giác");
                    System.out.println("******");
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    break;
                case 2:
                    System.out.println("Vẽ hình vuông");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 3:
                    System.out.println("Vẽ hình chữ nhật\n");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Không có lựa chọn\n!");
            }
        }
    }
}

