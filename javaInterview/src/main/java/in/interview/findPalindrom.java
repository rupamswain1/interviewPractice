package in.interview;

public class findPalindrom {
    public static void main(String[] args){
    System.out.println(isPalindrom(121));
        System.out.println(isPalindrom(12));
    }
    public static boolean isPalindrom(int num){
        int temp = num;
        int revNum = 0;
        while(num>0){
            revNum = (revNum*10)+(num%10);
            num=num/10;
        }

        return revNum == temp;
    }
}
