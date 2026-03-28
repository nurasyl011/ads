
import java.util.Scanner;

class RecursionTasks {

        // Task 1
        static void printDigits(int n) {
                if (n < 10) {
                        System.out.println(n);
                        return;
                }
                printDigits(n / 10);
                System.out.println(n % 10);
        }

        // Task 2
        static double sum(int[] arr, int index) {
                if (index == arr.length) return 0;
                return arr[index] + sum(arr, index + 1);
        }

        static double average(int[] arr) {
                double total = sum(arr, 0);
                return total / arr.length;
        }

        // Task 3
        static boolean isPrime(int n, int divisor) {
                if (n <= 2) return n == 2;
                if (n % divisor == 0) return false;
                if (divisor * divisor > n) return true;
                return isPrime(n, divisor + 1);
        }

        // Task 4
        static long factorial(int n) {
                if (n == 0 || n == 1) return 1;
                return n * factorial(n - 1);
        }

        // Task 5
        static int fibonacci(int n) {
                if (n <= 1) return n;
                return fibonacci(n - 1) + fibonacci(n - 2);
        }

        // Task 6
        static long power(int a, int n) {
                if (n == 0) return 1;
                return a * power(a, n - 1);
        }

        // Task 7
        static void reverseOutput(int[] arr, int index) {
                if (index < 0) return;
                System.out.print(arr[index] + " ");
                reverseOutput(arr, index - 1);
        }

        // Task 8
        static boolean checkDigits(String s, int index) {
                if (index == s.length()) return true;
                if (!Character.isDigit(s.charAt(index))) return false;
                return checkDigits(s, index + 1);
        }

        // Task 9
        static int countChars(String s, int index) {
                if (index == s.length()) return 0;
                return 1 + countChars(s, index + 1);
        }

        // Task 10
        static int gcd(int a, int b) {
                if (b == 0) return a;
                return gcd(b, a % b);
        }

        // Main method
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                // Task 1
                System.out.println("Enter a number to print its digits:");
                int num = sc.nextInt();
                printDigits(num);

                // Task 2
                System.out.println("Enter the number of array elements:");
                int n = sc.nextInt();
                int[] arr = new int[n];
                System.out.println("Enter the array elements:");
                for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
                System.out.println("Average value: " + average(arr));

                // Task 3
                System.out.println("Enter a number to check for primality:");
                int primeCandidate = sc.nextInt();
                System.out.println(primeCandidate + " -> " + (isPrime(primeCandidate, 2) ? "Prime" : "Composite"));

                // Task 4
                System.out.println("Enter a number for factorial:");
                int factNum = sc.nextInt();
                System.out.println("Factorial: " + factorial(factNum));

                // Task 5
                System.out.println("Enter n for Fibonacci number:");
                int fibNum = sc.nextInt();
                System.out.println("Fibonacci(" + fibNum + ") = " + fibonacci(fibNum));

                // Task 6
                System.out.println("Enter a and n to compute a^n:");
                int a = sc.nextInt();
                int powN = sc.nextInt();
                System.out.println(a + "^" + powN + " = " + power(a, powN));

                // Task 7
                System.out.println("Enter the number of elements for reverse output:");
                int m = sc.nextInt();
                int[] revArr = new int[m];
                System.out.println("Enter the numbers:");
                for (int i = 0; i < m; i++) revArr[i] = sc.nextInt();
                System.out.print("Reverse order: ");
                reverseOutput(revArr, m - 1);
                System.out.println();

                // Task 8
                System.out.println("Enter a string to check if it contains only digits:");
                String s = sc.next();
                System.out.println(checkDigits(s, 0) ? "Yes" : "No");

                // Task 9
                System.out.println("Enter a string to count characters:");
                String s2 = sc.next();
                System.out.println("Number of characters: " + countChars(s2, 0));

                // Task 10
                System.out.println("Enter two numbers for GCD:");
                int g1 = sc.nextInt();
                int g2 = sc.nextInt();
                System.out.println("GCD(" + g1 + ", " + g2 + ") = " + gcd(g1, g2));

                sc.close();
        }
}

