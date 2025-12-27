class GETSET{
    public static void main(String[] args){
        Person Raj = new Person("Raj Tamang", 20, "Millionaire");
        System.out.println(Raj.getName());
        Raj.display();
        
        Raj.setDream("Cyber Security Expert and Java Developer");
        
        Raj.display();
    }
}

class Person{
    private String name;
    private int age;
    private String dream;
    
    Person(String n, int a, String d){
        this.name = n;
        this.age = a;
        this.dream = d;
    }
    
    //Setters
    
    public void setName(String nam){
        this.name = nam;
    }
    
    public void setAge(int ag){
        this.age = ag;
    }
    
    public void setDream(String dre){
        this.dream = dre;
    }
    //Getter
    public String getName(){
        return this.name;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public String getDream(){
        return this.dream;
    }
    
    public void display(){
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Dream : "+ dream);
    }
}

/*output


Raj Tamang
Name: Raj Tamang
Age: 20
Dream : Millionaire
Name: Raj Tamang
Age: 20
Dream : Cyber Security Expert and Java Developer

*/