class Switch3{
	public static void main(String [] args){
		String inputSize = "XL";
		String fullForm = " ";
		switch (inputSize){
			case "S":
				fullForm = "Small";
				break;
			case "M":
				fullForm = "Medium";
				break;
			case "L":
				fullForm = "Large";
				break;
			case "XL":
				fullForm = "Extra Large";
				break;
			case "XXL":
				fullForm = "Double Extra Large";
				break;
			default:
				fullForm = "Size not found!";
		}
		System.out.println("Input:" +inputSize);
		System.out.println("Output:" +fullForm);
	}
}

