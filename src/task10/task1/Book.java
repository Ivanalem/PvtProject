package task10.task1;

import java.io.Serializable;

public class Book implements Serializable {
    private String author;
    private String title;
    private int yearWrite;

    public Book(String author, String title, int yearWrite) {
        this.author = author;
        this.title = title;
        this.yearWrite = yearWrite;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYearWrite() {
        return yearWrite;
    }


    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", yearWrite=" + yearWrite +
                '}';
    }
}
