package bai1;

import java.util.Scanner;

public class BT_doc_so_thanh_chu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số cần đọc (tối đa 3 chữ số): ");
        int number = scanner.nextInt();

        if (number < 0 || number > 999) {
            System.out.println("Out of ability");
            return;
        }

        String result = "";

        // Đọc số hàng trăm
        int hundreds = number / 100;
        if (hundreds > 0) {
            switch (hundreds) {
                case 1:
                    result += "one hundred";
                    break;
                case 2:
                    result += "two hundred";
                    break;
                case 3:
                    result += "three hundred";
                    break;
                case 4:
                    result += "four hundred";
                    break;
                case 5:
                    result += "five hundred";
                    break;
                case 6:
                    result += "six hundred";
                    break;
                case 7:
                    result += "seven hundred";
                    break;
                case 8:
                    result += "eight hundred";
                    break;
                case 9:
                    result += "nine hundred";
                    break;
            }
        }

        // Đọc số hàng chục và đơn vị
        int tens = (number % 100) / 10;
        int ones = number % 10;

        if (tens == 1) { // Đọc số từ 10 đến 19
            switch (ones) {
                case 0:
                    result += " ten";
                    break;
                case 1:
                    result += " eleven";
                    break;
                case 2:
                    result += " twelve";
                    break;
                case 3:
                    result += " thirteen";
                    break;
                case 4:
                    result += " fourteen";
                    break;
                case 5:
                    result += " fifteen";
                    break;
                case 6:
                    result += " sixteen";
                    break;
                case 7:
                    result += " seventeen";
                    break;
                case 8:
                    result += " eighteen";
                    break;
                case 9:
                    result += " nineteen";
                    break;
            }
        } else { // Đọc số từ 20 đến 99
            switch (tens) {
                case 2:
                    result += " twenty";
                    break;
                case 3:
                    result += " thirty";
                    break;
                case 4:
                    result += " forty";
                    break;
                case 5:
                    result += " fifty";
                    break;
                case 6:
                    result += " sixty";
                    break;
                case 7:
                    result += " seventy";
                    break;
                case 8:
                    result += " eighty";
                    break;
                case 9:
                    result += " ninety";
                    break;
            }

            switch (ones) {
                case 1:
                    result += " one";
                    break;
                case 2:
                    result += " two";
                    break;
                case 3:
                    result += " three";
                    break;
                case 4:
                    result += " four";
                    break;
                case 5:
                    result += " five";
                    break;
                case 6:
                    result += " six";
                    break;
                case 7:
                    result += " seven";
                    break;
                case 8:
                    result += " eight";
                    break;
                case 9:
                    result += " nine";
                    break;
            }
        }

        // Xử lý trường hợp số 0
        if (number == 0) {
            result = "zero";
        }

        System.out.println(result.trim());
    }
}

