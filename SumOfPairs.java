import java.util.Scanner;

public class SumOfPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int[][] a = new int[n][];
        int k=0,l=0;

        for(int i = 0 ; i < n-1 ; i++){
            for(int j = i+1; j < n; j++){
                if(arr[i]+arr[j] == target){
                    a[k][l] = arr[i];
                    a[k][l+1] = arr[j];
                }
            }
             k++;
             l=0;
        }

        for(int i=0; i<k; i++){
            for(int j=0; j < l; j++){
                System.out.println(a[i][j]);
            }
        }
    }
}
