package entities;

public class Employee {

    private final Integer id;
    private final String name;
    private Double salary;


    public Employee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void increaseSalary(double percentage) {
        salary += salary * percentage / 100.0;
    }


    @Override
    public String toString() {
        return "Funcionário{" +
                "id:" + id +
                ", nome:'" + name + '\'' +
                ", salário:" + salary +
                '}';
    }
}