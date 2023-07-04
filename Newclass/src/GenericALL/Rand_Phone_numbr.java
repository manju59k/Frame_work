package GenericALL;

import java.util.Random;

public class Rand_Phone_numbr {
public static String rand_phnnumber() {
	
	 Random generator = new Random();
     
     int num1 = 0;
     int num2 = 0;
     int num3 = 0;
     String s="9";
     num1=generator.nextInt(600) + 100;
     num2=generator.nextInt(600) + 100;
     num3=generator.nextInt(600) + 100;
     String strippedNum = Integer.toOctalString(num1);
     String str1=Integer.toString(num3);
     String str2=Integer.toString(num2);
     String str3=s+str2+str1+strippedNum;
	return str3;
	
}
}
