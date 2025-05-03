import java.util.ArrayList;
import java.util.List;

public class Member {
    private String memberid;
    private String name;
    List<Book> books_taken;
    //LibraryManager libraryManager;

    public Member(String memberId, String name) {
        this.memberid = memberId;
        this.name = name;
        books_taken = new ArrayList<>();
    }

    public String getMemberId() {
        return this.memberid;
    }

    public void addBook(Book book) {
        books_taken.add(book);
    }

    public void returnBook(Book book) {
        books_taken.remove(book);
    }

    public int numberofbooktaken() {
        return books_taken.size();
    }

    public void notification(String title) {
        System.out.println("Dear " + this.name + " " + title + " book added in library.");
    }
}
