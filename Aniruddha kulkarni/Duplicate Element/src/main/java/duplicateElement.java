public class duplicateElement {

    public static void main(String[] args) {
        int a[] = new int[]{1, 2, 3, 2, 4, 5, 4};

        System.out.println("Duplicate Elements are: ");

        int i;
        for (i = 0; i < a.length; i++)

        for (int j = i + 1; j < a.length; j++)

            if(a[i]==a[j])
            {
                System.out.println(a[j]);
            }





    }
}
