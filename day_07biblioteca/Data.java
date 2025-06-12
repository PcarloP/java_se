package day_07bibbioteca;

public class Data {

	private int day;
	private int month;
	private int year;

	public Data() {
		super();
	}

	public Data(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Date [day=" + this.day + ", Month=" + this.month + ", Year=" + this.year + "]";
	}
    //metodo per confrontare oggetti data
	public boolean isEqual(Data other) {
		return this.day == other.getDay() && this.month == other.getMonth() && this.year == other.getYear();
	}
    //metodo per passare al giorno successivo
	public void nextDay() {
		
		int[] giorniNelMese = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		day++; 

		if (day > giorniNelMese[month - 1]) {
			day = 1;
			month++;
			if (month > 12) {
				month = 1;
				year++;
			}
		}
	}

}
