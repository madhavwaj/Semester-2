import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements of Array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of Array");
        for(int i=0; i<n; i++){
            int g = sc.nextInt();
            arr[i] = g;
        }
        int max=arr[0];
                for(int i=1; i<arr.length; i++) {
                    if (arr[i] > max) {
                        max = arr[i];
                    }
                }
                int min = arr[0];
                for(int i=0; i<arr.length; i++ ){
                    if (arr[i]<min){
                        min = arr[i];
                    }
        }
                int max_count = 0;
                for(int i=0; i<arr.length; i++){
                    if(arr[i]==max){
                        max_count++;
                    }
                }
                int min_count = 0;
                for(int i=0; i<arr.length; i++){
                    if(arr[i]==min){
                        min_count++;
                    }
                }
                int first_occ = 0;
                for(int i=0; i<arr.length; i++){
                    if(arr[i]==max){
                        first_occ=i;
                        break;
                    }
                }
                int last_occ =0;
                for(int i=0; i<arr.length; i++){
                    if(arr[i]==min){
                        last_occ=i;
                        break;
                    }
                }
                System.out.println("Maximum element of Array is"+max+"and occurs"+max_count);
                System.out.println("Minimum element of Array is"+min+ "and occurs"+min_count+"times.");
                System.out.println("First occurrence of maximum element is at position "+first_occ);
                System.out.println("Last occurrence of minimum element is at position "+last_occ);

    }
}
