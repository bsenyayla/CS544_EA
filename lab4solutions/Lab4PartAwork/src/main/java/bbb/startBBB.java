package bbb;

import bbb.domain.Book;
import bbb.domain.Publisher;
import bbb.repositories.BookRepository;
import bbb.repositories.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.util.Optional;

@SpringBootApplication
public class startBBB implements CommandLineRunner {
    @Autowired
    BookRepository bookRepository;

    @Autowired
    PublisherRepository publisherRepository;


    public static void main(String[] args) {
        SpringApplication.run(startBBB.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("running BB");


        AddNewRow();
        AddNewRow();


        Optional<Publisher> publisherOpt = publisherRepository.findById(2L);
        Publisher publisher2 = publisherOpt.get();


        AddNewRow(publisher2);
        System.out.println("PublisherId:" + publisher2.getId());
        System.out.println("PublisherName:" + publisher2.getName());

/*
        Book book1 = new Book("99123212", "Kitap  2", "Rene De Jong");
        book1.setPublisher(publisher2);
        bookRepository.save(book1);
*/
        //Optional<Book> bookOpt = bookRepository.findById(1L);
        //Book book2 = bookOpt.get();
        //System.out.println(book2);

    }

    private  void AddNewRow(){
        Book book = new Book("123432123", "Java Patterns", "Sam Cooke");
        book.setPublisher(new Publisher("Quick books"));
        bookRepository.save(book);
    }

    private  void AddNewRow(Publisher vlPublisher){
        Book book = new Book("123432123", "Java Patterns", "Sam Cooke");
        book.setPublisher(vlPublisher);
        bookRepository.save(book);
    }
}
