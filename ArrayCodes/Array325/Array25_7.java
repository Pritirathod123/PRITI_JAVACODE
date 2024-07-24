import java.util.Scanner;
class ArrayDemo7{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enteer the size of array:");
                int size = sc.nextInt();
                int[] array = new int[size];
                System.out.print("Enter the elements of the array:");
                for(int i = 0;i<size;i++){
                        array[i] = sc.nextInt();
               }

	       if(size%2 !=0 && size >= 5){
		       System.out.println("Odd element:");



                         for(int i = 0; i<size;i++){
                                 if(array[i]%2 != 0){
                                        System.out.print(array[i] + " ");
				 }
                                 }
	       }
                                 else{
                                                                      
                        System.out.println("Even elements:");
                        for(int i = 0 ; i<size; i++){
				if(array[i]%2 == 0){
                                System.out.print(array[i] + " ");

                
        
				}
			}
				 }
	}
}	
	
	
	       
