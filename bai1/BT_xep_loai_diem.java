package bai1;

import java.util.Scanner;

public class BT_xep_loai_diem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập điểm chuyên cần: ");
        float diemChuyenCan = scanner.nextFloat();

        System.out.print("Nhập điểm kiểm tra: ");
        float diemKiemTra = scanner.nextFloat();

        System.out.print("Nhập điểm thi học kỳ: ");
        float diemThiHocKy = scanner.nextFloat();

        float diemTrungBinh = Math.round(diemChuyenCan + diemKiemTra + diemThiHocKy) / 3;

        String xepLoai;
        switch ((int) diemTrungBinh / 1) {
            case 10:
            case 9:
            case 8:
                xepLoai = "A";
                break;
            case 7:
                xepLoai = "B";
                break;
            case 6:
            case 5:
                xepLoai = "C";
                break;
            case 4:
                xepLoai = "D";
                break;
            default:
                xepLoai = "F";
                break;
        }

        System.out.println("Điểm trung bình của bạn là: " + diemTrungBinh);
        System.out.println("Xếp loại của bạn là: " + xepLoai);
    }
}
