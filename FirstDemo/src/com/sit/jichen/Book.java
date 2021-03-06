package com.sit.jichen;

/**
 * use setter() for Property Injection
 */
public class Book {
    private String name;
    private String author;
    private String address;

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setName("ABC");
        book1.setAuthor("author1");
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
