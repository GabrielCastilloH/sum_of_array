import java.awt.*;

public class Main {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 5, 8, 10};
        int arrayLength = 6;
        int sum = 0;

        for (int i=0; i < arrayLength; i++) {
            sum += myArray[i];
        }

        System.out.println("The total sum of the array is: " + sum);
    }
}
