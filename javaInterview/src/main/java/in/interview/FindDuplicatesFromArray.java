package in.interview;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FindDuplicatesFromArray {
    public static void main(String[] args){
        String[] sample = {"abc","pqr","qwe","aaa","bb","abc","qwe","bb"};
        //using set
        Set<String> uniqueSet = new HashSet<>();
        Arrays.stream(sample).forEach(s->{
            if(!uniqueSet.add(s)){
                System.out.println("duplicate: "+s);
            }

        });

        //using Map
        Map<String, Integer> countMap = new HashMap<>();
        for(String s: sample){
            if(countMap.get(s) != null){
                countMap.put(s,countMap.get(s)+1);
            }
            else{
                countMap.put(s,1);
            }
        }
        for(Map.Entry<String, Integer> entry: countMap.entrySet()){
            if(entry.getValue()>1){
                System.out.println("duplicate: "+entry.getKey());
            }
        }
        // using streams
        Map<String, Long> grouped = Arrays.asList(sample).stream().collect(Collectors.groupingBy(x->x, Collectors.counting()));
        System.out.println(grouped);
        for(Map.Entry<String, Long> m: grouped.entrySet()){
            if(m.getValue()>1){
                System.out.println("duplicate: "+m.getKey());
            }

        }
    }
}

