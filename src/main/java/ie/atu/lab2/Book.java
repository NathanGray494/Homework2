package ie.atu.lab2;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book
{
    private String title;
    private String author;
    private String isbn;
    private String publishedYear;
}
