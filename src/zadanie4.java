import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class zadanie4 {
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
        Arrays.sort(floor);

        //Реверс массива
        int[] reversedNumbers = new int[floor.length];
        for (int i = 0; i < reversedNumbers.length; i++) {
            reversedNumbers[i] = floor[floor.length - 1 - i];
        }


        //
        List<List<Integer>> twoDList = new ArrayList<>();




        for (int i = 0; i < 11; i++) {
            List<Integer> row1 = new ArrayList<>();
            twoDList.add(row1);
        }

        //Будем заполнять по остаткам
        for (int i = 0; i < reversedNumbers.length; i++) {
            
        }


//        for (List<Integer> row : twoDList) {
//            for (Integer value : row) {
//                System.out.print(value + " ");
//            }
//            System.out.println();
//        }






        for (int i = 0; i < numberStrings.length; i++) {
            System.out.println(reversedNumbers[i]);
        }




//        int t_number_back = scanner.nextInt();
//        t_number_back -= 1;
//
//        if (floor[t_number_back] - floor[0] <= t || floor[floor.length - 1] - floor[t_number_back] <= t){
//            System.out.println(floor[floor.length - 1] - floor[0]);
//        }
//        else if (floor[t_number_back] - floor[0] <= floor[floor.length - 1] - floor[t_number_back]){
//            System.out.println(floor[t_number_back] - floor[0] + floor[floor.length - 1] - floor[0]);
//        }
//        else {
//            System.out.println(floor[floor.length - 1] - floor[t_number_back] + floor[floor.length - 1] - floor[0]);
//        }

    }
}
