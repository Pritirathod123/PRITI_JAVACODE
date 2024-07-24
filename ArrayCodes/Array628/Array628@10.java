class ArrDemo10{
	public static void main(String [] args){
		int a[] = {56,15,8,26,7,50,55};
		
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		int third = Integer.MIN_VALUE;

		for(int i = 0; i<a.length; i++){
			if(a[i]>first){
				third = second;
				second = first;
				first = a[i];
			}
			else if(a[i]>second){
				third = second;
				second = a[i];
			}else if(a[i]>third){
				third = a[i];
			}
		}
		System.out.println("Third largest = " + third);
	}
}


