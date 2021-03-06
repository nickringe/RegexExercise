import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		String allCaps = "ALLCAPS";
//		String notAllCaps = "notALLCAPS";
//		String hasAnumber = "This has 1 number in it.";
		String allCapsRegex =  "[A-Z\\s]+";
		String hasAnumberRegex = ".*[0-9].*";
		String phoneNumberRegex = "\\(\\d{3}\\)\\d{3}-\\d{4}";
//		String phoneNumber = "(734)475-8015";
		String ddMMyyyyRegex = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
//		String ddMMyyyy = "03/04/2022";
//		
//		System.out.println(isValid(allCaps, allCapsRegex));
//		System.out.println(isValid(notAllCaps, allCapsRegex));
//		System.out.println(isValid(hasAnumber, hasAnumberRegex));
//		System.out.println(isValid(notAllCaps, hasAnumberRegex));
//		System.out.println(isValid(phoneNumber, phoneNumberRegex));
//		System.out.println(isValid(hasAnumber, phoneNumberRegex));
//		System.out.println(isValid(ddMMyyyy, ddMMyyyyRegex));
		
		boolean noCaps = true;
		boolean noNums = true;
		boolean noPhone = true;
		boolean noDate = true;
		
		System.out.println("Welcome to the Regex Validation App!");
		Scanner scnr = new Scanner(System.in);
		
		while (noCaps == true) {
		System.out.println("Please enter a String that contains ALL CAPS ONLY:");
		String userCaps = scnr.nextLine();
			if (isValid(userCaps, allCapsRegex) == true) {
				noCaps = false;
				break;
			} else {
				System.out.println("That string was not in ALL CAPS!");
				noCaps = true;
			}
		}
		
		while (noNums == true) {
		System.out.println("Next, please enter a String with at least 1 number in it:");
		String userNums = scnr.nextLine();
			if (isValid(userNums, hasAnumberRegex) == true) {
				noNums = false;
				break;
			} else {
				System.out.println("That string did not contain at least 1 number.");
				noNums = true;
			}
		}
		
		while (noPhone == true) {
			System.out.println("Next, please enter a phone number in this format (XXX)XXX-XXXX :");
			String userPhone = scnr.nextLine();
				if (isValid(userPhone, phoneNumberRegex) == true) {
					noNums = false;
					break;
				} else {
					System.out.println("That was not a valid phone number.");
					noNums = true;
				}
			}
		
		while (noDate == true) {
			System.out.println("Next, please enter a date in this format dd/mm/yyyy :");
			String userDate = scnr.nextLine();
				if (isValid(userDate, ddMMyyyyRegex) == true) {
					noDate = false;
					break;
				} else {
					System.out.println("That was not a valid date. Check to make sure it is DD/MM/YYYY");
					noDate = true;
				}
			}
		
		scnr.close();
		System.out.println("Thanks for playing!");
		

	}
	
	public static boolean isValid(String data, String regex) {
		return data.matches(regex);
	}

}
