package MAin_methods;

import java.util.Random;

public class grnerate_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("This app prints out a random phone number.");
	        System.out.println("The first set of 3 digits can't have 8 or 9 in them.");
	        System.out.println("The second set of 3 digits can't be greater than 742.");
	         
	        Random generator = new Random();
	         
	        String strippedNum;
	        String str1;
	        String str2;
	        String str3;
	        int num1 = 0;
	        int num2 = 0;
	        int num3 = 0;
	        String s="9";
	         
	        //num1 = generator.nextInt(600) + 100;//numbers can't include an 8 or 9, can't go below 100.
	        //num2 = generator.nextInt(641) + 100;//number has to be less than 742//can't go below 100.
	        //num3 = generator.nextInt(8999) + 1000; // make numbers 0 through 9 for each digit.//can't go below 1000.
	         num1=generator.nextInt(600) + 100;
	         num2=generator.nextInt(600) + 100;
	         num3=generator.nextInt(600) + 100;
	      //   String string1 = Integer.toString(num1);
	         strippedNum = Integer.toOctalString(num1);
	         str1=Integer.toString(num3);
	         str2=Integer.toString(num2);
	         str3=s+str2+str1+strippedNum;
	         
	          
	        System.out.println("Here is a random generated phone number: " + str3 +"-"+ strippedNum + "-" + num2 + "-" + num3+"-"+num1);
	}

}
