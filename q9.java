import java.util.Scanner;
public class q9 {
    public static double sumMajorDiagonal(double[][] m){
        double sum = 0;
        for(int i=0; i<m.length; i++)
            sum = sum+m[i][i];
        return sum;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Fill in this 4x4 matix");
        double[][] nums = new double[4][4];
        for (int i =0;i<nums.length;i++)
        {
            for (int j =0;j<nums[i].length;j++)
            {
                nums[i][j] = sc.nextDouble();
            }
        }
        System.out.println("Diagonal sum is " + sumMajorDiagonal(nums));

    }
}
