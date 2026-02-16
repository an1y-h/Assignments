public class ParttimeWorker extends Employee {
    private double hours;
    private double hourlyPay;

    //initialize hours & hourlypay
    public ParttimeWorker(double InitializeHours, double InitializeHourPay){
        hours = InitializeHours;
        hourlyPay = InitializeHourPay;
    }
    
    //override getSalary  - hours * hourlypay
    public double getSalary() {
        return hours * hourlyPay;
    }
}
