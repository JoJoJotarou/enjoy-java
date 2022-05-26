package com.study.spring5_1.bootstrap;

import com.study.spring5_1.domain.Author;
import com.study.spring5_1.domain.Book;
import com.study.spring5_1.repository.AuthorRepository;
import com.study.spring5_1.repository.BookRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;

    public BootStrapData(BookRepository bookRepository, AuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // TODO Auto-generated method stub

        System.out.println("start ....");

        Book book1 = new Book("三国演义", 20);
        Book book2 = new Book("隋唐两朝志传", 20);
        Author author = new Author("罗贯中");

        book1.getAuthors().add(author);
        book2.getAuthors().add(author);
        author.getBooks().add(book1);
        author.getBooks().add(book2);

        // author 要在 book 之前 save 否则 直接 save book 会抛出如下异常:
        // Caused by: org.hibernate.TransientObjectException: object references an
        // unsaved transient instance - save the transient instance before flushing:
        // com.study.spring5_1.domain.Author
        authorRepository.save(author);
        bookRepository.save(book1);
        bookRepository.save(book2);

        System.out.println("当前有" + bookRepository.count() + "本书");
    }

}
