package guru.springframework.bootstrap;

import guru.springframework.domain.Author;
import guru.springframework.domain.Book;
import guru.springframework.repo.AuthorRepository;
import guru.springframework.repo.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author ali = new Author("Ali", "ElZahaby");
        Book book = new Book("123456", "Introduction to Java");
        ali.getBooks().add(book);
        book.getAuthors().add(ali);

        authorRepository.save(ali);
        bookRepository.save(book);

        Author eslam = new Author("Eslam", "Onsy");
        Book book2 = new Book("231456", "Machine Learning");
        eslam.getBooks().add(book2);
        book2.getAuthors().add(eslam);

        authorRepository.save(eslam);
        bookRepository.save(book2);

        System.out.println("Started in Bootstrap!");
        System.out.println("Number of books: "+ bookRepository.count());

    }
}
