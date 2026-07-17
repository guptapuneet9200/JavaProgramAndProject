package ArrayProgram;

import java.util.Scanner;

public class SearchInsertPosition {

    public static int searchInsert(int[] numbers, int target) {

        int left = 0;
        int right = numbers.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (numbers[mid] == target) {
                return mid;
            } 
            else if (numbers[mid] < target) {
                left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
        }

        return left;   // correct insert position
    }

    public static void main(String[] args) {

        int[] numbers = {1, 3, 5, 6};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter target value: ");
        int target = sc.nextInt();

        int position = searchInsert(numbers, target);

        System.out.println("Position: " + position);

        sc.close();
    }
}