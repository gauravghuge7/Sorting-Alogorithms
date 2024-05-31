
class binarySort {

    static void display(int[] arr) {

        for (int i : arr) {
            System.out.print(i + " ");
        }
    } 

    static void sort(int[] arr) {

        int n = arr.length;

        for(int i=0; i<n; i++) {

            for(int j=i+1; j<n; j++) {
                
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp; 
                }
            }
        }
    }

    
    static void SecondApproach(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            
            for(int j=0; j<n-i-1; j++) {

                if(arr[j] > arr[j + 1]) {

                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }

        }
    }
    public static void main(String[] args) {
        int[] arr = {5,3,3,2,8,3,3,3,3,7,7,7,7,6,4};


        // sort(arr);

        SecondApproach(arr);

        display(arr);
    }
}

