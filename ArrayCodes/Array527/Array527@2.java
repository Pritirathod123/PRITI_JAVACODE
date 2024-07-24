import java.util.Scanner;
class Arr2{
        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the size of the array :");
                int size = sc.nextInt();
                int[] arr = new int[size];
                System.out.println("Enter the elements of the array:");
                for(int i = 0 ; i<size;i++){
                        arr[i] = sc.nextInt();
		}
		int oddSum = 0;
		int evenSum = 0;
		for(int i = 0; i<size;i++){
			if(arr[i]%2==0){
				evenSum += arr[i];
			}
			else{
				oddSum += arr[i];
			}
		}
		System.out.println("Odd Sum = " + oddSum);
		System.out.println("Even Sum = " + evenSum);
	}
}


