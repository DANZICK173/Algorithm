public class BubbleSort {

    // Implementation of Bubble sort in a Java Program
    public static void bubbleSort(int array[]) {
        int n = array.length;
        int temp = 0;   
        
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (array[j] > array[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    temp = array[j + 1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
    
        // prints the array
        for(int x = 0;x<n;x++){
            System.out.print(array[x] + " ");
        }
    }

}
