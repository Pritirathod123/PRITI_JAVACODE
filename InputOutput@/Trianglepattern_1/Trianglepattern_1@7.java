import java.util.Scanner;
class Scanner_Pattern7{
        public static void main (String [] args){
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter the number of rows");
                int rows = scanner.nextInt();
                        int currentNumber = 1;
		        char currentChar = 'a';
		       	for(int i = 0; i<rows ;i++){
                         
                          
                        for(int j = 0; j<=i;j++){
				//if(i == 0){
				if(j%2==0){
					System.out.print(currentNumber++ + " ");
				}
			else{

                                
                                System.out.print(currentChar++  + " ");
				
				
                        }
                        //else{
                          //      System.out.print(currentChar++  + " ");
			
                       }
                       
		
                        System.out.println();
                }
        }
}
