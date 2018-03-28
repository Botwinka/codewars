package pl.codewars.kata7;

public class Accumul {

    public static String accum(String in){
        StringBuilder result = new StringBuilder();
        int index = 0;
        for(String string : in.split("")){
            appendLetters(result, index, string);
            index = addMinusIfNotEndOfLine(in, result, index);
        }
        System.out.println(result.toString());
        return result.toString();
    }

    private static void appendLetters(StringBuilder result, int index, String string) {
        result.append(string.toUpperCase());
        for(int j = 0; j < index; j++){
            result.append(string.toLowerCase());
        }
    }

    private static int addMinusIfNotEndOfLine(String in, StringBuilder result, int index) {
        if(++index < in.length()) {
            result.append("-");
        }
        return index;
    }
}
