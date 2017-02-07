package launch.app;
// package identifier

// Imports
import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import java.awt.Dimension;
//import java.awt.Image;

import menu.buffer.*;


/**
 * Class: Launch App
 * @author FlyanRyan
 * 
 * class that contains the main method.
 * main JFrame and GUI is built.
 * 
 *
 */

public class LaunchApp 
{

	// Variables
	
	public static final int Window_Width = 200;
	public static final int Window_Height = 500;
	public static JFrame frame = new JFrame(); // JFrame VAR
	
	static BufferPanel bufferPanel = new BufferPanel(); // Created a BufferPanel class object
	
	/**
	 * Function: main(String[] args)
	 * 
	 * Main initial method
	 * Creates thread to run GUI components
	 * 
	 */
	
	public static void main(String[] args)
	{
		
		SwingUtilities.invokeLater(new Runnable() //Created runnable thread to run GUI
				{
					@Override
					public void run()
					{
						createAndShowGUI(); //Method call to createAndShowGUI
					}
		
				});
	}
	
	public static void createAndShowGUI()
	{
		
		//variables
		
		//set size restraints
		frame.setSize(Window_Width, Window_Height);
		frame.setMinimumSize(new Dimension(Window_Width, Window_Height));
		
		//set Frame nonResizeable
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setVisible(true);
	}
	
	
	
}