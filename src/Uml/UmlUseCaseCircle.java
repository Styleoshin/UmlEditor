package Uml;

import java.util.ArrayList;

import javax.swing.JLabel;

import WindowUml.PanelCenter;

public class UmlUseCaseCircle extends Uml {
	
	
	private static final long serialVersionUID = 1L;

	private JLabel labelTitleCircle = new JLabel("Information");
	public UmlUseCaseCircle(PanelCenter parent) {
		super(parent);
		this.setSize(200,200);
		
	}
	 public String getTitle()
	 {
		 return labelTitleCircle.getText();
	 }
}
