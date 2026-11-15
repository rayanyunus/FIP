import java.util.ArrayList;
import java.util.Collection;
import java.util.Arrays;
import java.util.function.Predicate;

public class GenericMethodDemo {

    // Generic method to count elements that satisfy a condition
    public static <T> int countMatching(
            Collection<T> collection, Predicate<T> condition) {

        int count = 0;

        for (T item : collection) {
            if (condition.test(item)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        // Collection of integers
        ArrayList<Integer> numbers = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        );

        // Count odd numbers
        int oddCount = countMatching(numbers, n -> n % 2 != 0);

        System.out.println("Numbers: " + numbers);
        System.out.println("Number of odd integers: " + oddCount);

        // Collection of strings
        ArrayList<String> words = new ArrayList<>(
                Arrays.asList("level", "hello", "radar", "world", "madam")
        );

        // Count palindrome words
        int palindromeCount = countMatching(
                words,
                word -> word.equalsIgnoreCase(
                        new StringBuilder(word).reverse().toString()
                )
        );

        System.out.println("\nWords: " + words);
        System.out.println("Number of palindrome words: " + palindromeCount);
    }
}