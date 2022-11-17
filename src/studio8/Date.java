package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {
	private int day;
	private String month;
	private int year;
	private boolean isHoliday;
	
	
public Date (int day, String month, int year, boolean isHoliday) {
	this.day = day;
	this.month = month;
	this.year = year;
	this.isHoliday = isHoliday;
}
	
    public static void main(String[] args) {
    	Date shawnBday = new Date (8, "August",1998,false);
    	Date duplicateBday = new Date (8, "August",1998,false);
    	System.out.println(shawnBday);
    	Date myBday = new Date (3,"May", 2004, true);
    	Date xmas = new Date (25,"December", 2020, true);
    	Date allyBday = new Date (5,"June", 2003, false);
    	Date marcusBday = new Date (11,"March", 2004, false);
    	LinkedList<Date> list = new LinkedList<Date>();
    	list.add(shawnBday);
    	list.add(duplicateBday);
    	list.add(myBday);
    	list.add(marcusBday);
    	list.add(allyBday);
    	list.add(xmas);
    	System.out.println(list); //in order and prints
    	HashSet<Date> set = new HashSet<Date>();
    	set.add(duplicateBday);
    	set.add(marcusBday);
    	set.add(myBday);
    	set.add(allyBday);
    	set.add(shawnBday);
    	set.add(xmas);
    	System.out.println(set); //not in order doesnt print duplicates
//    	System.out.println(myDate.equals(firstDate)); 
//    	System.out.println(myDate == firstDate);
    }

	@Override
	public String toString() {
		return "["+ month + " " + day + ", " + year + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(day, isHoliday, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && isHoliday == other.isHoliday && Objects.equals(month, other.month)
				&& year == other.year;
	}

}
