public class Manager extends Employee {
    //stores the manager's salary bonus
    private double bonus;
    
    public Manager(double InitializedBonus) {
        bonus = InitializedBonus;
    }
    //Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }
    
}
