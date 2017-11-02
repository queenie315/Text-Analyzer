import javax.swing.*;

import java.awt.Component;
import java.awt.PopupMenu;
import java.util.*;

public class Main extends JApplet
{
	private int APPLET_WIDTH = 500, APPLET_HEIGHT = 270;
	
	private InputScreen inputScreen;
	private ReportScreen reportScreen;
	//private PopupMenu helpScreen;
	private JTabbedPane tPane;
	
	public void init()
	{
		inputScreen = new InputScreen();
		reportScreen = new ReportScreen();
		
		tPane = new JTabbedPane();
		tPane.addTab("Input", inputScreen);
		tPane.addTab("Report", reportScreen);
		
		getContentPane().add(tPane);
		setSize(APPLET_WIDTH, APPLET_HEIGHT);
	}
}
