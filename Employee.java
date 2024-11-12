public class Employee {
    private String name;
    private String department;
    private int salary;

    public Employee(String name,String department,int salary)
    {
        this.name = name;
        this.department=department;
        this.salary=salary;
    }
    public void ShowInfos()
    {
        System.out.println("Infos: \n");
        System.out.println("name= "+this.name);
        System.out.println("departmant = "+this.department);
        System.out.printf("salary = %d\n", this.salary);
    }
    public String getName()
    {
        return this.name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getDepartment()
    {
        return this.department;
    }
    public void setDepartment(String department)
    {
        this.department = department;
    }
    public int getSalary()
    {
        return this.salary;
    }
    public void setSalary(int salary)
    {
        this.salary = salary;
    }

}

public class Manager extends Employee {
    private int num_of_employees;

    public Manager(String name, String department, int salary, int num_of_employees) {
        super(name, department, salary);
        this.num_of_employees = num_of_employees;
    }

    public void raiseSalary(int amount) {
        System.out.printf("raised the salary of employees %d dollar", amount);
    }

    @Override
    public void ShowInfos() {
        super.ShowInfos();
        System.out.printf("Number of employees: %d", num_of_employees);
    }

/*
    @Override
    public void ShowInfos()
    {
        System.out.println("Infos: \n");
        System.out.println("name= "+getName());
        System.out.println("departmant = "+getDepartment());
        System.out.printf("salary = %d\n", getSalary());
        System.out.printf("num_of_employees= %d\n",this.num_of_employees);
    }
    */

    @Override
    public String toString() {
        return "Manager object";

    }
}

public class Main{
    public static void main(String[] args)
    {
        Employee emp1 = new Employee("Mustafa","Software dev",30000);

        Manager manager1 = new Manager("tuana","ceo",100000,15);
       /* manager1.ShowInfos();
        manager1.raiseSalary(100);
*/
        Employee employee = new Manager("murat","frontend",20000,12);
        //manager "is a" employee  ->polymorphism
        employee.ShowInfos();


        //System.out.println(manager1.toString());
    }

}
