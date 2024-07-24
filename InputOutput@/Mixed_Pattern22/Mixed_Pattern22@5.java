import java.util.Scanner;
class Mixed5{
        public static void main(String [] args ){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the no of rows: ");
                int rows = sc.nextInt();

                int temp = rows;
                for(int i = 1;i<=rows;i++){
                        
                                                     
                        for(int j = 1; j<=rows;j++){
				if(i%2==1){
                                        System.out.print(temp * temp + " ");

				}
				else{
					System.out.print(temp + "  ") ;


                        }
			temp++;
			}
                        System.out.println();
                }
        }
}
