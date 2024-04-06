import java.util.*;
public class DigitsSum {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = input.nextInt();
        int length = String.valueOf(num).length();
        int total = 0;
        char temp1;
        String temp2;
        for(int i=0;i<length;i++){
            temp1 = String.valueOf(num).charAt(i);
            temp2 = String.valueOf(temp1);
            total += Integer.parseInt(temp2);
        }
        System.out.print("The sum of the digits is: "+total);
    }
}
