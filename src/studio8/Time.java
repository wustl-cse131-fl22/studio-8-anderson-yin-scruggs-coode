package studio8;

import java.util.Objects;

public class Time {
	private int hour;
	private int minute;
	private boolean is12HourClock;
	

	public Time (int minute, int hour, boolean is12HourClock) {
		this.minute = minute;
		this.hour = hour;
		this.is12HourClock = is12HourClock;
	}
	@Override
	public int hashCode() {
		return Objects.hash(hour, is12HourClock, minute);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && is12HourClock == other.is12HourClock && minute == other.minute;
	}
	public static void main(String[] args) {
		Time lunch = new Time (30, 12, false);
    	
    }
	@Override
	public String toString() {
		return "["+ hour + ":"+ minute + "]";
	}

}