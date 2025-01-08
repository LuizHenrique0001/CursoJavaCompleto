package Entities;

public class Emplyoee {

    private Integer Id;
    private String Name;
    private Double Salary;

    public Emplyoee(Integer id, String name, Double salary) {
        Id = id;
        Name = name;
        Salary = salary;
    }

    public Double getSalary() {
        return Salary;
    }

    public void setSalary(Double salary) {
        Salary = salary;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public void salaryIncrease(Double percentage)
    {
        Salary +=  percentage * Salary / 100.0;
    }

    @Override
    public String toString() {
        return getId() +", "+ getName() +", "+ getSalary() +"\n";
    }
}
