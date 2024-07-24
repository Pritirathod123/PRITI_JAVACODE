import java.util.Scanner;
class Scanner_Pattern5{
        public static void main (String [] args){
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter the number of rows");
                int rows = scanner.nextInt();
                char currentChar = 'E';
		//count = 0;
                for(int i = 0; i<rows; i++){
                         
                        for(int j = 0; j<=i;j++){
                                System.out.print(currentChar++  + " ");
                                
                        }
                        System.out.println();
                }
        }
}
