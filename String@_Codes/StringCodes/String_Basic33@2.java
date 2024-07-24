import java.util.Scanner;
class Demo2{
        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the string : ");
                String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		System.out.println(str1);
                System.out.println(str2);

		str1 = str1.concat(str2);
	       System.out.println("Length of the String :" + str1.length());	
        }
}
