package librarysystem;

public class Book {
    
    String isbn;
    String title;
    String author;
    int publicationYear;
    
public Book(){
    this.isbn = isbn;
    this.title = title;
    this.author = author;
    this.publicationYear = publicationYear;
}
    
Book(String isbn,String title,String author,int publicationYear){
    
    this.isbn = isbn;
    this.title = title;
    this.author = author;
    this.publicationYear = publicationYear;
}


public void setIsbn(String isbn){
    this.isbn = isbn;
}

public void setTitle(String title){
    this.title = title;
}

public void setAuthor(String author){
    this.author = author;
}

public void setPublicationYear(int publicationYear){
    this.publicationYear = publicationYear;
}

public String getIsbn(){
    return isbn;
}

public String getTitle(){
    return title;
}  

public String getAuthor(){
    return author;
}

public int getPublicationYear(){
    return publicationYear;
}

public void displayBookInformation(){
    
    System.out.println("ISBN : "+isbn);
    System.out.println("Title : "+title);
    System.out.println("Author : "+author);
    System.out.println("Publication Year : "+publicationYear);
       
}

   
}
