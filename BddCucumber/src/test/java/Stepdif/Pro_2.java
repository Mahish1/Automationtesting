package Stepdif;

public class Pro_2 {
	public static void main(String[] args) {
		String name = "Mahesh1233";
		String rev = "";
		String digt = "";
		for (char nam : name.toCharArray()) {
			if (Character.isLetter(nam)) {
				// System.out.println(nam);
				String st = Character.toString(nam);
				rev = st + rev;
			}
			if (Character.isDigit(nam)) {
				digt = digt + nam;
			}

		}
		System.out.println(rev + digt);

		String namee = "Mahesh";
		String ros = "";

		for (char rr : namee.toCharArray()) {

			ros = rr + ros;
		}
		System.out.println(ros);
		
		int number=345;
		int reverse = 0;
		while (number>0){
			 int digit=number%10;
			reverse=reverse*10+digit;
			number=number/10;
		}
		System.out.println(reverse);


	}
}
