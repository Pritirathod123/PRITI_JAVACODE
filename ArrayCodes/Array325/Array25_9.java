import java.util.Scanner;
class ArrayDemo9{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enteer the size of array:");
                int size = sc.nextInt();
                int[] array = new int[size];
                System.out.print("Enter the elements of the array:");
                for(int i = 0;i<size;i++){
                        array[i] = sc.nextInt();
               }
	       System.out.println("Prime number : ");


                         for(int num : array){
                                 if(isPrime(num)){
                                         System.out.print(num + " ");
                           }
                                 }
                                 }
	public static boolean isPrime(int num){
		if(num<=1){
			return false;
		}
                        for(int i = 2 ; i<=Math.sqrt(num); i++){
                               if(num%i==0){
				       return false;

                }
			}
			return true;
        }
}
