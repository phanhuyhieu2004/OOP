package bai1;
//https://www.youtube.com/watch?v=lDbEG7PWrHc&list=PLPt6-BtUI22rxpe6PZc5H6XAgPusA6fDQ&index=6
public class Epkieu {
    public static void main(String[] args) {
        int a=5;
        int b=10;
//        double kq=a/b;
        double kq=(double) a/b;
//        int=)double

        System.out.println(kq);

//        không cùng kiểu dữ liệu,chỉ lấy phần nguyên
//        ép kiểu hẹp
        int c=128;
        byte s=(byte)c;
        System.out.println(c);
        System.out.println(s);
//        vì byte chỉ lưu trữ tối đa 127 nên không th vuượt quá
        int e=18;
        byte k=(byte)e;
        System.out.println(e);
        System.out.println(k);
//        vẫn lưu trữ vì trong phạm vi dữ liệu
        int myInt=9;
        double myDouble=myInt;
        System.out.println(myInt);
        System.out.println(myDouble);

        float f = 10;
        double d = 1234L;
        System.out.println("f=：" + f);
        System.out.println("d=：" + d);


        double Mydouble=9.78d;
        int Myint=(int)Mydouble;
        System.out.println(Myint);
        System.out.println(Mydouble);



        int love=6;
        double hate=220.23456;

//        ép kiểu mở rộng
        double think= love;
        System.out.println(think);
//        ép kiểu hẹp
        int fall=(int)hate;
        System.out.println(fall);

    }


//    Trong phương thức "main", khai báo một biến kiểu float mang tên là "f" và gán giá trị bằng số nguyên 10.
//
//    Tiếp theo, khai báo một biến kiểu double mang tên là "d" và gán giá trị bằng số nguyên dạng long 1234L.
//
//    Cuối cùng, in ra màn hình giá trị của biến "f" và biến "d" thông qua phương thức "println" của lớp "System.out".
//
//
//    Lưu ý rằng trong việc gán giá trị cho biến, ta không cần phải thêm đuôi "F" cho giá trị gán cho biến kiểu float vì giá trị số có thể được hiểu là kiểu float nếu nó không có đuôi "D" hoặc "L". Tuy nhiên, khi gán giá trị cho biến kiểu double, ta cần đặt đuôi "D" hoặc "d" để giá trị được hiểu là kiểu double. Nếu không, giá trị sẽ bị hiểu là kiểu nguyên (int) hoặc kiểu long (long)

}
