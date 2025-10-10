package practiceCode;

enum Day {
	MONDAY, TUESDAY, WEDNESDAY, THRUSDAY, FRIDAY, SATURDAY, SUNDAY;
}

public class EnumsPractice {

// can also declare inside the clalse
	// enum Day{
	// MONDAY,TUESDAY,WEDNESDAY,THRUSDAY,FRIDAY,SATURDAY,SUNDAY;
	// }

	public static void main(String[] args) {
		Day today = Day.MONDAY;
		System.out.println(today);

		switch (today) {
		case TUESDAY: {

		}
		case MONDAY: {
			System.out.println("today is " + today);
			break;
		}
		case WEDNESDAY: {
			System.out.println("today is " + today);
			break;
		}
		case THRUSDAY: {
			System.out.println("today is " + today);
			break;
		}
		case FRIDAY: {
			System.out.println("today is " + today);
			break;
		}
		case SATURDAY: {
			System.out.println("today is " + today);
			break;
		}
		case SUNDAY: {
			System.out.println("today is " + today);
			break;
		}

		}
	}
}
