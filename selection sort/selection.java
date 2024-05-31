public class selection {
    
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



    static void selectionSort(int[] arr) {
        
        int n = arr.length;
        display(arr);

        System.out.println();

        for(int i=0; i<n-1; i++) {

            int minIdx = i;

            for(int j=i+1; j<n; j++) {

                if(arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            swap(arr, i, minIdx);

            display(arr);
            System.out.println();
        }

    }
    public static void main(String[] args) {
        
        int[] arr = {4,3,5,1};

        selectionSort(arr);

        display(arr);
        
    }
}
