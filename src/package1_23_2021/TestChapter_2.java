package package1_23_2021;
//Do the following:
//1- copy and run the code.
//2- Read from page 96 throught page 139
//3- Do the test in page 139 and send it to me. Wed.
//4- do the extra labs 1 through 5. Wed. 
//Mon. revise Ali code.
//Tues. Revise the labs and help others.
//Thur. Exam revision.

public class TestChapter_2 {
	//variables in java are two, 1- primitives, 2- none-primitives
	//primitives are:- byte(8), short(16), int(32), long(64)
	//float (32), double (64)
	//char, boolean
	public static void main(String[] args) {
		byte 	bNum;
		short 	sNum;
		int  	iNum;
		long    lNum;
		float   fNum;
		double  dNum;
		
		fNum = 12.12f; //all decimal values are by default double size.
						//cast f, F, float :- 12.12F, 12.12f, (float)12.12
		dNum = 20.21;

		bNum = 120;	//120 by default is int size
		sNum = 140; 
		iNum = 130;  //all integer values(numbers) are by default int size.
		lNum = 150;
		
		System.out.println("bNum " + bNum);
		double dNum2;
		
		//right hand side:- 
		//1- if there is a double, all vaules are permoted to double.
		//2- if there is float all converted to float.
		//3- if there is long all converted to long.	
		//4- all converted to int.			
		dNum = bNum + sNum + iNum + lNum + fNum + dNum;	
		fNum = bNum + sNum + iNum + lNum + fNum;	
		lNum = bNum + sNum + iNum + lNum ;	
		iNum = bNum + sNum + iNum ;			
		iNum = bNum + sNum ;		
		sNum = (short)(bNum + sNum) ;	
		System.out.println("dNum " + dNum);		
		//************* second copy ***************
		int y = 4; 
		double x = 3 + 2 * y;
		System.out.println(x);
		System.out.println(y);
		int num2 = 10;
		int num3 = 0;
		num3 = num2++; //assign to num2 to num3 first, then increment num2;
		System.out.println("******************");
		System.out.println(num2 +" "+num3);
		num3 = ++num2; //Increment num2 then assign num3 to num2;
		System.out.println(num2 +" "+num3);	
		//System.out.println(++num2);
		int y2 = 4; 
		double x2 = 8 * 4 + --y2;  //20  //35
		System.out.println(x2);
		System.out.println(y2);
		num2 = 100;
		num3 = 10;
		System.out.println(num2 % num3);
		
		if (!(num2 == 100) ) {
			System.out.println( num2 + " is more than or equale to " + 100);
		}//
		else {
			System.out.println( num2 + " is not more than or equale to " + 100);
		}
		System.out.println("*********************");
		if ( (num2 == 101) || (++num3 == 10) ) { // || means or
			System.out.println("It is correct");
			System.out.println(num3);
		}//if
		else {
			System.out.println("It is not correct");
			System.out.println(num3);
		}//else
		System.out.println("---------------------");
		num2 = 100;
		num3 = 10;
		if ( (num2 == 100) && (++num3 == 10) ) { // || means or
			System.out.println("It is correct");
			System.out.println(num3);
		}//if
		else {
			System.out.println("It is not correct");
			System.out.println(num3);
		}//else
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		num2 = 100;
		num3 = 10;
		if ( (num2 == 100) | (++num3 == 10) ) { // || means or
			System.out.println("It is correct");
			System.out.println("num3 = "+num3);
		}//if
		else {
			System.out.println("It is not correct");
			System.out.println("num3 = "+num3);
		}//else
		System.out.println("+++++++++++++++++++++++++++++");

		num2 = 100;
		num3 = 10;
		if ( (num2 >= 99) & (++num3 == 10) ) { // || means or
			System.out.println("It is correct");
			System.out.println("num3 = "+num3);
		}//if
		else {
			System.out.println("It is not correct");
			System.out.println("num3 = "+num3);
		}//else

		num2 = 100;
		
		
		num3 = 10;
		
		num2 += 20; // same as num2 = num2 + 20;  num2 = 120
		num3 *= 20; // same as num2 = num2 * 20;  num3 = 200
		
		int num4 = 0;
		//Ternary Operator 
		num4 = num2 > num3 ? 1000 : 2000;
		System.out.println(num4);
		if (num2 > num3) {
			System.out.println(1000);
		} else {
			System.out.println(2000);
		}
		
		if (( 20 > 11) ^ (10 < 11)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");

		}
		String value = "Omar"; //value, could be byte, short, int, char, String, enum.
		//break gets you out of the recent block
		switch (value) { // 
			case "Osman":
				System.out.println("It is Two");
				break;
			case "aaa":
				System.out.println("It is Three");
				//break;
			case "Omar":
				System.out.println("It is one");
				break;
			default:
				System.out.println("It is default");
				//break;
		}//switch
		//the code starts here.
		int num5 = 0;
		while (true) {
			num5++;
			if (num5 == 10) {
				break;
			}//if
			if ( (num5 == 5) || (num5 == 3) ) {
				continue;
			}//if
			System.out.println(num5);
			//break;
		}//while
		System.out.println("After the while loop");
		num5 = 0;
		do {
		
			System.out.println(num5);
			num5++;
		} while (num5 < 0);
		System.out.println("------------------");
		for (int i = 0; i < 3; i++) {
			System.out.println(i);
		}//for
		
		int j = 0;
		for ( ; ; ) {

			if (j < 5 ) {
				System.out.println(j);
			}//if	
			else {
				
			}//else
			j++;
		}//for
		
		int nums[];
		nums = new int [4];
		nums[0] = 100;
		nums[1] = 10;
		nums[2] = 25;
		nums[3] = 30;
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println("The value at location " + i + " = " + nums[i]);
		}//
		System.out.println("&&&&&&&&&&&&&&&&&&&&&");
		for (int result : nums) {
			System.out.println("The value is " + result );
		}//foreach
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%");	
		myLabel:
		for (int i = 0; i < 3; i++) {
			
			for (int k = 0; k < 3; k++) {
				if (k == 1) {
					break myLabel;
				}//if
				System.out.println("i = " + i + " " + "k = " + k); 
			}//for-inner
		}//for-outer
		System.out.println("After myLabel");
	}//main

}//class
