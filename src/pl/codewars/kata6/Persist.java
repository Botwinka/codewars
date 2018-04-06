package pl.codewars.kata6;

public class Persist {
    /**
     * Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence, which is the number of times you must multiply the digits in num until you reach a single digit.
     *
     * For example:
     *
     * persistence(39) == 3 // because 3*9 = 27, 2*7 = 14, 1*4=4
     * // and 4 has only one digit
     *
     * persistence(999) == 4 // because 9*9*9 = 729, 7*2*9 = 126,
     * // 1*2*6 = 12, and finally 1*2 = 2
     *
     * persistence(4) == 0 // because 4 is already a one-digit number
     * @param n
     * @return
     */
    public static int persistence(long n) {
        return persistence(n, 0);
    }

    private static int persistence(long n, int count){
        if(n < 10){
            return count;
        }
        long newN = 1;

        while (n > 0){
            newN *= n % 10;
            n = n / 10;
        }

        return persistence(newN, ++count);
    }
}
