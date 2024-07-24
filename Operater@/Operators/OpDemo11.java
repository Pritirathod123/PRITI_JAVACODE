class OpDemo11{
	public static void main(String[] args){
		
        // Arithmetic operators
        int a = 10;
        int b = 5;
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;

        System.out.println("Sum: "  sum);
        System.out.println("Difference: "  difference);
        System.out.println("Product: " product);
        System.out.println("Quotient: "  quotient);
        System.out.println("Remainder: "  remainder);

        // Relational operators
        boolean isEqual = (a == b);
        boolean isNotEqual = (a != b);
        boolean isGreater = (a > b);
        boolean isLesser = (a < b);
        boolean isGreaterOrEqual = (a >= b);
        boolean isLesserOrEqual = (a <= b);

        System.out.println("Is equal: "  isEqual);
        System.out.println("Is not equal: "  isNotEqual);
        System.out.println("Is greater: "  isGreater);
        System.out.println("Is lesser: "  isLesser);
        System.out.println("Is greater or equal: "  isGreaterOrEqual);
        System.out.println("Is lesser or equal: "  isLesserOrEqual);

        // Logical operators
        boolean x = true;
        boolean y = false;
        boolean andResult = x && y;
        boolean orResult = x || y;
        boolean notResult = !x;

        System.out.println("AND Result: "  andResult);
        System.out.println("OR Result: "  orResult);
        System.out.println("NOT Result: "  notResult);

        // Unary operators
        int num = 10;
        num++; // Increment by 1
        System.out.println("After increment: "  num);

        num--; // Decrement by 1
        System.out.println("After decrement: "  num);

        // Assignment operators
        int c = 20;
        c += 5; // c = c + 5
        System.out.println("After += operator: "  c);

        c -= 3; // c = c - 3
        System.out.println("After -= operator: " c);

        c *= 2; // c = c * 2
        System.out.println("After *= operator: "  c);

        c /= 4; // c = c / 4
        System.out.println("After /= operator: "  c);

        c %= 3; // c = c % 3
        System.out.println("After %= operator: "  c);
    }
}

