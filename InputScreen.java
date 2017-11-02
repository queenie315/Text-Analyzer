import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.swing.*;
import java.util.*;

public class InputScreen extends JPanel
{
	public JButton sumbitButton, helpButton, browseButton;
	public JTextField sumbitField;
	
	private JTextArea output;
	private JLabel browseFile;
	private JOptionPane help, submit;
	private JFrame frame;

	final JFileChooser fc = new JFileChooser();
	
	public InputScreen()
	{	
		helpButton = new JButton("Help");
		browseButton = new JButton("Browse");
		sumbitButton = new JButton("Submit");
		sumbitField = new JTextField(8);
		browseFile = new JLabel("File Name:\n");
		frame = new JFrame("JOptionPane example");
		
		//Creating the window
		JPanel console = new JPanel();
		console.setLayout(new BoxLayout(console,BoxLayout.X_AXIS));
		console.setLayout(new GridLayout(1,1));
		this.add(console);
		
		//Dividing into 3 parts: top, middle, bottom
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout (3,1));
		this.add(p2);
		
		//Top 
		JPanel top = new JPanel();
		//top.add(Box.createRigidArea(new Dimension(60, 65)));
		top.setLayout(new BorderLayout());
		top.add(browseFile, "West");
		top.add(sumbitField,"Center");
		top.add(browseButton, "East");
		//top.setLayout(new BoxLayout(top, BoxLayout.X_AXIS));
		//top.add(browseFile);
		//top.add(sumbitField);
		//top.add(browseButton);
		this.add(top);
		
		//Middle 
		JPanel middle = new JPanel();
		middle.setLayout(new BorderLayout());
		middle.add(Box.createRigidArea(new Dimension(50, 10)));
		middle.add(helpButton, "West");
		middle.add(sumbitButton, "East");
/*		middle.setLayout(new BoxLayout(middle, BoxLayout.X_AXIS));
		middle.add(Box.createRigidArea(new Dimension(50, 10)));
		middle.add(helpButton);
		middle.add(sumbitButton);
		*/
		this.add(middle);
		
		//Bottom
		JPanel bottom = new JPanel();
		bottom.setLayout(new BoxLayout(bottom, BoxLayout.X_AXIS));
		this.add(bottom);
		bottom.add(Box.createRigidArea(new Dimension(50, 10)));
		output = new JTextArea(5,30);
		output.setEditable(false);
		bottom.add(output);
		
		sumbitListener submit = new sumbitListener();
		helpListener help = new helpListener();
		browseListener browse = new browseListener();
		
		sumbitButton.addActionListener(submit);
		helpButton.addActionListener(help);
		browseButton.addActionListener(browse);
	
	}
	private class helpListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			
			help.showMessageDialog(frame, "Help button");
	
		}
	}
	private class sumbitListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			
			submit.showMessageDialog(frame, "Submit button");
	
		}
	}
	private class browseListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			//Handle browse button action
			if(e.getSource() == browseButton)
			{
				int returnVal = fc.showOpenDialog(InputScreen.this);
				fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
				
				if (returnVal == JFileChooser.APPROVE_OPTION)
				{
					File file = fc.getSelectedFile();
					//System.out.println(file);
					//log.append("Opening: " +file.getName() + ".");
				}
				else
				{
					//log.append("Open command cancelled by user.");
				}
			}
		}
		
	}
}
