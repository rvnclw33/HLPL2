package library;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private int price;

    // all field
    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        price = 4999;
    }

    // processing the input
    public Book(String line) {
        String[] tokens = line.split(";");
        title = tokens[0];
        author = tokens[1];
        price = Integer.parseInt(tokens[2]);
    }

    // getter - read
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    // setter - modify

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return title + ";" + author + ";" + price;
    }

    // this: left item
    // o: right item
    // then we compare them

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if ( o == null || getClass() != o.getClass()) return false;

        // type casting
        // analogy: o is speaking o language, and you want it to speak book language, so you need to translate them using (Book).
        Book book = (Book) o;
        return Objects.equals(title, book.title) &&
                Objects.equals(author, book.author);
    }

    // if two objects are equal, they must have the same hashCode()
    @Override
    public int hashCode() {
        int result = Objects.hashCode(title);
        result = 31 * result + Objects.hashCode(author);
        return result;
    }

    @Override
    public int compareTo(Book o) {

        // descending
        if (this.price != o.price) {
            return -Integer.compare(this.price, o.price);
        }

        // ascending
        // this is saying; if false, we need to sort them, if true, no sorting, only compare if they are NOT equal
        if(!Objects.equals(this.author, o.author)) {
            return this.author.compareTo(o.author);
        }

        //ascending
        return this.title.compareTo(o.author);

        // in case of descending just swap to o.author then this.title
        //    if(!Objects.equals(this.author, o.author)) {
        //        return o.author.compareTo(this.author);
        //    }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book[] books = new Book[125];
        int length = 0;

        while(true) {
            String line = scanner.nextLine();

            if(Objects.equals(line, "END")) break;

            books[length] = new Book(line);
            length++;
        }

        // important
        Arrays.sort(books, 0, length);

        for (int i = 0; i < length; i++) {
            System.out.println(books[i]);
        }
    }

}
