import java.util.Scanner;
class Mixed2{
        public static void main(String [] args ){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the no of rows: ");
                int rows = sc.nextInt();

                int num = 1 ;
                for(int i = 1;i<=rows;i++){
                        for(int j = 1 ; j<=i;j++){
                                System.out.print("  ");
                        }
                        for(int j = i; j<=rows;j++){
                                        System.out.print(num++ + " ");
			}


                        
			num = num-1;
                        System.out.println();
                }
        }
}
