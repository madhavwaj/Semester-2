import java.util.Scanner;
public class q5 {
    public static int sum_of_digits(int n) {
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }
        if (sum >= 10)
            return sum_of_digits(sum);

        else {
            return sum;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no");
        int x=sc.nextInt();
        System.out.print("sum of digit "+x+" until the no is single digit is "+sum_of_digits(x));
    }
}

