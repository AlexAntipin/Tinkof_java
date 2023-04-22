import java.util.Scanner;

public class zadanie {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        scanner.nextLine();
        String inputString = scanner.nextLine();
        String[] numberStrings = inputString.split(" ");

        int[] floor = new int[n];

        for (int i = 0; i < numberStrings.length; i++) {
            floor[i] = Integer.parseInt(numberStrings[i]);
        }

        int t_number_back = scanner.nextInt();
        t_number_back -= 1;

        if (floor[t_number_back] - floor[0] <= t || floor[floor.length - 1] - floor[t_number_back] <= t){
            System.out.println(floor[floor.length - 1] - floor[0]);
        }
        else if (floor[t_number_back] - floor[0] <= floor[floor.length - 1] - floor[t_number_back]){
            System.out.println(floor[t_number_back] - floor[0] + floor[floor.length - 1] - floor[0]);
        }
        else {
            System.out.println(floor[floor.length - 1] - floor[t_number_back] + floor[floor.length - 1] - floor[0]);
        }

    }
}