import java.util.*;

public class LibraryManagementSystem {
    public static void main(String[] args) {

        LibraryManager libraryManager = LibraryManager.getInstance();

        Book book1 = new Book("isbn1", "math", "abc1", 2019);
        Book book2 = new Book("isbn2", "bio", "abc2", 2018);
        Book book3 = new Book("isbn3", "che", "abc3", 2020);
        Book book4 = new Book("isbn4", "phy", "abc4", 2017);

        Member member1 = new Member("mid1", "mem1");
        Member member2 = new Member("mid2", "mem2");
        Member member3 = new Member("mid3", "mem3");
        Member member4 = new Member("mid4", "mem4");

        libraryManager.addBook(book1);
        libraryManager.addBook(book2);

        libraryManager.registerMember(member1);
        libraryManager.registerMember(member2);
        libraryManager.registerMember(member3);
        libraryManager.registerMember(member4);

        libraryManager.addBook(book3);
        libraryManager.addBook(book4);

        //libraryManager.printMembers();

        libraryManager.borrowBook("mid3", "isbn4");
        libraryManager.borrowBook("mid4", "isbn3");

        libraryManager.returnBook("mid4", "isbn3");

        List<Book> ava_book = libraryManager.searchBook("math");
        for(Book book : ava_book) {
            System.out.println(book.gettitle());
        }
    }
}
