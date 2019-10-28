package EncapsulationTest;

public class Class01 {

    private String Company = "RaySono";
    private int id = 123456;
    public String job = "Backend Developing";
    private long salary = (long) 120500;
    int ght = 45545;

    public String getCompany() {
        return Company;
    }

    public void setCompany(String company) {

        this.Company = company;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getSalary() {
        return salary;

    }

    public void setSalary(long salary) {
        this.salary = salary;

    }

}
