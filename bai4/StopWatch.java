package bai4;

import java.util.Date;
import java.util.Random;
public class StopWatch {
    private long startTime;
    private long endTime;

    // Phương thức khởi tạo không tham số, khởi tạo startTime với thời gian hiện tại của hệ thống
    public StopWatch() {
        this.startTime = new Date().getTime();
    }

    // Phương thức getter để lấy giá trị của startTime
    public long getStartTime() {
        return this.startTime;
    }

    // Phương thức getter để lấy giá trị của endTime
    public long getEndTime() {
        return this.endTime;
    }

    // Phương thức start() để reset startTime về thời gian hiện tại của hệ thống
    public void start() {
        this.startTime = new Date().getTime();
    }

    // Phương thức stop() để thiết đặt endTime về thời gian hiện tại của hệ thống
    public void stop() {
        this.endTime = new Date().getTime();
    }

    // Phương thức getElapsedTime() trả về thời gian đã trôi qua theo số milisecond giây
    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }
}


 class testStopWatch {
     public static void main(String[] args) {
         // Tạo một mảng gồm 100,000 số nguyên ngẫu nhiên
         int[] arr = new int[100000];
         Random random = new Random();
         for (int i = 0; i < arr.length; i++) {
             arr[i] = random.nextInt(100000);
         }

         // Khởi tạo một đối tượng StopWatch
         StopWatch stopWatch = new StopWatch();

         // Sắp xếp mảng bằng thuật toán sắp xếp chọn
         for (int i = 0; i < arr.length - 1; i++) {
             int minIndex = i;
             for (int j = i + 1; j < arr.length; j++) {
                 if (arr[j] < arr[minIndex]) {
                     minIndex = j;
                 }
             }
             int temp = arr[i];
             arr[i] = arr[minIndex];
             arr[minIndex] = temp;

             // Tính toán thời gian đã trôi qua và hiển thị ra màn hình
             if ((i + 1) % 10000 == 0) {
                 stopWatch.stop();
                 System.out.println("Elapsed time after sorting " + (i + 1) + " numbers: " + stopWatch.getElapsedTime() + " milliseconds");
                 stopWatch.start();
             }
         }

         // Dừng đồng hồ bấm giờ và hiển thị thời gian đã trôi qua
         stopWatch.stop();
         System.out.println("Total elapsed time: " + stopWatch.getElapsedTime() + " milliseconds");
     }
 }