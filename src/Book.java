public class Book extends Product {

    private String author;
    private int pages;

    public Book() {
        super();
        author = "";
        pages = 0;
    }

    public Book(String code, String description, double price, String author, int pages) {
        super(code, description, price);
        this.author = author;
        this.pages = pages;
    }

    //Getters and Setters
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        String output = super.toString();
        output += "Author:              " + author + "\n" +
                    "Pages:               " + pages + "\n";
        return output;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Book)) {
            return false;
        }
        Book book = (Book)other;
        if (super.equals(book) &&
            book.author.equals(this.author) &&
            book.pages == this.pages) {
            return true;
        } else {
            return false;
        }
    }
}