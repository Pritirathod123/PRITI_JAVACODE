import java.util.Scanner;
class Arr10{
        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the size of the array :");
                int size = sc.nextInt();
                int[] arr = new int[size];
                System.out.println("Enter the elements of the array:");
                for(int i = 0 ; i<size;i++){
                        arr[i] = sc.nextInt();
                }
		System.out.print("Output:");
		for(int i = 0 ; i<size; i++){
			System.out.print(factorial(arr[i]));
			if(i != size - 1){
				System.out.print(",");
			}
		}
	}
		public static int factorial(int num){
			if(num == 0 || num ==1){
				return 1 ; 
			}
			int result = 1 ;
			for(int i = 2; i<= num; i++){
				result *=i;
			}
			return result;
		}
	}
