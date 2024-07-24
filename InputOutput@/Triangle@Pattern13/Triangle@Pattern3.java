
import java.util.Scanner;
class TriangleDemo4{
          public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                        System.out.print("Enter the number of rows: ");
                        int rows = sc.nextInt();


                        for(int i = 2;i<=rows;i++){
                                for(int j = rows; j >= i; j--){
                                        System.out.print(j+ " " );
                                }
                                System.out.println();
                        }
                }
        }
