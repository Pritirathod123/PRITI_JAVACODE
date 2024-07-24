import java.util.Scanner;
class Arr1{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array :");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements of the array:");
		for(int i = 0 ; i<size;i++){
			arr[i] = sc.nextInt();
		}
		
		if(arri%2==0){
			System.out.println("The given array id in ascending order.");
		}
		else{
			System.out.println("The given array is not ascending order.");
		}
	}
}

