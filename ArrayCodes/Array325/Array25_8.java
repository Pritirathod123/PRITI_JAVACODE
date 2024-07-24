import java.util.Scanner;
class ArrayDemo8{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enteer the size of array:");
                int size = sc.nextInt();
                int[] array = new int[size];
                System.out.print("Enter the elements of the array:");
                for(int i = 0;i<size;i++){
                        array[i] = sc.nextInt();
               }
               System.out.println("Composite numbers:");


                         for(int num : array){
                                 if(isComposite(num)){
                                         System.out.print(num + " ");
                                 }


                                 }
        }
        public static boolean isComposite(int num){
                if(num<=1){
                        return false;
                }

                        for(int i = 2 ; i <= Math.sqrt(num); i++){
                                if(num%i == 0){
                                return true;
                        }
                }
                return false;

                }
        }

    
