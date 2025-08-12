package in.interview;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class findFactorial {
    public static void main(String[] args){
        System.out.println(factorial(10));
        System.out.println(factorialUsingStream(10));
    }

    public static int factorial(int num){
        if(num==0) return 1;
        return num * (factorial(num-1));
    }
    public static int factorialUsingStream(int num){
        Integer factorial = IntStream.rangeClosed(1,num).reduce((fact,n)->fact*n).getAsInt();

        return  factorial;
    }
}
