package mvc;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping(value = {"/book/"})
public class BookController {
    private Map<String, Book> bookList = new HashMap<String, Book>();


    public BookController(){
        bookList.put("book1",
                new Book("isbn","author","title",10.0)
                );
    }


    //Default;
    @GetMapping("")
    public ResponseEntity<?> get() {
        Book book = bookList.get("book1");
        if (book == null) {
            return new ResponseEntity<CustomErrorType>(new CustomErrorType("Contact with firstname= "
                    +  " is not available"), HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Book>(book, HttpStatus.OK);
    }

    //addBook(Book book);
    @PostMapping(value = {"/addBook"})
    public Book addBook( @RequestBody Book val) {
        bookList.put(val.getIsbn(),val);
        //return new ResponseEntity<Book>(book, HttpStatus.OK);
        return val;
    }

    //updateBook(Book book);
    @PutMapping(value = {"/updateBook/{isbn}"})
    public Book updateBook( @RequestBody Book val, @PathVariable String  isbn) {
        bookList.put(isbn,val);
        return val;
    }

    //deleteBook(String isbn);
    @DeleteMapping(value = {"/delete/{isbn}"})
    public void deleteBook(@PathVariable String  isbn) {
        bookList.remove(isbn);
    }

    //getBook(String isbn);
    @GetMapping("/getbook/{isbn}")
    public ResponseEntity<?> getBook(@PathVariable String isbn) {
        Book book = bookList.get(isbn);
        if (book == null) {
            return new ResponseEntity<CustomErrorType>(new CustomErrorType("Contact with firstname= "
                    +  " is not available"), HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Book>(book, HttpStatus.OK);
    }



    //getAllBooks();
    @GetMapping("/getAllBooks")
    public ResponseEntity<?> getAllBooks() {
        return new ResponseEntity<Map<String, Book>>(bookList,HttpStatus.OK);
    }


    //searchBooks(String isbn);
    @GetMapping("/getbook/{author}")
    public ResponseEntity<?> searchBooks(@PathVariable String author) {
        Book retVal=null;
        for (Book value : bookList.values()) {
            if(value.getAuthor()==author){
                retVal=value;
                break;
            }
        }

        return new ResponseEntity<Book>(retVal, HttpStatus.OK);
    }
}
/*





searchBooks(String author);
* */