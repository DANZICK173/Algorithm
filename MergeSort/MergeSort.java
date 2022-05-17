public class MergeSort {

    public static void mergeSort(int[] array, int n) {

        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = array[i];
        }
        for (int i = mid; i < n; i++) {
            right[i - mid] = array[i];
        }
        mergeSort(left, mid);
        mergeSort(right, n - mid);

        merge(array, left, right, mid, n - mid);

    }

    public static void merge(int[] array, int[] leftarray, int[] rightarray, int maxleft, int maxright) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < maxleft && j < maxright) {
            if (leftarray[i] <= rightarray[j]) {
                array[k++] = leftarray[i++];
            } else {
                array[k++] = rightarray[j++];
            }
        }
        while (i < maxleft) {
            array[k++] = leftarray[i++];
        }
        while (j < maxright) {
            array[k++] = rightarray[j++];
        }
    }

    public static void printArray(int array[]){
        for(int i = 0;i<array.length;i++){
            System.out.print(array[i]+ " ");
        }
    }

}
