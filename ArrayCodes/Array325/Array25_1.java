class ArrayDemo1{
	public static void main(String[] args){
		int[] array = {10,20,30,40,50,60};
		for(int i = 0; i<array.length;i++){
			array[i] +=15;
		}
		for(int i= 0; i<array.length;i++){
			System.out.print(array[i] + " ");
		}
	}
}
