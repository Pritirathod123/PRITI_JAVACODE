import java.util.Scanner;
class Scanner_Pattern6{
        public static void main (String [] args){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the number of rows");
                int rows = sc.nextInt();
		
		
                char currentChar = 'A';
                for(int i = 0; i<rows; i++){
			 //char currentChar = 'B';
			 
                         
                          int currentNumber = 1;
                        for(int j = 0; j<=i;j++){
				if(i%2==1){
                               System.out.print((char) (currentChar++) + " ");
                               // System.out.println(currentNumber + " ");
				currentNumber++;
                        }
			else{
				System.out.print( currentNumber++ + " ");
				//System.out.print(currentChar + " ");
			}
			}
			
                        System.out.println();
			currentChar++;

                }
        }
}

