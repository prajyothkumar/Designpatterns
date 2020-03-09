package prototype;



public class SessionTime {

    private DateTime dateTime;

    public SessionTime(int year, int monthOfYear, int dayOfMonth, int hourOfDay, int minuteOfHour) {
        this.dateTime = new DateTime(year, monthOfYear, dayOfMonth, hourOfDay, minuteOfHour);
    }

    public DateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(int year, int monthOfYear, int dayOfMonth, int hourOfDay, int minuteOfHour) {
        this.dateTime = new DateTime(year, monthOfYear, dayOfMonth, hourOfDay, minuteOfHour);
    }
}