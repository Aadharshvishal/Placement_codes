
class Library {
    int bookid;
    String bookname;
    String author;
    boolean isissued = false;

    void issueBook() {
        if (!isissued) {
            isissued = true;
            System.out.println("Book issued successfully");
        } else {
            System.out.println("Book already issued");
        }
    }

    void returnBook() {
        if (isissued) {
            isissued = false;
            System.out.println("Book returned successfully");
        } else {
            System.out.println("Book was not issued");
        }
    }

    void displayBook() {
        System.out.println("Book ID: " + bookid);
        System.out.println("Book Name: " + bookname);
        System.out.println("Author: " + author);
        System.out.println("Issued: " + isissued);
    }
}

public class librarymanagement {
    public static void main(String[] args) {
        Library book1 = new Library();

        book1.bookid = 101;
        book1.bookname = "Java Programming";
        book1.author = "Phoenix";

        book1.displayBook();
        book1.issueBook();
        book1.returnBook();
    }
}