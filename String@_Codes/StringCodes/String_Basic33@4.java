import java.util.Scanner;
class Demo4{
        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the string : ");
                String str1 = sc.nextLine();
                String str2 = sc.nextLine();

                System.out.println(str1);
                System.out.println(str2);

                
               System.out.println("Difference:" + str1.compareTo(str2));
        }
}
