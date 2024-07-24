import java.util.Scanner;
class Mixed8{
        public static void main(String [] args ){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the no of rows: ");
                int rows = sc.nextInt();
               int num = 0;

                for(int i = rows;i>=1;i--){

                        for(int j = 1 ; j<=rows+num;j++){
				if(j>=i){

                                System.out.print(j+ " ");
                        }
			else{


                                        System.out.print(" i ");


                        }

                        }
			num++;

                        System.out.println();
                }
        }
}

