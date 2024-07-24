import java.util.Scanner;
class Arr8{
        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the number  :");
                long number = sc.nextLong();
                int[] arr = convertToArray(number);
                System.out.println("Output:");
                for(int i = 0 ; i<arr.length;i++){
			System.out.print(arr[i]);
			if(i != arr.length -1){
				System.out.print(" ,");
			}
                }
	}
	public static int[] convertToArray(long number){
		String numString = Long.toString(number);
		int[] arr = new int[numString.length()];
		for(int i =0; i<numString.length(); i++){
			int digit = Character.getNumericValue(numString.charAt(i));
			arr[i] = digit +1;
		}
		return arr;
	}
}
