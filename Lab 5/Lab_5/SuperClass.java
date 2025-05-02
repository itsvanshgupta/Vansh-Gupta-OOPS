package Upes.Lab_5;

// 1. Demonstrating private member restriction in inheritance
class SuperClass {
    private int privateVar = 10;

    public int getPrivateVar() {
        return privateVar;
    }
}

class SubClass extends SuperClass {
    public void display() {
        System.out.println("Access privateVar using getter: " + getPrivateVar());
    }
}

// 2. Employee and Manager class hierarchy
class Employee {
    private String name;
    private int empid;
    private double salary;

    public Employee() {
        this.name = "Unknown";
        this.empid = 0;
        this.salary = 0.0;
    }

    public Employee(String name, int empid, double salary) {
        this.name = name;
        this.empid = empid;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void increaseSalary(double percentage) {
        salary += salary * (percentage / 100);
    }
}

class Manager extends Employee {
    private String department;

    public Manager(String name, int empid, double salary, String department) {
        super(name, empid, salary);
        this.department = department;
    }
}

// 3. University Management System
class Person {
    protected String name;
    protected int age;
    protected String address;
}

class Staff extends Person {
    protected int staffId;
    protected String department;
}

class Professor extends Staff {
    protected String specialization;

    public void conductLecture() {
        System.out.println(name + " is conducting a lecture in " + specialization);
    }
}

class Student extends Person {
    protected int studentId;
    protected String course;
}

class GraduateStudent extends Student {
    protected String researchTopic;

    public void submitThesis() {
        System.out.println(name + " submitted thesis on " + researchTopic);
    }
}

// 4. Abstract Vehicle class
abstract class Vehicle {
    protected String make;
    protected String model;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public abstract void startEngine();
    public abstract void stopEngine();

    public void serviceInfo() {
        System.out.println("Service required every 10,000 miles.");
    }
}

class Car extends Vehicle {
    public Car(String make, String model) {
        super(make, model);
    }

    public void startEngine() {
        System.out.println("Car engine started.");
    }

    public void stopEngine() {
        System.out.println("Car engine stopped.");
    }
}

// 5. Restaurant Management System
class Chef {
    public void makeSpecialDish() {
        System.out.println("Making a generic dish.");
    }
}

class ItalianChef extends Chef {
    public void makeSpecialDish() {
        System.out.println("Making pasta.");
    }
}

class ChineseChef extends Chef {
    public void makeSpecialDish() {
        System.out.println("Making dumplings.");
    }
}

class MexicanChef extends Chef {
    public void makeSpecialDish() {
        System.out.println("Making tacos.");
    }
}

