package sorting;

public class InsertionSort {
	static void sort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 1; i < n; ++i) { 
            int key = arr[i]; 
            int j = i - 1; 
            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key; 
        } 
    } 
  
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
  
        System.out.println(); 
    } 
	
	
	public static void main(String[] args) {
		int Ar[]=new int[] {10, 9, 5, 3, 6, 7, 8, 2, 1, 0, 11};
		System.out.print("Unsorted array is:	");
		printArray(Ar);
		sort(Ar);
		System.out.print("Sorted array is:	");
		printArray(Ar);
	}


}
