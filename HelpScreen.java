import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


import java.util.*;


public class HelpScreen 
{

	public void showMessageDialog(JFrame frame, String string, String string2, int informationMessage) {
		String instructions = "Help";
		
		frame = new JFrame("JOptionPane example");
		
		JOptionPane.showMessageDialog(frame, "How does this work?" , instructions, JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
/*	private class helpListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			
			help.showMessageDialog(frame, "Help button");

		}
	}
	*/
}
