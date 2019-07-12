//pending

public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        int reverse_num = 0;
        int original_num = 0;
        if(number < 0){
            original_num = -1 * number;}
        while(original_num != 0){
            int remainder = original_num % 10;
            reverse_num *= 10;
            reverse_num += remainder;
            original_num = (original_num-remainder)/10;}
        if(number<0){
            if((-1*number) == reverse_num){return true;}
            else{return false;}
        }
        else{
            if(number == reverse_num){return true;}
            else{return false;}
        }
    }
}
