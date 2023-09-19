package EmployeeMangementSystem;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> list=new ArrayList<Employee>();
        Scanner in =new Scanner(System.in);
         while (true){
             System.out.println("Enter the options : 1.Insert 2.Display 3.Search 4.Delete 5.Update 6.Exit");
             int choice= in.nextInt();
             switch (choice){
                 case 1 ->{
                     System.out.println("Enter the employee id :");
                     int id=in.nextInt();
                     boolean found =false;
                     while(!found) {
                         for (Employee employee : list) {
                             if (id == employee.getempno()) {
                                 found=true;
                                 break;
                             }
                         }
                         if(found){
                             System.out.println("Entered id already exist..id must be unique..Re-enter the id :");
                             id=in.nextInt();
                             found=false;
                         }
                         else found=true;
                     }
                     System.out.println("Enter the employee name :");
                     String name = in.next();
                     System.out.println("Enter the employee salary :");
                     int salary = in.nextInt();
                     list.add(new Employee(id,name,salary));
                     System.out.println("Employee added successfully");
                 }


                 case 2 -> {
                     boolean found=false;
                     for (Employee employee : list){
                         found=true;
                         System.out.println(employee);
                     }
                     if(!found)System.out.println("No details found");
                 }


                 case 3 ->{
                     System.out.println("Enter the id ");
                     int id=in.nextInt();
                     boolean found = false;
                     for (Employee employee : list){
                         if(employee.getempno()==id){
                             found=true;
                             System.out.println(employee);
                             break;
                         }
                     }
                     if(!found){
                         System.out.println("Enter the valid id");
                     }
                 }
                 case 4 ->{
                     System.out.println("Enter the id ");
                     int id=in.nextInt();
                     boolean found = false;
                     for (Employee employee : list){
                         if(employee.getempno()==id){
                             found=true;
                             list.remove(employee);
                             System.out.println("Employee deleted successfully");
                             break;
                         }
                     }
                     if(!found){
                         System.out.println("Enter the valid id");
                     }
                 }
                 case 5 ->{
                     boolean found=false;
                     System.out.println("Enter the id  :");
                     int id=in.nextInt();
                     for (Employee employee : list){
                        if(employee.getempno()==id){
                            found=true;
                            System.out.println("Enter new name :");
                            String name = in.next();
                            System.out.println("Enter new salary");
                            int salary = in.nextInt();
                            employee.setName(name);
                            employee.setSalary(salary);
                            System.out.println("Employee details updated successfully");
                        }
                    }
                     if(!found){
                         System.out.println("Enter the valid id");
                     }
                 }
                 case 6 -> System.exit(0);
                 default -> System.out.println("Enter the valid option");
             }
         }
    }
}
