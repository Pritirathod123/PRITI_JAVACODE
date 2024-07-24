import java.util.Scanner;
class Scanner_Pattern2{
        public static void main (String [] args){
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter the number of rows");
                int rows = scanner.nextInt();
                char startChar = 'a';
                for(int i = 1; i<=rows; i++){
			
                        for(int j = 1; j<=i;j++){
				if(i%2==1){
					
                                System.out.print(startChar + " ");
				startChar++;
                        }
			else{
				System.out.print("$ ");
			}
			
			}
                        System.out.println();
			
                }
        }
}

