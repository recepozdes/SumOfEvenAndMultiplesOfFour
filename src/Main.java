import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number, sum = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a number : ");
            number = sc.nextInt();
            if(number%2==0 && number%4==0)
                sum+=number;


        }while (number%2==0);
        System.out.println("Sum of all even numbers divisible by 4 is "+sum);
    }
}
