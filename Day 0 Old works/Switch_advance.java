public class Switch_advance{
    public static void main(String[] args) {
        String value = "Monday";

        // no need of breaks here and we can also put String values in Case Statements
        switch(value){
            case "Sunday","Monday" -> System.out.println("8am");
            case "Saturday" -> System.out.println("9am");
            default -> System.err.println("5am"); 
        } 

    }
}