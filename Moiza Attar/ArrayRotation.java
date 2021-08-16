import java.util.Scanner;

public class ArrayRotation {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the array n : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the elements of array : ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int temp = arr[n - 1];
            for (int j = n-2; j >= 0; j--) {
                arr[j + 1] = arr[j];
            }
            arr[0] = temp;


            System.out.println();

            System.out.println("Array after rotation: ");
            for (int k = 0; k < n; k++) {
                System.out.print(arr[k] + " ");

            }

        }




    }

}
