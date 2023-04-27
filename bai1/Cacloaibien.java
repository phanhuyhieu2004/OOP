package bai1;
//https://www.youtube.com/watch?v=279x-6u5ebY&list=PLPt6-BtUI22rxpe6PZc5H6XAgPusA6fDQ&index=5
public class Cacloaibien {
    public  static int a=10;
//    Nếu bạn muốn sử dụng biến toàn cục trong phương thức main() thì biến toàn cục đó phải được khai báo là một biến tĩnh (static) bởi vì phương thức main() cũng là một phương thức tĩnh.
//
//    Nếu bạn khai báo biến toàn cục là một biến không tĩnh (non-static), bạn không thể truy cập nó trực tiếp từ phương thức main() mà phải tạo một đối tượng của lớp đó trước khi truy cập biến toàn cục đó thông qua đối tượng đó.
    public static void main(String[] args) {


//    khai báo biến

        byte tuoi;
//    khai báo nhieu bien 1 kieu
        int c, d, e;

//    khởi tạo biến+gán giá trị
        int tuoiCon = 15;
        float diemvan = 7.5f;
        double diemanh = 7.5;
        tuoiCon=30;
        System.out.println(tuoiCon + a );
// hằng số
        final int dosoi=15;




    }
//        Biến cục bộ
    public void printMessenger(){

        String messenger="xin chào";
        System.out.println(messenger);
    }

}
