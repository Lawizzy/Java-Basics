package exercise_Chapter13;

public enum WeekDays {
	
	Sun("Sunday"),
	Mon("MOnday"),
	Tue("Tuesday"),
	Wed("Wednesday"),
	Thur("Thursday"),
	Fri("Friday"),
	Sat("Saturday");
	
	private final String value;
	
	WeekDays(String day){
		
		value = day;
	}
	
	public String value() {
		
		return value;
	}

}
