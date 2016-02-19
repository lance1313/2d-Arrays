package array.view;

import javax.swing.*;

import array.controller.BookController;

public class BookPanel extends JPanel
{
	private SpringLayout baseLayout;
	private JTextField rowField;
	private JTextField coumnField;
	private JLabel currentBook;
	private JTextField editField;
	private JButton changeButton;
	private JButton displayButton;
	private JTable bookTable;
	private BookController baseController;
	
	public BookPanel(BookController baseController)
	{
		this.baseController = baseController;
	}
	
	private void setupPanel()
	{
		
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}

}
