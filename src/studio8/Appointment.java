package studio8;

import java.util.Objects;

public class Appointment {
	private Date date;
	private Time time;
	
	
	@Override
	public int hashCode() {
		return Objects.hash(date, time);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(date, other.date) && Objects.equals(time, other.time);
	}
	public Appointment(Date date, Time time) {
		this.date = date;
		this.time = time;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date appDate = new Date (26, "May", 2004, false);
		Time appTime = new Time (30, 5, false);
		Appointment newApp = new Appointment (appDate, appTime);
		Date dentistDate = new Date (27, "June", 2022, false);
		Time dentistTime = new Time (30, 12, false);
		Appointment dentist = new Appointment (dentistDate, dentistTime);
		System.out.println(dentist);
	}
	@Override
	public String toString() {
		return "Appointment ["+ date + " at " + time + "]";
	}

}
