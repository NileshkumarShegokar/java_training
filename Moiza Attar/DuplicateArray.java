import java.util.Scanner;

public class DuplicateArray {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the array n : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the elements of array : ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Duplicate elements");

        for (int i = 0; i < n; i++) {
            for (int j =i+1; j<n; j++) {
                if(arr[i]==arr[j]){

                System.out.println(arr[j]);
                }
            }
        }
    }
}
