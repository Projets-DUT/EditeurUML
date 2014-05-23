package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import model.ProjectUML;

public class SaveProjectController extends IOController implements ActionListener{

	ProjectUML model;
	JFrame view;
	public SaveProjectController(ProjectUML model,JFrame view){
		this.model=model;
		this.view=view;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			save(model,view);
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
	}
}
