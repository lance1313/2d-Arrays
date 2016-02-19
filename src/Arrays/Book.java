package Arrays;

public class Book {
	
	private int pages;
	private String author;
	
	public Book()
	{
		this.author = "";
		this.pages = 1;
	}
	
	public Book(String author, int pages)
	{
		this.author = author;
		this.pages = pages;
		
	}
	
	
	public String toString()
	{
		String bookDescription = "The book has" + pages + " pages and the author is " + author +".";
		
		return bookDescription;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	

}
