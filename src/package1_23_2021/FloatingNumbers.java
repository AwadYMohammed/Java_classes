package package1_23_2021;

public class FloatingNumbers {

	public static void main(String[] args) {
//		binary, octal, and hex literals
//		suffix f or F
//		suffix d or D
//		double vs. float
		System.out.println("1.0 / 3.0 is " + 1.0 / 3.0);
//		displays 1.0 / 3.0 is 0.3333333333333333
//		 16 digits
		System.out.println("1.0F / 3.0F is " + 1.0F / 3.0F);
		
//		displays 1.0F / 3.0F is 0.33333334
//		8 digits
//		number literal. For example, the following literals are correct.
		long ssn = 232_45_4519;
		long creditCardNumber = 2324_4545_4519_3415L;
//		However, 45_ or _45 is incorrect. The underscore must be placed between two digits

	}

}
