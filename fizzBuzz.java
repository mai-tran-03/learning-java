/*
- For each number from 1-100, the program prints the number (using console.log)
- If the number is evenly divisible by 3, the program also prints "fizz"
- If the number is evenly divisible by 5, the program also prints "buzz"
- If it's evenly divisible by both, it prints "fizzbuzz"
- The program should use a method to determine what to print.
 */
public class fizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(fizzBuzz(i));
        }
    }

    public static String fizzBuzz(int num) {
        if (num % 3 == 0 && num % 5 == 0) {
            return "fizzbuzz";
        } else if (num % 3 == 0) {
            return "fizz";
        } else if (num % 5 == 0) {
            return "buzz";
        } else {
            return Integer.toString(num);
        }
    }
}