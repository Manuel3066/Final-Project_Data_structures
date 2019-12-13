package SourceClasses;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * @author Manuel Corral Ledezma
 * @email mcorralledezma@dmacc.edu
 * December 12, 2019
 **/



public class EFSPANEL extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	LinksListeded List1 = new LinksListeded();
	


	//Create all the objects that will be on gui
	final int FIELD_WIDTH = 10;
	StopLightDrawing light = new StopLightDrawing();
	JLabel resultLabel = new JLabel("");
	JLabel promptLabel = new JLabel("Please Click a button for EFScale: ");
	JButton EF0Button = new JButton("EF0");
	JButton EF1Button = new JButton("EF1");
	JButton EF2Button = new JButton("EF2");
	JButton EF3Button = new JButton("EF3");
	JButton EF4Button = new JButton("EF4");
	JButton EF5Button = new JButton("EF5");
	
	//New string that will hold the current scale
	public String switchLight = "";
	
	//Set all colors to gray
	Color ef0 = Color.gray;
	Color ef1 = Color.gray;
	Color ef2 = Color.gray;
	Color ef3 = Color.gray;
	Color ef4 = Color.gray;
	Color ef5 = Color.gray;
	

	public EFSPANEL() {
		
		List1.Append("ef0");
		List1.Append("ef1");
		List1.Append("ef2");
		List1.Append("ef3");
		List1.Append("ef4");
		List1.Append("ef5");
		
		light.setPreferredSize(new Dimension(160, 260));

		
		buttonListenerZero j = new buttonListenerZero();
		EF0Button.addActionListener(j);
		
		buttonListenerOne k = new buttonListenerOne();
		EF1Button.addActionListener(k);
		
		buttonListenerTwo m = new buttonListenerTwo();
		EF2Button.addActionListener(m);
		
		buttonListenerThree p = new buttonListenerThree();
		EF3Button.addActionListener(p);
		
		buttonListenerFour o = new buttonListenerFour();
		EF4Button.addActionListener(o);
		
		buttonListenerFive h = new buttonListenerFive();
		EF5Button.addActionListener(h);
		
		add(light);
		add(promptLabel);
		add(resultLabel);
		add(EF0Button);
		add(EF1Button);
		add(EF2Button);
		add(EF3Button);
		add(EF4Button);
		add(EF5Button);
		
		
		

	}
	
	/**
	 * 
	 * This method takes the answer entered by the user then appropriatly assigns the color and ef rating needed to be shown to the user
	 *
	 */
	//Listeners that will change the display when the button is clicked 
	class buttonListenerZero implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			resultLabel.setText("EF RATING: 0");
			switchLight = LinksListeded.searchList(List1, 0);
			light.changeColor();
		}
		
	}
	class buttonListenerOne implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			resultLabel.setText("EF RATING: 1");
			switchLight = LinksListeded.searchList(List1, 1);
			light.changeColor();
		}
		
	}
	class buttonListenerTwo implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			resultLabel.setText("EF RATING: 2");
			switchLight = LinksListeded.searchList(List1, 2);
			light.changeColor();
		}
		
	}
	class buttonListenerThree implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			resultLabel.setText("EF RATING: 3");
			switchLight = LinksListeded.searchList(List1, 3);
			light.changeColor();
		}
		
	}
	class buttonListenerFour implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			resultLabel.setText("EF RATING: 4");
			switchLight = LinksListeded.searchList(List1, 4);
			light.changeColor();
		}
		
	}
	class buttonListenerFive implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			resultLabel.setText("EF RATING: 5");
			switchLight = LinksListeded.searchList(List1, 5);
			light.changeColor();
		}
		
	}



	
	/**
	 * 
	 * This class controls what colors the GUI to show the ef scale
	 *
	 */
	public class StopLightDrawing extends JComponent {

		// By Default everything is set to gray which should look like its blank
		Color ef0 = Color.gray;
		Color ef1 = Color.gray;
		Color ef2 = Color.gray;
		Color ef3 = Color.gray;
		Color ef4 = Color.gray;
		Color ef5 = Color.gray;
		
		// This method creates the graph that will show off the current scale
		public void paintComponent(Graphics i) {

			i.setColor(ef5);
			i.fillRect(55, 35, 35, 35);

			i.setColor(ef4);
			i.fillRect(55, 70, 35, 35);

			i.setColor(ef3);
			i.fillRect(55, 105, 35, 35);

			i.setColor(ef2);
			i.fillRect(55, 140, 35, 35);

			i.setColor(ef1);
			i.fillRect(55, 175, 35, 35);

			i.setColor(ef0);
			i.fillRect(55, 210, 35, 35);

		}
		
		/**
		 * this method changes the color of the graph according to the ef scale
		 */
		public void changeColor() {

			if (switchLight.equals("ef0")) {
				ef0 = Color.yellow;
				ef1 = Color.gray;
				ef2 = Color.gray;
				ef3 = Color.gray;
				ef4 = Color.gray;
				ef5 = Color.gray;

			} else if (switchLight.equals("ef1")) {
				ef0 = Color.yellow;
				ef1 = Color.yellow;
				ef2 = Color.gray;
				ef3 = Color.gray;
				ef4 = Color.gray;
				ef5 = Color.gray;

			} else if (switchLight.equals("ef2")) {
				ef0 = Color.yellow;
				ef1 = Color.yellow;
				ef2 = Color.orange;
				ef3 = Color.gray;
				ef4 = Color.gray;
				ef5 = Color.gray;

			} else if (switchLight.equals("ef3")) {
				ef0 = Color.yellow;
				ef1 = Color.yellow;
				ef2 = Color.orange;
				ef3 = Color.orange;
				ef4 = Color.gray;
				ef5 = Color.gray;
			} else if (switchLight.equals("ef4")) {
				ef0 = Color.yellow;
				ef1 = Color.yellow;
				ef2 = Color.orange;
				ef3 = Color.orange;
				ef4 = Color.red;
				ef5 = Color.gray;
			} else if (switchLight.equals("ef5")) {
				ef0 = Color.yellow;
				ef1 = Color.yellow;
				ef2 = Color.orange;
				ef3 = Color.orange;
				ef4 = Color.red;
				ef5 = Color.red;
			} else {
				ef0 = Color.gray;
				ef1 = Color.gray;
				ef2 = Color.gray;
				ef3 = Color.gray;
				ef4 = Color.gray;
				ef5 = Color.gray;

			}
			repaint();
		}

	}
}
