import java.util.*;
public class Prompter {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter minimum number: ");
        int num1 = input.nextInt();
        System.out.print("Enter maximum number: ");
        int num2 = input.nextInt();
        int target;
        do{
            System.out.print("Enter another number: ");
            target = input.nextInt();
        }
        while(target <= num1 || target >= num2);
        input.close();
        for (int i=5; i<10; i = i + 2)
{
System.out.print(i);
}
    }
}
