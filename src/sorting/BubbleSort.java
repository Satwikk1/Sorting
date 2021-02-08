package sorting;

public class BubbleSort {
	
	static int Ar[]=new int[] {10, 9, 5, 3, 6, 7, 8, 2, 1, 0, 11};
	static int temp;
	public static void main(String[] args) {
		
		System.out.print("Unsorted Array is:	");
		for(int i=0; i<11; i++) {
			System.out.print(Ar[i]+" ");
		}
		System.out.print("\n");
		for(int i=10; i>=0; i--) {
			for(int j=0; j<i; j++) {
				if(Ar[j]>Ar[j+1]) {
					temp=Ar[j];
					Ar[j]=Ar[j+1];
					Ar[j+1]=temp;
				}
			}
		}
		System.out.print("Sorted Array is:	");
		for(int i=0; i<11; i++) {
			System.out.print(Ar[i]+" ");
		}
		
	}

}

