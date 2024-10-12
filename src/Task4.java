import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] initArray = new int[]{38, 27, 43, 3, 9, 82, 10};

        mergeSort(initArray);
        for (int i : initArray) {
            System.out.print(i + ", ");
        }
    }

    public static void merge(int[] left, int[] right, int[] result) {

        int k = 0;
        int i = 0;
        int j = 0;
        while (i < left.length && j < right.length) {

            if (left[i] <= right[j]) result[k++] = left[i++];
            else result[k++] = right[j++];

        }

        while (i < left.length) {
            result[k++] = left[i++];
        }

        while (j < right.length) {
            result[k++] = right[j++];
        }
    }

    public static void mergeSort(int[] array) {
        if (array.length < 2) return;

        int mid = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);

        mergeSort(left);
        mergeSort(right);
        merge(left, right, array);
    }
}
