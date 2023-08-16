import java.util.Scanner;
public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row of an array");
        int n = sc.nextInt();
        System.out.println("Enter no of column of an array");
        int m = sc.nextInt();
        int [][] arr = new int[n][m];
        System.out.println("Enter no of elements");
        int sum =0;
        for(int i=0; i< arr.length; i++){
            for(int j=0; j<arr.length; j++){
                int q= sc.nextInt();
               arr[i][j] = q;
               sum = sum+q;
            }
        }
        System.out.println("The sum of elements of the 2D-Array is "+sum);
    }
}
