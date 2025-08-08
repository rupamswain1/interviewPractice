package in.interview;

import java.util.*;

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
    }
}
