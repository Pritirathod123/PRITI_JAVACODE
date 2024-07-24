class ArrDemo4{
	public static void main(String []args){
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = { 3,4,5};

		//iterating arr1
		for(int i = 0; i<arr1.length; i++){
			//iterating qrr2
			for(int  j = 0; j<arr2.length; j++){
				if(arr1[i] == arr2[j]){
					System.out.println(arr1[i]);
				}
			}
		}
	}
}

