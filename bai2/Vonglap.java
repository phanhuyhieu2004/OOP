package bai2;

public class Vonglap {

    public static void main(String[] args) {
//        i=i+2;
//        for(int i=2;i<12;i+=2){
//            System.out.println(i);
//
//        }
//        for (int i = 12; i >= 0; i -= 2) {
//            System.out.println(i);
//
//        }
//       chạy i từ 2 cho đến i <12 và mỗi lần tăng lên 2 đv(sau bước in ra)
//        int sum = 0;
//        for (int i = 0; i <= 10; i++) {
//            sum += i;
//            sum=sum+i
//            chạy i từ 0 đddeen i<=10,sau khi i =0 sẽ nhảy lên bước lặp thành i=1 xong kt đk vẫn nhỏ hơn 10 nen lại thực hiện
//        }
//        System.out.println(sum);
        
        
//        for (int i = 0; i <=5 ; i++) {
//            System.out.println(i);

//            Chúng ta khởi tạo giá trị i = 1
//            Thực hiện đánh giá biểu thức i <= 5. Nếu true thì thực hiện câu lệnh println() bên trong.
//            Sau đó, update điều kiện, thực thi ++i.
//                    Bây giờ, i có giá trị là 2, i vẫn nhỏ hơn hoặc bằng 5.
//            Tiếp tục thực hiện câu lệnh println()
//    ...
//            Khi i tăng lên thành 6. Biểu thức i <= 5 trả về giá trị false thì thoát khỏi vòng lặp.


        int [] mangSoNguyen={2,3,4,5,6,7};
        int sum=0;
//        for (int soNguyen:mangSoNguyen) {
//            sum+=soNguyen;
//            sum=sum+số nguyên
//        }
//        System.out.println(sum);
//        Trong đoạn mã này, biến mangSoNguyen được khởi tạo với một mảng số nguyên gồm 6 phần tử {2, 3, 4, 5, 6, 7} và biến sum được khởi tạo với giá trị 0.
//
//        Sau đó, vòng lặp for-each được bắt đầu. Trong mỗi lần lặp, giá trị của từng phần tử trong mảng mangSoNguyen sẽ được lưu vào biến soNguyen, và biến soNguyen sẽ được cộng vào biến sum bằng cách sử dụng toán tử +=.
//
//        Cụ thể, các bước của vòng lặp và giá trị của biến sum tại mỗi bước lặp được thể hiện như sau:
//
//        Bước 1: soNguyen=2, sum=0+2=2
//        Bước 2: soNguyen=3, sum=2+3=5
//        Bước 3: soNguyen=4, sum=5+4=9
//        Bước 4: soNguyen=5, sum=9+5=14
//        Bước 5: soNguyen=6, sum=14+6=20
//        Bước 6: soNguyen=7, sum=20+7=27
        for (int i = 0; i < mangSoNguyen.length ;i++) {
            sum+=mangSoNguyen[i ];
        }
        System.out.println(sum);

//        Bước 1: i=0,//        mangSoNguyen[i]=2, sum=0+2=2
///        Bước 2: i=1, mangSoNguyen[i]=3, sum=2+3=5
//        Bước 3: i=2, mangSoNguyen[i]=4, sum=5+4=9
//        Bước 4: i=3, mangSoNguyen[i]=5, sum=9+5=14
//        Bước 5: i=4, mangSoNguyen[i]=6, sum=14+6=20
//        Bước 6: i=5, mangSoNguyen[i]=7, sum=20+7=27

        }
    }



