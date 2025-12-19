
public class Library {
    public String libraryName;
    public Book book1;
    public Book book2;
    public Book book3;

    public void addBook(Book book, int slot) {
        if (slot == 1) {
            book1 = book;
        } else if (slot == 2) {
            book2 = book;
        } else if (slot == 3) {
            book3 = book;
        }
    }

    public void removeBook(int slot) {
        if (slot == 1) {
            book1 = null;
        } else if (slot == 2) {
            book2 = null;
        } else if (slot == 3) {
            book3 = null;
        }
    }

    public void printLibraryDetails() {
        System.out.println("Library: " + libraryName);
        System.out.println("");
        printBookDetails(book1);
        System.out.println("");
        printBookDetails(book2);
        System.out.println("");
        printBookDetails(book3);
    }

    public void printBookDetails(Book book) {
        if (book != null) {
            book.printDetails();
        } else {
            System.out.println("No book in this slot.");
        }
    }

    public void checkBookAvailability(int slot) {
        Book target = null;
        if (slot == 1) target = book1;
        else if (slot == 2) target = book2;
        else if (slot == 3) target = book3;

        if (target != null) {
            System.out.println(target.title + " is available.");
        } else {
            System.out.println("Book in slot " + slot + " is not available.");
        }
    }

    public void updateBookPrice(int slot, double newPrice) {
        Book target = null;
        if (slot == 1) target = book1;
        else if (slot == 2) target = book2;
        else if (slot == 3) target = book3;

        if (target != null) {
            target.updatePrice(newPrice);
            System.out.println("Updated price of " + target.title + " to $" + newPrice + ".");
        } else {
            System.out.println("No book in this slot.");
        }
    }
}