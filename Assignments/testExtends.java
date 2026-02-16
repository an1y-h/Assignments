public class testExtends {

    public static void main(String[] args)
    {
        //Test the Employee class
        Employee EmpA = new Employee("A", 75000.0);
        System.out.println("Employee "+EmpA.getName()+" has a total salary of "+EmpA.getSalary());

        // Test the Manager class
        Manager managerJohn = new Manager(100000.0);
        managerJohn.setName("John");
        managerJohn.setBaseSalary(90000.0);
        System.out.println("Manager "+managerJohn.getName()+" has a total salary of "+managerJohn.getSalary());

        // Test the parttimeWorker class
        ParttimeWorker parttimeworkerJenny = new ParttimeWorker(15.0, 5.5);
        parttimeworkerJenny.setName("Jenny");
        System.out.println("Parttime worker "+parttimeworkerJenny.getName()+" has a total salary of "+parttimeworkerJenny.getSalary());
    }
}
