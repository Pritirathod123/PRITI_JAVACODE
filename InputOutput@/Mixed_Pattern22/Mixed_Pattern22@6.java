import java.util.Scanner;
class Mixed6{
        public static void main(String [] args ){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the no of rows: ");
                int rows = sc.nextInt();


                for(int i = 1;i<=rows;i++){
                        int num = 1;
                        for(int j = i ; j<=rows;j++){
                                System.out.print("  ");
                        }
                        for(int j = 1; j<i;j++){
                                        System.out.print(num++ + " ");

                        }

                        for(int j =1; j<=i;j++){
                                System.out.print(num++ + " ");



                        }
                        System.out.println();
                }
        }
}
