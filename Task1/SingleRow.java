package Task1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class SingleRow {
    Date startDateTime;
    String surname;
    String name;
    String description;
    private int priority;
    Date deadline;

    public Date getStartDateTime() {
        return startDateTime;
    }
    public String getSurname() {
        return surname;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public int getPriority() {
        return priority;
    }
    public Date getDeadline() {
        return deadline;
    }
    
    public void setStartDateTime(Date startDateTime) {
        this.startDateTime = startDateTime;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setPriority(int priority) {
        this.priority = priority;
    }
    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public void createDeadline(){
        Calendar deadline = new GregorianCalendar();
        System.out.println("¬ведите дату выполнени€ задачи");
        Scanner input = new Scanner(System.in);
        System.out.println("¬ведите число:");
        int day = input.nextInt();
        System.out.println("¬ведите число мес€ца от 1 до 12):");
        int month = input.nextInt();
        System.out.println("¬ведите год (в формате YYYY):");
        int year = input.nextInt();
        deadline.set(year,month-1,day);
        setDeadline(deadline.getTime());
    }
    
}
