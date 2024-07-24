import java.util.Scanner;
class Demo10{
        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the string : ");
                String str1 = sc.nextLine();
                 int ln = str1.length();
		  int count= 0;
		 while(ln>0){
			 count++;
			 ln--;
		 
		 if(count == 0){

                System.out.println();
		 }
		 else{
                System.out.println(str1 + (count-1));
        }
	}
}
}
