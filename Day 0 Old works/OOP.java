class Employee{
    protected String name;
    protected double salary;
    
    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    public String getDetails(){
        return name + " earns $" + salary;
    }
}

class Developers extends Employee {
    private String language;
    
    public Developers (String name,double salary,String language){
        super(name,salary);
        this.language = language;
    }
    
    @Override 
    public String getDetails() {
        return super.getDetails() + " and knows "+language;
    }
}

class Manager extends Employee {
    private int teamsize;
    
    public Manager (String name,double salary,int teamsize){
        super(name,salary);
        this.teamsize = teamsize;
    }
    
    @Override 
    public String getDetails() {
        return super.getDetails() + " and has a team of "+teamsize+ " people";
    }
}

class Intern extends Employee {
    private int duration;
    
    public Intern (String name,double salary,int duration){
        super(name,salary);
        this.duration = duration;
    }
    
    @Override 
    public String getDetails() {
        return super.getDetails() + " and is an intern here for "+duration+ " months";
    }
}

public class OOP {
    public static void main(String[] args) {
        Developers dev = new Developers("Alice", 75000, "Java");
        Manager mgr = new Manager("Bob", 90000, 10);
        Intern iern = new Intern("Samipya",2000,5);
        System.out.println(dev.getDetails());
        System.out.println(mgr.getDetails());
        System.out.println(iern.getDetails());
    }
}