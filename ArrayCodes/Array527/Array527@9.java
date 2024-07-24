import java.util.Scanner;
class Arr9{
        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the size of the array :");
                int size = sc.nextInt();
                int[] arr = new int[size];
                System.out.println("Enter the elements of the array:");
                for(int i = 0 ; i<size;i++){
                        arr[i] = sc.nextInt();
                }
		int secondMin = findSecondMinimum(arr);
		if(secondMin == Integer.MAX_VALUE){
			System.out.println("Second minimum element does not exit .");
		}
		else{
			System.out.print("Second minimum element in the array is :" +secondMin);
		}
	}
	public static int findSecondMinimum(int[] arr){
		if(arr.length<2){
			return Integer.MAX_VALUE;
		}
		int min = Integer.MAX_VALUE;
		int secondMin = Integer.MAX_VALUE;
		for(int num : arr){
			if(num <min){
				secondMin = min;
				min = num;
			}
			else if (num < secondMin && num != min){
				secondMin = num;
			}
		}
		return secondMin;
	}
}


