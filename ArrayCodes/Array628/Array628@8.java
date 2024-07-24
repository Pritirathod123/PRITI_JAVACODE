import java.util.Arrays;
class ArrDemo8{
	public static void main (String [] args){
		int[] arr = {5,1,2,3,4};
		int start = 0;
		int last = arr.length-1;
		int temp;
		while(start<last){

			temp = arr[start];

			arr[start] =arr[last];

			arr[last] = temp;

			start++;
			last--;
		}
		System.out.println(Arrays.toString(arr));
	}
}
