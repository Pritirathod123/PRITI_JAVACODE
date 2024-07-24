import java.util.Scanner;
class ArrayDemo3{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enteer the size of array:");
                int size = sc.nextInt();
                int[] array = new int[size];
                System.out.print("Enter the elements of the array:");
                for(int i = 0;i<size;i++){
                        array[i] = sc.nextInt();
               }

                        System.out.print("Enter the specific number:");
                        int specificNum = sc.nextInt();
                         int count = 0;
                         for(int i = 0; i<array.length;i++){
                                 if(array[i] == specificNum){
                                         count++;
                                        
                                 }
                         }
                                 System.out.println(" Number " + specificNum +  " occurred "  + count + " times in the array.");
                }
        }

