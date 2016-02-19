package array.controller;

import Arrays.Book;
import array.view.BookFrame;
import array.view.BookPanel;

public class BookController
{
	
	private BookFrame baseFrame;
	private Book[][] myBook;
	
	public BookController()
	{
		myBook = new Book [3][3];
		
		baseFrame = new BookFrame();
	}

	public void start() 
	{
		BookPanel basePanel = new BookPanel();
		setupArray();
		
	}

	private void setupArray() {
		for(int row = 0; row < myBook.length; row++)
		{
			for(int col = 0;col < myBook[0].length; col++ )
			{
				myBook[row][col] = new Book();
				if(col % 2 == 0)
				{
					myBook[row][col].setPages(col + 5);
				}
				
				else
				{
					myBook[row][col].setAuthor("");
				}
			}
		}
		
		public Book[][] getBook()
		{
			return myBook;
		}
		
	}

}
