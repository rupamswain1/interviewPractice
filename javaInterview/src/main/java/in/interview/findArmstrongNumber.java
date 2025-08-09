package in.interview;

public class findArmstrongNumber {
    public static void main(String[] args){
        System.out.println(isArmstrong(404));
        System.out.println(isArmstrong(153));
        System.out.println(isArmstrong(0));
    }

    public static boolean isArmstrong(int num){
        int temp = num;
        int cube=0;
        while(num>0){
            int r = num%10;
            cube = cube+(r*r*r);
            num = num/10;
        }
        return temp == cube;
    }
}
