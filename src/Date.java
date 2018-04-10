public class Date {

    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay() {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth() {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear() {
        this.year = year;
    }

    public void checkData() {

        int day = getDay();
        int month = getMonth();
        int year = getYear();

        if (day > 31 || day < 1)
            System.out.println("Некорректная дата");
        else if (month > 12 || month < 1)
            System.out.println("Некорректная дата");
        else if (year > 9999 || year < 0)
            System.out.println("Некорректная дата");
        else {
            System.out.println(day + "-" + month + "-" + year);
        }
    }
}
