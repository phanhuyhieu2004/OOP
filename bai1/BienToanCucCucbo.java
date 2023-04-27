package bai1;

public class BienToanCucCucbo {
//    biến toàn cục


    static int globalNum=5;
//    sd bất kì trong method nào,khắp nơi trong lớp

    public static void main(String[] args) {
//          biến cục bộ
//        sd trong method khai báo
//        Vì biến toàn cục có thể được sử dụng trong bất kỳ phương thức nào của lớp, nó có thể được sử dụng để chia sẻ thông tin giữa các phương thức. Tuy nhiên, sử dụng quá nhiều biến toàn cục có thể làm cho mã trở nên khó hiểu và khó bảo trì. Do đó, nên sử dụng biến cục bộ trong trường hợp có thể.
        int localNum=4;
        int sum= globalNum+localNum;
        System.out.println(sum);
    }

}

