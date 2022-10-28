package taskOne;

public class Book {
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;

    public Book(String name, Author author, double price, int qtyInStock){
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    public Book(String name, Author author, int price){
        this.name = name;
        this.author = author;
        this.price = price;
    }
    @Override
    public String toString(){
        return  "The book name is: " + name + " author is: {" + author + " }";
    }

    // GETTERS AND SETTERS

    public String getName(){
        return name;
    }
    public Author getAuthor(){
        return author;
    }
    public int getQtyInStock(){
        return qtyInStock;
    }
    public double getPrice(){
        return price;
    }
    public void setQtyInStock(int qtyInStock){
        this.qtyInStock =  qtyInStock;
    }
    public void setPrice(int price){
        this.price = price;
    }
}
