import java.util.Scanner;
class Arr3{
        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the size of the array :");
                int size = sc.nextInt();
               
                System.out.println("Enter the elements of the array:");
		int[] arr = new int [size];
                  for(int i = 0; i<size;i++){

			  arr[i]= sc.nextInt();
		}
		boolean check = true;
		for(int i =0 ; i<size/2;i++){
		if(arr[i]!=arr[size-1-i]){
			check = false;
			break;
		}
		}

                if(check){
				System.out.println("The given array is  palindrom array.");
				
		}
		else{
				System.out.println("The given array is not palindrom array.");
			}
			
			
		}
	}

