import java.util.Scanner;
class Scanner_Pattern3{
        public static void main (String [] args){
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter the number of rows");
                int rows = scanner.nextInt();
                char startChar = 'C';
                for(int i = 1; i<=rows; i++){
			 char currentChar = startChar;
                        for(int j = 1; j<=i;j++){
                                System.out.print(currentChar + " ");
				currentChar--;
                        }
                        System.out.println();
                }
        }
}
