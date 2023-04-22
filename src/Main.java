import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String binaryNumber = Integer.toBinaryString(n);
        int count = Integer.bitCount(Integer.parseInt(binaryNumber, 2));
        int length = binaryNumber.length();
        if (count > 1 ){
            System.out.println(length);
        }
        else {
            System.out.println(length - 1);
        }
    }
}