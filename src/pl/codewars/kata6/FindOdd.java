package pl.codewars.kata6;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindOdd {

    /**
     * Given an array, find the int that appears an odd number of times.
     *
     * There will always be only one integer that appears an odd number of times.
     * @param A
     * @return
     */
    public static int findIt(int[] A) {
        Map<Integer, Long> countMap = IntStream.of(A).boxed()
                .sorted()
                .collect(Collectors.groupingBy(s->s, Collectors.counting()));
        return returnOddCount(countMap);
    }

    private static int returnOddCount(Map<Integer, Long> countMap) {
        for(Integer key : countMap.keySet()){
            if(countMap.get(key) % 2 == 1){
                return key;
            }
        }
        return 0;
    }
}
