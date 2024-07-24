import java.util.Scanner;
class ArrDemo2{
        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                
                int[] arr = { 11,6,8,9,5,8,7,8,6};
            
		 System.out.println("Enter key: ");
		 int key = sc.nextInt();
		 int count = 0;
		 for(int i = 0; i<arr.length; i++){
			 if(arr[i] == key){
				 count++;
				 if(count > 2){
					 arr[i] = arr[i] * arr[i] * arr[i];
				 }
			 }
		 }
	
		 if(count>0){	 
			 System.out.println("Array will be like:");
		 for(int num : arr){
			 System.out.println(num + " ");
		 }
		 }
		 else{
			 System.out.println("element not found ");
		 }
	}
}
