public class Employee {
    private String name;  
    private double baseSalary;

    public Employee(){

    }
    
    public Employee(String InitializedName, double InitializedSalary) {
        name = InitializedName;
        baseSalary = InitializedSalary;
    }

    public void setName(String newName) {
        name = newName;
    }
    public void setBaseSalary(double newSalary) {
        baseSalary = newSalary;
    }

    public String getName() {
        return name;
    }
    public double getSalary() {
        return baseSalary;
    }
}

