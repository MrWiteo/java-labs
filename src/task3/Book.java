package task3;

public class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void printInfo() {
        System.out.println("Книга: название - " + title + ", автор - " + author + ", год выпуска - " + year);
    }
}
