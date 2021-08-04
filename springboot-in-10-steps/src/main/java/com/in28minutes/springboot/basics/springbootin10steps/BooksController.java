package com.in28minutes.springboot.basics.springbootin10steps;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {
	@GetMapping("/books")
	public List<Book> getAllBoooks()
	{
		
		return Arrays.asList(new Book(1l,"Mastering spring 5.0","Ranga karnam"));
	}
} 
