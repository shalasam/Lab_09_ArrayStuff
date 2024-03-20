import java.util.Random;

public class Lab_09_ArrayStuff {

    public static void main(String[] args) {
        // Problem 1
        int[] dataPoints = new int[100];
        Random rnd = new Random();

        // Initialize array with random values
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }

        // Display array values
        System.out.print("Array values: ");
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]);
            if (i < dataPoints.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println();

        // Calculate sum and average
        int sum = 0;
        for (int num : dataPoints) {
            sum += num;
        }
        double average = (double) sum / dataPoints.length;

        // Display sum and average
        System.out.println("Sum of array values: " + sum);
        System.out.printf("Average of array values: %.2f%n", average);

        // Problem 2
        int userValue = SafeInput.getRangedInt("Enter an integer between 1 and 100: ", 1, 100);

        // Linear scan (search)
        int count = 0;
        for (int num : dataPoints) {
            if (num == userValue) {
                count++;
            }
        }
        System.out.println("Number of times " + userValue + " found in array: " + count);

        // Find first occurrence of userValue
        int firstIndex = -1;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userValue) {
                firstIndex = i;
                break;
            }
        }
        if (firstIndex != -1) {
            System.out.println("The value " + userValue + " was found at array index " + firstIndex);
        } else {
            System.out.println("The value " + userValue + " was not found in the array.");
        }

        // Find min and max values
        int min = dataPoints[0];
        int max = dataPoints[0];
        for (int i = 1; i < dataPoints.length; i++) {
            if (dataPoints[i] < min) {
                min = dataPoints[i];
            }
            if (dataPoints[i] > max) {
                max = dataPoints[i];
            }
        }
        System.out.println("Minimum value in array: " + min);
        System.out.println("Maximum value in array: " + max);

        // Problem 3
        System.out.println("Average of dataPoints: " + getAverage(dataPoints));
    }

    public static double getAverage(int[] values) {
        int sum = 0;
        for (int num : values) {
            sum += num;
        }
        return (double) sum / values.length;
    }
}