package com.learning.core.day05;

import java.util.*;

class Register<T> {
    String registerId;

    public String generateRegisterId(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            sb.append(characters.charAt(random.nextInt(characters.length())));
        }
        return sb.toString();
    }

    public void displayRegistrationDetails(T user) {
        if (user instanceof Employee) {
            Employee employee = (Employee) user;
            System.out.println("Employee Name: " + employee.getName());
            System.out.println("Phone No: " + employee.getPhoneNo());
            System.out.println("Passport No: " + employee.getPassportNo());
            System.out.println("Employee ID: " + employee.getEmployeeId());
        } else if (user instanceof Student) {
            Student student = (Student) user;
            System.out.println("Student Name: " + student.getName());
            System.out.println("Phone No: " + student.getPhoneNo());
            System.out.println("Passport No: " + student.getPassportNo());
        }
        System.out.println("Registration ID: " + registerId);
    }
}

public class D05P01 
{
	public static void main(String[] args) 
	{
		 Register<Employee> empRegister = new Register<>();
	        Employee employee = new Employee("John Doe", 1234567890L, 1001, "ABCD1234");
	        empRegister.registerId = empRegister.generateRegisterId(8);
	        empRegister.displayRegistrationDetails(employee);
	        
	        System.out.println();

	        Register<Student> stuRegister = new Register<>();
	        Student student = new Student("Alice Smith", 9876543210L, "EFGH5678");
	        stuRegister.registerId = stuRegister.generateRegisterId(8);
	        stuRegister.displayRegistrationDetails(student);
    }

}
