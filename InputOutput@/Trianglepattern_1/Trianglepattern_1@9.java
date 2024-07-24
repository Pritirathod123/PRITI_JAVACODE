import java.util.Scanner;
class Scanner_Pattern9{
        public static void main (String [] args){
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter the number of rows");
                int rows = scanner.nextInt();
                char currentChar = 'a';
                for(int i = 0; i<rows; i++){
                        int currentNumber = rows;
                //char currentChar = 'a';
                for(int j = 0; j<=i;j++){
                        if(j%2==1){
                             System.out.print(currentNumber  + " ");
                             currentNumber+=2;

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
