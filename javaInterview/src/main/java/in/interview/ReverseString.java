package in.interview;

public class ReverseString {
    public static void main(String[] args){
        String example = "Hello Java";
        //using string builder
        String reversedBuilder = new StringBuilder(example).reverse().toString();
        System.out.println("reversedBuilder "+reversedBuilder);

        //using loop
        String reversed = "";
        for(int i= example.length()-1; i >= 0; i--){
            reversed = reversed+example.charAt(i);
        }
        System.out.println("reversed "+reversed);
    }
}
