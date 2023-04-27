package bai4;

public class TH_GTNN_method {
        public static void main(String[] args) {
            int[] arr = {4, 12, 7, 8, 1, 6, 9};
            int index = minValue(arr);
            System.out.println("Phần tử nhỏ nhất trong mảng là: " + arr[index]);
        }

        // Phương thức trả về chỉ số của phần tử nhỏ nhất trong mảng
        public static int minValue(int[] array) {
            int index = 0;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[index]) {
                    index = i;
                }
            }
            return index;
        }
    }

