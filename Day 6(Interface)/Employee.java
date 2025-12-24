// Immutable class
import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand =  new Random();
        
        
        int id = 1000 + rand.nextInt(3000);
        
        System.out.println("Enter your Name");
        String name = sc.nextLine();
        
        Date joining = new Date();
        
        Employee e1 = new Employee(id, name, joining);
        e1.getId();
        e1.getName();
        e1.getJoiningDate();
    }
}
public final class Employee {
    private final int id;
    private final String name;
    private final Date joiningDate;
    
    public Employee(int i,String n,Date j) {
        this.id = i;
        this.name = n;
        this.joiningDate = new Date(j.getTime());
    }
    
    public void getId() {
        System.out.println("Id : "+ id);
    }

    public void getName() {
        System.out.println("Name : "+ name);
    }

    public void getJoiningDate() {
        System.out.println("Joining Date : "+ joiningDate.getTime());
    }
}


