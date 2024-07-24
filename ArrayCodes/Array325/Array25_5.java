import java.util.Scanner;
class ArrayDemo5{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enteer the size of array:");
                int size = sc.nextInt();
                int[] array = new int[size];
                System.out.print("Enter the elements of the array:");
                for(int i = 0;i<size;i++){
                        array[i] = sc.nextInt();
               }


                         for(int i = 0; i<array.length;i++){
                                 if(array[i]< 0){
                                         array[i] *= array[i];
				 }
                                 }
                        
                        System.out.println("Update array:");
                        for(int i = 0 ; i<array.length; i++){
                                System.out.print(array[i] + " ");

                }
        }
}
