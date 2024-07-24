import java.util.Scanner;
class ArrayDemo6{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enteer the size of array:");
                int size = sc.nextInt();
                char[] array = new char[size];
                System.out.println("Enter the character of the array:");
                for(int i = 0;i<size;i++){
                         array[i] = sc.next().charAt(0);
               }
                        System.out.println("Consonants:");

                         for(int i = 0; i<size;i++){
				
				 if(array[i] !='a' && array[i] !='e' && array[i] != 'i' && array[i] != 'o' && array[i]!= 'u'){
                                 System.out.println(array[i]);
				 }

					}

                                       

        }
}
