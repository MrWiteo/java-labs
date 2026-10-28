package task3;

public class Book {
    private String title;
    private String author;
    private int pages;

    public Book() {
        this.title = "Без названия";
        this.author = "Аноним";
        this.pages = 0;
    }

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public void printInfo() {
        System.out.println("Книга: \"" + title + "\", автор: " + author + ", страниц: " + pages);
    }
}
