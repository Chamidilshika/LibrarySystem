package librarysystem;
import java.util.Scanner;
public class LibrarySystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
              
        Library library = new Library();
        LibraryMember libraryMember = new LibraryMember();
        Book book = new Book();
        
        int choice;
        do{
            System.out.println("-------------------------------LIBRARY SYSTEM-----------------------------");
            System.out.println("1.Add Book");
            System.out.println("2.Add Library Member");
            System.out.println("3.Borrow Book");
            System.out.println("4.Return Book");
            System.out.println("5.Display Available Books");
            System.out.println("6.Display Late Fees");
            System.out.println("7.Display Book Information");
            System.out.println("8.Display Member Information");
            System.out.println("0.Exit");
            
            System.out.print("Enter your choice : ");
            choice = sc.nextInt();
            switch (choice){
                case 1 :
                    System.out.println("----------------------------BOOK DETAILS---------------------------");
                    System.out.print("ISBN : ");
                    String isbn = sc.next();
                    System.out.print("Title : ");
                    String title = sc.next();
                    System.out.print("Author : ");
                    String author = sc.next();
                    System.out.print("Publication Year : ");
                    int publicationYear = sc.nextInt();
                    
                    Book newBook = new Book(isbn,title,author,publicationYear);
                    library.addBook(newBook);
                    break;
                
                case 2 :
                    System.out.println("----------------------------MEMBER DETAILS----------------------------");
                    System.out.print("Member Id : ");
                    String memberId = sc.next();
                    System.out.print("Name : ");
                    String memberName = sc.next();
                    
                    
                    LibraryMember newMember = new LibraryMember(memberId,memberName);
                    library.addMember(newMember);
                    break;
                    
                case 3 :
                    System.out.println("----------------------------BORROW BOOK DETAILS------------------------");
                    System.out.print("Member Id : ");
                    String borrowMemberId = sc.next();
                    System.out.print("ISBN of borrow book : ");
                    String borrowIsbn = sc.next();
                    System.out.print("Title : ");
                    String borrowTitle = sc.next();
                    System.out.println("Author : ");
                    String borrowAuthor = sc.next();
                    System.out.println("Publication Year : ");
                    int bPublicationYear = sc.nextInt();
                    
                    Book borrowBook = new Book(borrowIsbn,borrowTitle,borrowAuthor,bPublicationYear);
                    libraryMember.borrowBook(borrowBook);
                    
                    break;
                    
                case 4 :
                    System.out.println("------------------------------RETURN BOOK DETAILS--------------------------");
                    System.out.print("Member Id : ");
                    String returnMemberId = sc.next();
                    System.out.print("ISBN of return book : ");
                    String returnIsbn = sc.next();   
                    System.out.print("Title : ");
                    String returnTitle = sc.next();
                    System.out.println("Author : ");
                    String returnAuthor = sc.next();
                    System.out.println("Publication Year : ");
                    int rPublicationYear = sc.nextInt();
                    
                    Book returnBook = new Book(returnIsbn,returnTitle,returnAuthor,rPublicationYear);
                    libraryMember.returnbook(returnBook);
                    break;
                    
                case 5 : 
                    System.out.println("---------------------------AVAILABLE BOOKS----------------------------");
                    System.out.println("Available books : ");
                    library.displayAvailableBooks();
                    break;
                    
                case 6 : 
                    System.out.println("--------------------------DETIALS OF LATE FEES----------------------------");
                    System.out.print("Member Id : ");
                    String lateMemberId = sc.next();
                    System.out.print("Late Days : ");
                    int lateDays = sc.nextInt();
                    library.displayLateFees(lateDays);                    
                    break;
                    
                case 7 :                  
                    System.out.print("ISBN : ");
                    String isbn1 = sc.next();
                    System.out.print("Title : ");
                    String title1 = sc.next();
                    System.out.print("Author : ");
                    String author1 = sc.next();
                    System.out.print("Publication Year : ");
                    int publicationYear1 = sc.nextInt();
                    
                    Book book1 = new Book(isbn1,title1,author1,publicationYear1);
                    book1.displayBookInformation();
                    break;
                    
                case 8 :
                    System.out.println("Enter member ID:");
                    String member = sc.next();
                    System.out.print("Name : ");
                    String name = sc.next();
                    
                    LibraryMember libraryMember1 = new LibraryMember(member,name);
                    libraryMember1.displayMemberInformation();
                    break;
                             
                case 0 :
                    System.out.println("Exit Library System");
                    break;
                    
                default :
                    System.out.println("Invalid choice & Please try again");
                   
            }
            
        }while(choice!=0);
        
        sc.close();
            
    }
}
          
        