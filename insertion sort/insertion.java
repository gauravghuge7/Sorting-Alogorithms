
public class insertion {

    
    static void display(int[] arr) {

        for (int i : arr) {
            System.out.print(i + " ");
        }
    } 

    static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    static void insertionSort(int[] arr) {

        int n = arr.length;

        for(int i=0; i<n; i++) {

            int j = i;

            // while(j > 0 && arr[j] > arr[j-1])  // sort array in reverse use this testcase for loop

            while(j > 0 && arr[j] < arr[j-1]) {

                swap(arr, j, j-1);
                
                j--;
            }
        }

    }
    

    public static void main(String[] args) {
        
        int[] arr = {4,3,5,6,2,1};

        display(arr);

        insertionSort(arr);

        System.out.println();
        display(arr);

    }
}
