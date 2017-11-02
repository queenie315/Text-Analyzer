import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class ReportScreen extends JPanel
{
	private JLabel label;
	private JTextField text;;
	
	public ReportScreen()
	{
		JPanel bPanel = new JPanel();
		bPanel.setLayout(new BoxLayout(bPanel,BoxLayout.X_AXIS));
		//bPanel.setLayout(new GridLayout(1,1));
		this.add(bPanel);
		text = new JTextField();
		bPanel.add(text);
	}
}

