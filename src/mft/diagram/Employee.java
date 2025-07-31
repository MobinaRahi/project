package mft.diagram;

public class Employee {
    public double hoursWorked;
    private double hourlyWage;
    private double overTime;
    private String status;
    public int discount;
    public Employee() {
    }
    public Employee(double hoursWorked, double hourlyWage, double overTime) {
        this.hoursWorked = hoursWorked;
        this.hourlyWage = hourlyWage;
        this.overTime = overTime;
        this.status = status;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    public double getHourlyWage() {
        return hourlyWage;
    }
    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }
    public double getOverTime() {
        return overTime;
    }
    public void setOverTime(double overTime) {
        this.overTime = overTime;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public int getDiscount() {
        return discount;
    }
    public void setDiscount(int discount) {
        this.discount = discount;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "hoursWorked=" + hoursWorked +
                ", hourlyWage=" + hourlyWage +
                ", overTime=" + overTime +
                ", status='" + status + '\'' +
                ", discount=" + discount +
                '}';
    }
}
