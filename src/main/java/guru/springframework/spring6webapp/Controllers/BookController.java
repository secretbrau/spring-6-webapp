package guru.springframework.spring6webapp.Controllers;


import guru.springframework.spring6webapp.Services.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {


    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping
    public String getBooks(Model model) {


        model.addAttribute("books", bookService.findAll());

        return "books";

    }


}
