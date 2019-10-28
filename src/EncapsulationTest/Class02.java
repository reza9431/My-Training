package EncapsulationTest;

public class Class02 {

    public static void main(String[] args) {
        System.out.println("Repotr of Job Information");

        Class01 jobinfo = new Class01();

        int id = jobinfo.getId();
        String companyname = jobinfo.getCompany();
        String position = jobinfo.job;
        long salary = jobinfo.getSalary();
        int xx = jobinfo.ght;

        System.out.println("I work in " + companyname);
        System.out.println("My Id num is : " + id);
        System.out.println("I am in the " + position + "field");
        System.out.println("My Yearly Salary is :" + salary + " €");
        System.out.println("Idon't know what is this digit : " + xx + " LooooooL");




    }
}
