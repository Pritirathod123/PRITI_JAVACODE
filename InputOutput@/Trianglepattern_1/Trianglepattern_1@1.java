import java.util.Scanner;
class Scanner_Pattern1{
	public static void main (String [] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of rows");
		int rows = scanner.nextInt();
		int startNum = 9;
		for(int i = 1; i<=rows; i++){
			for(int j = 1; j<=i;j++){
				System.out.print(startNum + " ");
			}
			System.out.println();
		}
	}
}
