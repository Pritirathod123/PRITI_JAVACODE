import java.util.Scanner;
class ArrayDemo2{
        public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array:");
		int size = sc.nextInt();
		int[] array = new int[size];
		System.out.println("Enter element:");
		for(int i = 0;i<size;i++){
			array[i] = sc.nextInt();
               }
                         
                        System.out.print("Enter the specific number:");
			int specificNum = sc.nextInt();
			 int firstOccurrence = -1;
			 for(int i = 0; i<array.length;i++){
				 if(array[i] == specificNum){
					 firstOccurrence = i;
					 break;
				 }
			 }
			 if(firstOccurrence != -1){
				 System.out.println("Number " + specificNum + " first occurred at index: " + firstOccurrence);
			 }
			 else{
				 System.out.println("Number " + specificNum + "does not exist in the array.");
                }
        }
}
