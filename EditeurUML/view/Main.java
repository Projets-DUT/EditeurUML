package view;

import model.EditeurUML;

public class Main {
	public static void main (String[] args){
		new MainView(new EditeurUML()).setVisible(true);
	}
}

