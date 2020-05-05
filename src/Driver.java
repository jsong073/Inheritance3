public class Driver {
    public static void main(String[] args) {
        Product product = new Product("code", "description", 120);
        Book book = new Book("code book", "description book", 42, "Some author", 300);
        Software software = new Software("code software", "description software", 80,
                "Some programmer", "Some platform", "Some OS");

        System.out.println(product.toString());
        System.out.println("-------------------------");
        System.out.println(book.toString());
        System.out.println("-------------------------");
        System.out.println(software.toString());
    }
}
