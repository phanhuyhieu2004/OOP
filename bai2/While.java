package bai2;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
//        int x=0;
//        while (x<=5){
//            System.out.println(x);
//            x++;
//        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so :");
        int n=sc.nextInt();
        while (n<1||n>99){
            System.out.println("Nhap lai n tu 1-99");
            n=sc.nextInt();
            System.out.println("da nhap xong");
        }
        System.out.println("Ban da nhap xong "+n);
    }
}
