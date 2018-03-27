package pl.codewars.kata6;

import java.util.*;

public class WhichAreIn {

    public static String[] inArray(String[] array1, String[] array2) {
        Set<String> occurrenceSet = new TreeSet<>();
        addToOccurrenceSet(array1, occurrenceSet, array2);
        return occurrenceSet.toArray(new String[occurrenceSet.size()]);
    }

    private static void addToOccurrenceSet(String[] array1, Set<String> occurrenceSet, String[] array2) {
        Set<String> array2Set = new HashSet<>(Arrays.asList(array2));
        for(String a1 : array1){
            addToOccurensSetIfAnyMatch(occurrenceSet, array2Set, a1);
            if(occurrenceSet.size() >= array1.length){
                return;
            }
        }
    }

    private static void addToOccurensSetIfAnyMatch(Set<String> occurrenceSet, Set<String> array2Set, String a1) {
        boolean anyMatch = array2Set.stream().anyMatch(a2 -> a2.contains(a1));
        if(anyMatch) {
            occurrenceSet.add(a1);
        }
    }
}
