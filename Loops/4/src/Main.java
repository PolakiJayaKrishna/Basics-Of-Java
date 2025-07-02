class DigitCounter {
    public static void main(String[] args) {
        int number = 123456;
        System.out.println("The number " + number + " has " + countDigits(number) + " digits.");
    }

    public static int countDigits(int number) {
        int digitCount = 0;

        // Convert the number to a positive value if it's negative
        if (number < 0) {
            number = -number;
        }

        // Count the digits
        do {
            number /= 10;  // Remove the last digit
            digitCount++;  // Increase the digit count
        } while (number > 0);

        return digitCount;
    }
}
