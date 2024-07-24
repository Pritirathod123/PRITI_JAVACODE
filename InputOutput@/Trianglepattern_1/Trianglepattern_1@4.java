import java.util.Scanner;
class Scanner_Pattern4{
        public static void main (String [] args){
                Scanner sc = new Scanner(System.in);
               System.out.print("Enter the number of rows");
                int rows = sc.nextInt();
                
                for(int i = 0; i<rows; i++){
                        char ch = 'd';
		       char cha = 'D';	
                        for(int j = 0; j<=i;j++){
				if(i%2==0){

                                System.out.print(ch + " ");
				ch--;
				}
				else{
					System.out.print(cha + " ");
					cha--;
				}
                                
                        }
                        System.out.println();
                }
        }
}
