package taskOne;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("Volodia", "shnik@gmail.com", 'm');
        Book book = new Book("abcd", author, 50, 1000);
        System.out.println(book);
        //System.out.println(author);
    }
}
