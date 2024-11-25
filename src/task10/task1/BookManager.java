package task10.task1;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BookManager {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        List<Book> books = new ArrayList<>();
        books.add(new Book("Джоан", "Гарри Поттер и узник Азкабана", 2021));
        books.add(new Book("Кинг", "Зеленая миля", 2022));
        books.add(new Book("Кинг", "Сияние", 1980));
        books.add(new Book("Караткевич", "Дзiкае паляванне караля Стаха", 2020));
        books.add(new Book("Васильев", "А зори здесь тихие", 2020));

        writeBooksToFile(books);
        List<Book> bookList = readBooksToFile("src/task10/task1/books.txt");
        System.out.println(bookList);

        Predicate<Book> filterByAuthor = book -> book.getAuthor().equals("Кинг");
        Predicate<Book> filterByYear = book -> book.getYearWrite() < 2022;
        List<Book> bookByAuthor = filterList("src/task10/task1/books.txt", filterByAuthor);
        List<Book> bookByYear = filterList("src/task10/task1/books.txt", filterByYear);
        System.out.println("book by author: " + bookByAuthor);
        System.out.println("book by year: " + bookByYear);

        List<Book> groupBookByAuthor = bookList.stream()
                .filter(book -> book.getAuthor().equals("Кинг"))
                .collect(Collectors.toList());
        System.out.println("groupBookByAuthor: " + groupBookByAuthor);
    }

    private static void writeBooksToFile(List<Book> books) throws IOException {
        FileOutputStream outputStream = new FileOutputStream("src/task10/task1/books.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        objectOutputStream.writeObject(books);

        objectOutputStream.close();

    }

    private static List<Book> readBooksToFile(String filePath) throws IOException, ClassNotFoundException {

        FileInputStream fileInputStream = new FileInputStream(filePath);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        List<Book> readBooks = (List<Book>) objectInputStream.readObject();
        return readBooks;

    }

    private static List<Book> filterList(String filePath, Predicate<Book> predicate) throws IOException, ClassNotFoundException {
        List<Book> bookList = readBooksToFile(filePath);
        List<Book> filtredBook = bookList.stream().
                filter(predicate).toList();
        return filtredBook;
    }

}
