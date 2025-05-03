import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class LibraryManager {
    private static LibraryManager instance;
    private final Map<String, Member> members;
    private Map<String, Book> catlog;
    private int max_book = 5;
    private int max_loan = 14;

    private LibraryManager() {
        members = new ConcurrentHashMap<>();
        catlog = new ConcurrentHashMap<>();
    }

    public static synchronized LibraryManager getInstance() {
        if(instance == null) {
            instance = new LibraryManager();
        }
        return instance;
    }

    public void addBook(Book book) {
        catlog.put(book.getisbn(), book);
        for(Member member : members.values()) {
            member.notification(book.gettitle());
        }
    }

    public void registerMember(Member member) {
        members.put(member.getMemberId(), member);
    }

    public void unregisterMember(Member member) {
        members.remove(member);
    }

    public Member getMember(String memberId) {
        return members.get(memberId);
    }

    public Book getBook(String isbn) {
        return catlog.get(isbn);
    }

    public void printMembers() {
        for(Member member : members.values()) {
            System.out.println(member.getMemberId());
        }
    }

    public synchronized void borrowBook(String memberId, String isbn) {
        Member member = getMember(memberId);
        Book book = getBook(isbn);

        if(member != null && book != null && book.isavalibale()) {
            if(max_book > member.numberofbooktaken()) {
                member.addBook(book);
                book.setAvailable(false);
                System.out.println("Book assigned.");
            } else {
                System.out.println("Max Book taken.");
            }
        } else {
            System.out.println("Somthing wrong." + member.getMemberId());
        }
    }

    public synchronized void returnBook(String memberId, String isbn) {
        Member member = members.get(memberId);
        Book book = catlog.get(isbn);

        if(member != null && book != null) {
            member.returnBook(book);
            book.setAvailable(true);
            System.out.println("Book returned.");
        } else {
            System.out.println("Somthing wrong.");
        }
    }

    public List<Book> searchBook(String key) {
        List<Book> books = new ArrayList<>();

        for(Book book : catlog.values()) {
            if(book.gettitle().contains(key) || book.getisbn().contains(key)) {
                books.add(book);
            }
        }

        return books;
    }
}
