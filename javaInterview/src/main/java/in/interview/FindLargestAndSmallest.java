package in.interview;

import java.util.Arrays;

public class FindLargestAndSmallest {
    public static void main(String[] args){
        int[] sample = {-4, 10,5,6,99,-10,-20};
        int largest = sample[0];
        int smallest = sample[0];
        for(int i = 0; i<sample.length; i++){
            if(sample[i]>largest){
                largest = sample[i];
            }
            if(sample[i]<smallest){
                smallest = sample[i];
            }
        }
        System.out.println(largest+" largest "+smallest+" smallest");

        //using stream
        System.out.println("max: "+Arrays.stream(sample).max().getAsInt());
        System.out.println("min: "+Arrays.stream(sample).min().getAsInt());
    }
}
