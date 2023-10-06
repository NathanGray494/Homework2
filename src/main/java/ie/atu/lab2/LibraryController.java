package ie.atu.lab2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LibraryController
{
    @Autowired
    private LibraryService libraryService;

//    @Autowired
//    public void setMyService(LibraryService libraryService)
//    {
//        this.libraryService = libraryService;
//    }

    /*
        http://localhost:8080/library
        GET
    */
    @GetMapping("/library")
    public List<Book> displayLibrary()
    {
        return libraryService.getBooks();
    }
    /*
        http://localhost:8080/addbook
        POST

        {
          "title": "Roadside Picnic",
          "author": "Boris Strugatsky",
          "isbn": "9781613743447",
          "publishedYear": "1972"
        }

    */
    @PostMapping("/addbook")
    @ResponseStatus(HttpStatus.CREATED)
    public void addBook(@RequestBody Book book)
    {
        libraryService.addBook(book);
    }
}
