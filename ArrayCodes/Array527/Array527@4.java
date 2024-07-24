import java.util.Scanner;
class Arr4{
        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the size of the array :");
                int size = sc.nextInt();
                int[] arr = new int[size];
                System.out.println("Enter the elements of the array:");
                for(int i = 0 ; i<size;i++){
                        arr[i] = sc.nextInt();
		}
		
		for(int i = 0 ; i<size;i++){
		if(i!= -1){
			System.out.println("First duplicate element present at index " + i);
		}
		else{
			System.out.println("No duplicate elements found in the array.");
		}
	}
}
}
