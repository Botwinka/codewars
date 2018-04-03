package pl.codewars.kata7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Vowels {

    private static final Pattern VOVEL_PATTERN = Pattern.compile("[aeiouyAEIOUY]");

    /**
     * Return the number (count) of vowels in the given string.
     *
     * We will consider a, e, i, o, and u as vowels for this Kata.
     *
     * The input string will only consist of lower case letters and/or spaces.
     *
     * @param str
     * @return
     */
    public static int getCount(String str) {
        Matcher matcher = VOVEL_PATTERN.matcher(str);
        int count = 0;
        while(matcher.find()){
            count++;
        }
        return count;
    }
}
