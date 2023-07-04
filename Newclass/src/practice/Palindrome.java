package practice;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String value="manju";
String rev="";
for(int i=value.length()-1;i<=0;i++) {
	rev=rev+value.charAt(i);
}
if(value==rev) {
	System.out.println("String is palindrome");;
}
else
	System.out.println("not palindrome");
	}

}
