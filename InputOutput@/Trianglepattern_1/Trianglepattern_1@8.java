import java.util.Scanner;
class Scanner_Pattern8{
        public static void main (String [] args){
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter the number of rows");
                int rows = scanner.nextInt();
		char currentChar = 'c';
                for(int i = 0; i<rows; i++){
			int currentNumber = 1;
                //char currentChar = 'a';         
                for(int j = 0; j<=i;j++){
			if(j%2==0){
                             System.out.print(currentNumber++  + " ");
			     currentNumber+=1;

                        }
                        else{
                                System.out.print( currentChar + " ");
				currentChar+=2;
                        }
                        }
		currentNumber++;
                        System.out.println();
			
                }
        }
}
