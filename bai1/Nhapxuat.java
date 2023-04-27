package bai1;
//https://www.youtube.com/watch?v=kUKIClQ8tR8&list=PLPt6-BtUI22rxpe6PZc5H6XAgPusA6fDQ&index=2
//https://www.youtube.com/watch?v=rBsW0G1zhOc&list=PLPt6-BtUI22rxpe6PZc5H6XAgPusA6fDQ&index=10
import java.util.Scanner;

public class Nhapxuat {
    public static  void main(String[] args) {
//        sout
//        ctrl+D:copy dòng
//        System.out.println("dòng 1");
//        System.out.println("dòng 2");
//        System.out.println("doòng 3");
//
////        print
//        System.out.print("dong 4");
//        System.out.print("dong 5");
//        System.out.println("");
//
//
////        Xuất ký tự đặc biệt
////        \t
//        System.out.println("Cộng Hòa Xã Hội Chủ Nghĩa Việt Nam");
//        System.out.println("\t Độc lập tự do hạnh phúc");
//
////        \n
//        System.out.println(" Sông cầu nước chảy lơ thơ\n Có đôi trai gái ngồi hơ quần đùi");
//
////         \"
//        System.out.println("Có người nói rằng \"Cho đi la còn mãi\"");\
        Scanner yeu=new Scanner(System.in);
//        Tạo đối tượng với scanner
//        System.out.println("Nhập tên:");
//        String love= yeu.nextLine();
//        System.out.println(love);
//        System.out.println("Nhập số nguyên");
//        int a= yeu.nextInt();
//        System.out.println(a);
        System.out.println("Mời nhập bán kính :");
        double r= yeu.nextDouble();
       double cv=2*Math.PI*r;
       double dt=Math.PI*Math.pow(2,r);
       int i=3;
       double y=i;

        System.out.println("Chu vi là : " + cv);
        System.out.println("DT là : " + dt);
        System.out.println(y);
        // lam tron len gom 1 so thap phan, nhan va chia cho 10
        // lam tron len gom 2 so thap phan, nhan va chia cho 100
        // lam tron len gom 3 so thap phan, nhan va chia cho 1000
        System.out.println("CV là : " +Math.round(cv));
//        hàm Math round làm tròn lên/hàm Math floor làm tròn xuống
        System.out.println("CV là : " +Math.floor(cv));
    }

}
