import java.util.Scanner;
class Scanner_Pattern10{
        public static void main (String [] args){
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter the number of rows");
                int rows = scanner.nextInt();
                char currentChar = 'a';
		int currentNumber = 1;
                for(int i = 0; i<rows; i++){
                        
                //char currentChar = 'a';
                for(int j = 0; j<=i;j++){
                        if(i%2==0){
                             System.out.print(currentNumber++  + " ");
                             

                        }
                        else{
                                System.out.print( currentChar + " ");
                                currentChar++;
                        }
                        }
               currentNumber++;
	          currentChar++;
                        System.out.println();

                }
        }
}
