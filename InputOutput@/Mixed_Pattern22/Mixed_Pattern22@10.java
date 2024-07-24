import java.util.Scanner;
class Mixed10{
        public static void main(String [] args ){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the no of rows: ");
                int rows = sc.nextInt();
                
                       for(int i = 1;i<=rows;i++){


                        for(int j = rows; j>=1;j--){
                                if(j<=i){

                                System.out.print(j+ " ");
                        }
                        else{


                                        System.out.print("  ");


                        }

                        }
                        for(int j = 2; j<=i;j++){
				System.out.print(j + " ");
			}

                        System.out.println();
                }
        }
}
