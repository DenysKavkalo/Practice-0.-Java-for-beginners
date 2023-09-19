import java.util.ArrayList;
import java.util.Arrays;

public class AverageCalculator {
    public static double getAverageOf(ArrayList<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException("The ArrayList is empty or null.");
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        return (double) sum / numbers.size();
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 10, 15));

        double average = getAverageOf(numbers);
        System.out.println("Average: " + average);
    }
}
