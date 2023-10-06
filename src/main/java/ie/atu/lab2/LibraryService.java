package ie.atu.lab2;

import lombok.*;
import org.springframework.stereotype.Service;


import java.util.ArrayList;

@Service
@Data
@AllArgsConstructor
public class LibraryService
{
    private ArrayList<Book> books;

    public void addBook(Book book)
    {
      books.add(book);
    }
}
