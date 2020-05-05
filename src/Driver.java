public class Driver {
    public static void main(String[] args) {
        Product product = new Product("code", "description", 120);
        Product productCopy = new Product("code", "description", 120);
        Book book = new Book("code book", "description book", 42, "Some author", 300);
        Book bookCopy = new Book("code book", "description book", 42, "Some author", 300);
        Software software = new Software("code software", "description software", 80,
                "Some programmer", "Some platform", "Some OS");
        Software softwareCopy = new Software("code software", "description software", 80,
                "Some programmer", "Some platform", "Some OS");

        System.out.println(product.equals(productCopy));
        System.out.println(book.equals(bookCopy));
        System.out.println(software.equals(softwareCopy));
        System.out.println(book.equals(product));
        System.out.println(product.equals(software));
    }
}
