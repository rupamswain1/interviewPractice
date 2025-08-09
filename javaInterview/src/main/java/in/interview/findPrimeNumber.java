package in.interview;

public class findPrimeNumber {
    public static void main(String[] args){
        System.out.println(isPrime(3));
        System.out.println(isPrime(13));
        System.out.println(isPrime(12));
        System.out.println(isPrime(16));
    }

    public static boolean isPrime(int num){
        if(num<=1) return false;
        if(num == 2) return true;
        if(num%2 == 0) return false;

        for(int i = 3; i<Math.sqrt(num); i+=2){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
}
