package array.view;

import javax.swing.*;
import javax.swing.table.*;

import array.controller.BookController;

public class BookPanel extends JPanel
{
	private SpringLayout baseLayout;
	private JTextField rowField;
	private JTextField columnField;
	private JLabel currentBook;
	private JTextField editField;
	private JButton changeButton;
	private JButton displayButton;
	private JTable bookTable;
	private BookController baseController;
	
	public BookPanel(BookController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		rowField = new JTextField(5);
		editField = new JTextField(20);
		columnField = new JTextField(5);
		currentBook = new JLabel("my book");
		changeButton = new JButton("change the button");
		displayButton = new JButton("show the button");
				
		setupTable();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	/**
	 * load info from the model into the GUI, as a 2d array.
	 */
	private void setupTable()
	{
	 String [] columnHeaders = {"Column 0" ,"Column 1","Column 2"};
	 DefaultTableModel tableModel = new DefaultTableModel(baseController.getMyBooks(), columnHeaders);
	 bookTable = new JTable(tableModel);
	
	 
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(bookTable);
		this.add(changeButton);
		this.add(currentBook);
		this.add(displayButton);
		
		this.add(columnField);
		this.add(editField);
		this.add(rowField);
		
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.SOUTH, editField, -24, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, displayButton, -24, SpringLayout.NORTH, changeButton);
		baseLayout.putConstraint(SpringLayout.EAST, displayButton, -10, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, currentBook, 22, SpringLayout.SOUTH, rowField);
		baseLayout.putConstraint(SpringLayout.EAST, editField, -16, SpringLayout.WEST, changeButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, changeButton, -42, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, changeButton, 0, SpringLayout.EAST, this);
		 baseLayout.putConstraint(SpringLayout.WEST, currentBook, 0, SpringLayout.WEST, bookTable);
		 baseLayout.putConstraint(SpringLayout.NORTH, bookTable, 50, SpringLayout.NORTH, this);
		 baseLayout.putConstraint(SpringLayout.WEST, bookTable, 50, SpringLayout.WEST, this);
		 baseLayout.putConstraint(SpringLayout.EAST, bookTable, -50, SpringLayout.EAST, this);
		 baseLayout.putConstraint(SpringLayout.NORTH, rowField, 0, SpringLayout.NORTH, columnField);
			baseLayout.putConstraint(SpringLayout.EAST, rowField, -29, SpringLayout.WEST, columnField);
			baseLayout.putConstraint(SpringLayout.SOUTH, columnField, -70, SpringLayout.NORTH, editField);
			baseLayout.putConstraint(SpringLayout.EAST, columnField, -74, SpringLayout.WEST, displayButton);

	}
	
	private void setupListeners()
	{
		
	}

}
