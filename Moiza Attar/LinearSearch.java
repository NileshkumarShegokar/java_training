import java.util.Scanner;

public class LinearSearch {
    public static void main(String args[]) {

         int i;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the array n : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the elements of array : ");

        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter value to find : ");
        int search = sc.nextInt();

        for (i= 0; i < n; i++) {
            if (arr[i] == search) {
                System.out.println("Element is present in array " + search);
                break;
            }
        }

        if (i == n){
            System.out.println("Element is not present in array " +search );
        }
    }
}

