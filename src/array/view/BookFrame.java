package array.view;

import javax.swing.*;

import array.controller.BookController;

public class BookFrame extends JFrame
{
	private BookPanel basePanel;
	private BookController baseController;
	
	public BookFrame(BookController baseController)
	{
		this.baseController = baseController;
		basePanel = new BookPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setSize(500,500);
		this.setContentPane(basePanel);
		this.setVisible(true);
	}

}
