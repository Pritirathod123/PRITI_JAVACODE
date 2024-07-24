import java.util.Scanner;
class TriangleDemo1{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
			System.out.print("Enter the number of rows: ");
			int rows = sc.nextInt();

			for(int i = 0;i<rows;i++){
				for(iint j = i+1; j <= rows; j++){
					System.out.print(j + "  ");
				}
				System.out.println();
			}
		}
	}



