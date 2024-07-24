class ArrDemo5{
	public static void main(String [] args){
		int[] arr1 = {10 ,20,30};
		int[] arr2 = {40,50,60,70,80};

		int arr1_leng = arr1.length;
		int arr2_leng = arr2.length;
		int arr3_leng = arr1_leng + arr2_leng;
		 int[] arr3 = new int[arr3_leng];
		 for(int i = 0; i<arr1_leng; i++){
			 arr3[i] = arr1[i];
		 }
		 for(int i = 0; i<arr2_leng; i++){
			 arr3[arr1_leng+i] = arr2[i];
		 }
		 for(int i = 0; i<arr3_leng;i++){
			 System.out.print(arr3[i] + " ");
		 }
	}
}

