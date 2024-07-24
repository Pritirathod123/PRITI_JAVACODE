import java.util.Scanner;
class ArrDemo6{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size = sc.nextInt();
		int[] array = new int[size];
		System.out.println("Enter array elements:");
		for(int i = 0; i<size; i++){
			array[i] = sc.nextInt();
		}
		System.out.println("Enter key :");
		int key = sc.nextInt();
		System.out.println("Output:");
		for(int i = 0; i<size;i++){
			if(array[i] % key == 0){
				System.out.println("An element multiple of " + key + " found at index: " +i);
			}
		}
	}
}

