import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int sum = 0;
        int product = 1;
        while(n>0){
            int rem = n%10;
            sum = sum+rem;
            product = product*rem;
            n = n/10;
        }
        if(sum==product){
            System.out.println("Spy number");
        }
        else{
            System.out.println("Not a spy number");
        }

    }

}
