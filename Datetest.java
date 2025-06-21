
public class Datetest {

	public static void main(String[] args) {
	Date date=new Date(01,04,2025);
	System.out.println("Original Date");
	date.displayDate();
	date.setMonth(01);
	date.setDay(04);
    date.setYear(2025);
	System.out.println("\nupdated Date:");
	System.out.println(date.getMonth() + "/" + date.getDay() + "/" + date.getYear());
	System.out.println("\n Updated Date Using displyDate method:");
	date.displayDate();
	
	}

}
class Date{
	private int month;
	private int day;
	private int year;
	
	public Date(int month,int day,int year)
	{
		this.month=month;
		this.day=day;
		this.year=year;
	}

	
//setter
	public void setDay(int day) {
	    this.day=day;
		}
	public void setMonth(int month) {
	    this.month=month;
		}
	public void setYear(int year) {
	    this.year=year;
		}
	 
	//getter
	public int getMonth() {
		 return this.month;
	 }
	public int getDay()
	{
		return this.day;
	}
	public int getYear()
	{
		return this.year;
	}
	public void displayDate() {
		System.out.println(month+"/"+day+"/"+year);
	}
}


