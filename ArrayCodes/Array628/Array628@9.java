import java.util.Scanner;
class ArrDemo9{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Enter size of array:");
		size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter values in array");
		for(int i = 0; i<size;i++){
			arr[i] = sc.nextInt();
		}
		
	       int count = 0;	
		 for(int num : arr){
			 if(isPalindrom(num)){
				 count++;
			 }
	}
					System.out.println("count of pallindrome:" + count);
					
		 }
			 public static boolean isPalindrom(int num){
				 int originalNum = num;
				 int reversedNum = 0;
				 while(num>0){
					 int digit = num%10;
					 reversedNum = reversedNum * 10 + digit;
					 num /=10;
				 }
				 return originalNum == reversedNum;
				
		 }
}

