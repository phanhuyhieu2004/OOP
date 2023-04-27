package bai1;

import java.util.Scanner;

public class Switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập :");
        int a = sc.nextInt();
//        int div = a % 2;
//        switch (div) {
//            case 0:
//                System.out.println("chẵn");
//break;
//            default:
//                System.out.println("lẻ");
//                break;
//
//        }
//    }
//        switch (a) {
//            case 1:
//            case 3:
//            case 5:
//            case 7:
//            case 8:
//            case 10:
//            case 12:
//                System.out.println("Tháng có 31 ngày");
//            case 4:
//            case 6:
//            case 9:
//            case 11:
//                System.out.println("Tháng có 30 ngày");
//                break;
//            case 2:
//                System.out.println("Tháng có 28/29 ngày");
//                break;
//            default:
//                System.out.println("Không có tháng đó");
//                break;
//                gom hết case lại cùng 1 cv

//        Bài tập trong  Switch case java-Gà lại lập trình
        switch (a) {
            case 1:
                System.out.println("Tìm theo tên ");
                break;
            case 2:
                System.out.println("Tìm theo tác giả");
                break;
            case 3:
                System.out.println("Tìm theo nhà xuất bản");
                break;
            case 4:
                System.out.println("Tìm theo tiêu đề");
                break;
            default:
                System.out.println("Không hợp lệ");
                break;


        }

    }
}

