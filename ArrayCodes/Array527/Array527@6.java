import java.util.Scanner;
class Arr6{
        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the size of the array :");
                int size = sc.nextInt();
                int[] arr = new int[size];
                System.out.println("Enter the elements of the array:");
                for(int i = 0 ; i<size;i++){
                        arr[i] = sc.nextInt();
		}
		
		
              int index = findFirstPrime(arr);

		if (index!= -1){
			System.out.println("First primr number found at index " + index);
		}
		else{
			System.out.println("No prime number found in the array .");
		}
		}
	         public static boolean isPrime(int num){
			 if(num <= 1){
				 return false;
			 }
			 for(int i = 2 ; i<= Math.sqrt(num); i++){
				 if(num % i == 0){
					 return false;
				 }
			 }
			 return true;
		 }
		 public static int findFirstPrime(int[] arr){
			 for(int i = 0 ; i< arr.length;i++){
				 if(isPrime(arr[i])){
					 return i ;
				 }
			 }
			 return -1;

	}
}
