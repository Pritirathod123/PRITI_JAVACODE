import java.util.Scanner;
class Arr5{
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
		for(int i = 0; i< size ; i++){
			int count = countDigits(arr[i]);
			System.out.print(count);
			if(i != size - 1){
				System.out.print(", ");
			}
		
		}
	}
	public static int countDigits(int number){


		 int count = 0;
		 while(number != 0){
			 
			 number /=10;
			 count++;
		 }
		 return count;
	}
}
