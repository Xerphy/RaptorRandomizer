package raptor.view;

import raptor.controller.Controller;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Frame extends JFrame
{
	private Controller appController;
	private Panel appPanel;
	
	public Frame(Controller appController)
	{
		super();
		this.appController = appController;
		appPanel = new Panel(appController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("Raptor Randomizer");
		this.setResizable(false);
		this.setSize(800, 472);
		this.setVisible(true);
	}
	
	public Controller getAppController()
	{
		return appController;
	}
}
