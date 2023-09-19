package EmployeeMangementSystem;

public class Employee {
    private int empno;
    private String name;
    private int salary;

    Employee(int empno , String name , int salary){
        this.empno = empno;
        this.name=name;
        this.salary=salary;
    }

    //getters

    public int getempno() {return empno;}
    public String getName(){return name;}
    public int getSalary(){return salary;}

    //setters

    public void setEmpno(int empno){this.empno=empno;}
    public void setSalary(int salary) {this.salary = salary;}
    public void setName(String name){this.name=name;}

    public  String toString(){
       return "Employee no : "+empno+"\nname : "+name+"\nsalary : "+salary;
    }
}
