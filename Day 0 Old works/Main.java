class Book{
    private String title;
    private String author;
    private double price;
    
    public Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    
    public String showinfo(){
        return "the title of the book is: "+title+" and its author is "+author;
    }
    
    public String showinfo(boolean showprice){
        if(showprice){
            return "the title of the book is: "+title+" and its author is "+author+" for "+price+"$";
        }
        else
        {
            return "the title of the book is: "+title+" and its author is "+author;
        }
    }
}

public class Main{
    public static void main(String[] args){
        Book[] book = new Book[3];
        book[0] = new Book("How to be fit and fine forever","James Nickolson",12);
        book[1] = new Book("Great Man behaviour","Raj Tamang",15);
        book[2] = new Book("A Good Devil Mindset","Raj Tamang",20);
        
        System.out.println(book[0].showinfo());
        System.out.println(book[1].showinfo(true));
        System.out.println(book[2].showinfo(false));
    }
}