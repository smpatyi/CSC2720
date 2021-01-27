import java.util.Scanner;
public class LeapYear {
  public static void main(String[] args){

	System.out.println("Enter a calendar year.");

	Scanner input = new Scanner(System.in);
	int year = input.nextInt();

	//call isLeapYear method to check whether user-inputted year is a leap year or not
	isLeapYear(year);

	input.close();
  }

  static void isLeapYear(int year) {

	Boolean b1 = true;
	Boolean b2 = false;

	if (year % 400 == 0) {
	  b1 = true;
	}

	else if ((year % 100) != 0 && (year % 4) == 0){
	  b1 = true;
	}

	else {
	  b2 = true;
	}
	  

	if (b1.equals(b2)) {
	  System.out.println("false");
	}
	else {
	  System.out.println("true");
	}
  }
}