package librarysystem;
import java.util.ArrayList;

public class LibraryMember {
    
    private String memberId;
    private String name;
    private ArrayList <Book> borrowBooks; 
    
    public LibraryMember(String memberId,String name){
        
         this.memberId = memberId;
         this.name = name;
         
         borrowBooks = new ArrayList<>();
    }

    public LibraryMember() {
        
        this.memberId = memberId;
        this.name = name;
    }
    
    public void setName(String name){
        this.name = name;
        
    }
    
    public void setMemberId(String memberId){
        this.memberId = memberId;
        
    }

    public String getMemberId(){        
        return memberId;
    }
    
    public String getName(){
        return name;
    }
    
    public void borrowBook(Book book){
        
        borrowBooks.add(book);
        System.out.println(name+"has borrowed the book : "+book.title);
    
    }

    public void returnbook(Book book){ 
               
        borrowBooks.remove(book);
        System.out.println(name+"has returned the book : "+book.title);
    }

    public void displayMemberInformation(){ 
        
        System.out.println("Member Id : "+memberId);
        System.out.println("Name : "+name);
        System.out.println("Borrow Books : ");
            for (Book book : borrowBooks){
                book.displayBookInformation();
            }   
    }
    
}
