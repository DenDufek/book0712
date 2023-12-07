public class Book {
    private String title;
    private String author;
    private int pages;

    // Конструктор
    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    // Геттери та сеттери (можете додати інші методи за необхідністю)

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

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

    // Метод для демонстрації анонімного класу
    public void anonymousClassExample() {
        // Анонімний клас для реалізації інтерфейсу Runnable
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Running from anonymous class.");
            }
        };

        // Виклик методу run()
        runnable.run();
    }

    // Метод для демонстрації лямбда-виразу
    public void lambdaExpressionExample() {
        // Лямбда-вираз для реалізації інтерфейсу Runnable
        Runnable runnable = () -> System.out.println("Running from lambda expression.");

        // Виклик методу run()
        runnable.run();
    }

    public static void main(String[] args) {
        Book book = new Book("Java Programming", "John Doe", 300);

        // Виклики методів для демонстрації анонімного класу та лямбда-виразу
        book.anonymousClassExample();
        book.lambdaExpressionExample();
    }
}
