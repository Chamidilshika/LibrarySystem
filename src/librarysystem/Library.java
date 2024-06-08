package librarysystem;
import java.util.ArrayList;
import java.util.List;

public class Library {
    
    private  ArrayList <Book> collectionOfBook;
    private  ArrayList <LibraryMember> libraryMember;
    int lateDays = 0;
    
    
    public Library(){
        
        collectionOfBook = new ArrayList<>();
        libraryMember = new ArrayList<>();
        
    } 
   
    public void addBook(Book book){        
        
        collectionOfBook.add(book);
        System.out.println("Book added successfully");
    }

    public void addMember(LibraryMember member){
        
        libraryMember.add(member);
        System.out.println("Member added successfully");
    }

    public void displayAvailableBooks(){
    
        for (Book book : collectionOfBook){
            book.displayBookInformation();
            
        }
    }

    public int displayLateFees(int days){
        
       int lateFee = lateDays*5;
       System.out.println("Late Fee : "+lateFee);
       return lateFee;
    }
    
    public LibraryMember getMember(String memberId){
        for (LibraryMember member : libraryMember){
            if (member.getMemberId()==memberId){
                return member;
            }
        }
        return null;
    }
    
    public Book getBookInformation(int isbn){
        for (Book book : collectionOfBook){
            book.displayBookInformation();
            System.out.println();
        }
        return null;
    }
    
}
