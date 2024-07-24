import java.util.Scanner;
class TriangleDemo2{
        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
		
	//	System.out.print("Enter the stating number:");
	//	int startNum = sc.nextInt();
                        System.out.print("Enter the number of rows: ");
                        int rows = sc.nextInt();
                        int startNum = 2;
                        for(int i = 0;i<rows;i++){
                                for(int j = 1; j<=rows-i; j++){
                                       
						System.out.print(startNum  + " ");
					
                                startNum +=2;
				}
                                System.out.println();
				
                        }
                }
        }

