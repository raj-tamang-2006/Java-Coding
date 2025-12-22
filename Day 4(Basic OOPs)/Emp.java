class Emp{
    public static void main(String[] args){
        Employee e1 = new Employee();
        e1.setname("Raj Tamang");
        e1.setSal(78000);
        e1.setPost("Senior Developer and Security Architect");
        e1.Display();
        
    }
}
class Employee{
    String name;
    double salary;
    String post;
    //setter function
    void setname(String n){
        this.name = n;
    }
    void setSal(double s){
        this.salary = s;
    }
    void setPost(String p){
        this.post = p;
    }
    //getter function
    void Display(){
        System.out.println("Employee Details\nName: "+ name+"\nSalary: $"+salary+"\nPosition: "+post);
    }
}
