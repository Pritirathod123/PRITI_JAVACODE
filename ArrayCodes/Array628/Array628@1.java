import java.util.Scanner;
class ArrDemo1{
        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the size of the array :");
                int size = sc.nextInt();
                int[] arr = new int[size];
                System.out.println("Enter the elements of the array:");
                for(int i = 0 ; i<size;i++){
                        arr[i] = sc.nextInt();
                }
		int num = 2;
		int sumofPrimes = 0;
		int countofPrimes = 0;
		while(countofPrimes<10){
			if(num%2==0){
				countofPrimes++;
				sumofPrimes = sumofPrimes + num;
				System.out.println( "countofPrimes  " + num);
			}
			num++;
		}
		System.out.println("Even numbers sumofPrimes is : " + sumofPrimes);
	}
}
