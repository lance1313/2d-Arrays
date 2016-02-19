package array.controller;

import Arrays.Book;
import array.view.BookFrame;
import array.view.BookPanel;

public class BookController
{
	
	private BookFrame baseFrame;
	private Book[][] myBooks;
	
	public BookController()
	{
		myBooks = new Book [3][3];
		setupArray();
		baseFrame = new BookFrame();
	}

	public void start() 
	{
	//	BookPanel basePanel = new BookPanel(null);
		
		
	}

	private void setupArray() 
	{
		for(int row = 0; row < myBooks.length; row++)
		{
			for(int col = 0;col < myBooks[0].length; col++ )
			{
				myBooks[row][col] = new Book();
				if(col % 2 == 0)
				{
					myBooks[row][col].setPages(col + 5);
				}
				
				else
				{
					myBooks[row][col].setAuthor("");
				}
			}
		}
		
	}

	public Book[][] getMyBooks() {
		return myBooks;
	}

	

}
