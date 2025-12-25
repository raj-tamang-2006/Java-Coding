class Main{
    public static void main(String[] args){
        Book book1 = new Book("To Kill a Mockingbird", 281, "Harper Lee");
        Book book2 = new Book("1984", 328, "George Orwell");
        Book book3 = new Book("The Great Gatsby", 180, "F. Scott Fitzgerald");
        Book book4 = new Book("Moby Dick", 635, "Herman Melville");
        Book book5 = new Book("Pride and Prejudice", 279, "Jane Austen");
        Book book6 = new Book("The Hobbit", 310, "J.R.R. Tolkien");
        Book book7 = new Book("Fahrenheit 451", 194, "Ray Bradbury");
        Book book8 = new Book("The Catcher in the Rye", 214, "J.D. Salinger");
        Book book9 = new Book("The Lord of the Rings", 1178, "J.R.R. Tolkien");
        Book book10 = new Book("Animal Farm", 112, "George Orwell");
        
        Book[] books = {book1, book2, book3, book4, book5, book6, book7, book8, book9, book10};
        
        Library lib = new Library("KL Library", 2012,books);
        
        lib.displayInfo();
    }
}

class Book{
    String name;
    int pages;
    String author;
    
    Book(String n, int p, String a){
        this.name = n;
        this.pages = p;
        this.author = a;
    }
    
    void display(){
        System.out.println("Title: "+name);
        System.out.println("Pages: "+ pages);
        System.out.println("Author: "+ author+"\n");
    }
}

class Library{
    String name;
    int year;
    Book[] books;
    
    Library(String n, int y, Book[] b){
        this.name = n;
        this.year = y;
        this.books = b;
    }
    
    void displayInfo(){
        int i = 1;
        System.out.println("Library Name: "+name);
        System.out.println("Year Established: "+ year);
        System.out.println("Books Available: ");
        for(Book b : books){
            System.out.println("Book "+i);
            b.display();
            i++;
        }
    }
}


/*output


Library Name: KL Library
Year Established: 2012
Books Available: 
Book 1
Title: To Kill a Mockingbird
Pages: 281
Author: Harper Lee

Book 2
Title: 1984
Pages: 328
Author: George Orwell

Book 3
Title: The Great Gatsby
Pages: 180
Author: F. Scott Fitzgerald

Book 4
Title: Moby Dick
Pages: 635
Author: Herman Melville

Book 5
Title: Pride and Prejudice
Pages: 279
Author: Jane Austen

Book 6
Title: The Hobbit
Pages: 310
Author: J.R.R. Tolkien

Book 7
Title: Fahrenheit 451
Pages: 194
Author: Ray Bradbury

Book 8
Title: The Catcher in the Rye
Pages: 214
Author: J.D. Salinger

Book 9
Title: The Lord of the Rings
Pages: 1178
Author: J.R.R. Tolkien

Book 10
Title: Animal Farm
Pages: 112
Author: George Orwell

*/