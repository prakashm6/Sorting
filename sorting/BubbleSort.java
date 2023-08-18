package sorting;

public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = {64, 34, 25, 12, 22, 11, 90 };

        int n = arr.length;
        bubsort(arr);
        for (int i = 0; i < n; i++) {

            System.out.println(arr[i]);

        }

    }

    public static void bubsort(int[] a){

        int len = a.length;
        for (int i = 0; i < len ; i++) {

            for (int j = 0; j < len; j++) {

                if (a[i] > a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;

                }

            }

        }
    }


}
