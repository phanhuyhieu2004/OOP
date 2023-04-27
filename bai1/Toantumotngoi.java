package bai1;

public class Toantumotngoi {
    public static void main(String[] args) {
        int a=5;
        System.out.println(a++);
        System.out.println(a);
//        Các toán tử tăng giảm được đặt làm hậu tố như a++ sẽ được câu lệnh đánh giá giá trị trước sau đó mới tăng và lưu giá trị vào biến.
//        Chính vì thế, câu lệnh System.out.println(a++); cho ra kết quả 5.
//        Và câu lệnh sau đó, Sytem.out.println(a); cho ra kết quả 6.
        System.out.println(++a);
        System.out.println(a);
//        Toán tử tăng giảm được đặt làm tiền tố có hành vi ngược lại.
//        Khi máy đọc câu lệnh, nó sẽ đọc từ trái sang phải.
//        Nó sẽ thấy và thực thi toán tử ++, lưu giá trị mới vào biến a trước. Sau đó câu mới đánh giá giá trị a.
    }
}
