
package view;



import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JOptionPane;

import controller.AddObjectControler;
import controller.DrawingTableController;
import controller.IOController;
import controller.NewProjectController;
import controller.OpenProjectController;
import controller.SaveAsProjectController;
import controller.SaveProjectController;
import model.EditeurUML;
import model.TypeObject;

/**
 *
 * @author digeona
 */
public class MainView extends javax.swing.JFrame implements Observer{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	EditeurUML model;
	IOController superController=new IOController();
	DrawingTableController dtc;
	AddObjectControler aoc1,aoc2,aoc3;

	/**
	 * Creates new form MainView
	 */
	public MainView() {
		initComponents();
	}

	public MainView(EditeurUML model) {
		this.model=model;
		model.addObserver(this);
		initComponents();
		//Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("logo.jpg"));
		//setIconImage(icon);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	
	// <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		buttonsMenu = new javax.swing.JPanel();
		classButton = new javax.swing.JButton();
		abstractClassButton = new javax.swing.JButton();
		interfaceButton = new javax.swing.JButton();
		jSeparator1 = new javax.swing.JSeparator();
		associationButton = new javax.swing.JButton();
		inheritanceButton = new javax.swing.JButton();
		objectLabel = new javax.swing.JLabel();
		relationLabel = new javax.swing.JLabel();
		jScrollPaneDrawingTable = new javax.swing.JScrollPane();
		drawingTable = new JPanelDrawingTable(model.getProject());
		menuBar = new javax.swing.JMenuBar();
		fileMenu = new javax.swing.JMenu();
		newProjectItemMenu = new javax.swing.JMenuItem();
		openProjectItemMenu = new javax.swing.JMenuItem();
		saveItemMenu = new javax.swing.JMenuItem();
		saveAsItemMenu = new javax.swing.JMenuItem();
		exitItemMenu = new javax.swing.JMenuItem();
		editMenu = new javax.swing.JMenu();
		undoItemMenu = new javax.swing.JMenuItem();
		redoItemMenu = new javax.swing.JMenuItem();
		cutItemMenu = new javax.swing.JMenuItem();
		copyItemMenu = new javax.swing.JMenuItem();
		pasteItemMenu = new javax.swing.JMenuItem();
		deleteItemMenu = new javax.swing.JMenuItem();

		setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
		setTitle("SogniDoro");

		
		buttonsMenu.setBackground(new java.awt.Color(224, 224, 224));

		classButton.setText("Class");
		aoc1=new AddObjectControler(TypeObject.CLASS, model);
		classButton.addActionListener(aoc1);

		abstractClassButton.setText("Abstract Class");
		aoc2=new AddObjectControler(TypeObject.ABSTRACT_CLASS, model);
		abstractClassButton.addActionListener(aoc2);

		interfaceButton.setText("Interface");
		aoc3=new AddObjectControler(TypeObject.INTERFACE, model);
		interfaceButton.addActionListener(aoc3);

		associationButton.setText("Association");
		associationButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				associationButtonActionPerformed(evt);
			}
		});

		inheritanceButton.setText("Inheritance");
		inheritanceButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				inheritanceButtonActionPerformed(evt);
			}
		});

		objectLabel.setText("Object");

		relationLabel.setText("Relation");

		javax.swing.GroupLayout buttonsMenuLayout = new javax.swing.GroupLayout(buttonsMenu);
		buttonsMenu.setLayout(buttonsMenuLayout);
		buttonsMenuLayout.setHorizontalGroup(
				buttonsMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jSeparator1)
				.addGroup(buttonsMenuLayout.createSequentialGroup()
						.addContainerGap()
						.addGroup(buttonsMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonsMenuLayout.createSequentialGroup()
										.addGap(0, 0, Short.MAX_VALUE)
										.addComponent(objectLabel)
										.addGap(48, 48, 48))
										.addGroup(buttonsMenuLayout.createSequentialGroup()
												.addGroup(buttonsMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
														.addComponent(inheritanceButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addGroup(javax.swing.GroupLayout.Alignment.LEADING, buttonsMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
																.addComponent(interfaceButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																.addComponent(classButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																.addComponent(abstractClassButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
																.addGroup(javax.swing.GroupLayout.Alignment.LEADING, buttonsMenuLayout.createSequentialGroup()
																		.addGap(25, 25, 25)
																		.addComponent(relationLabel))
																		.addComponent(associationButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
																		.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
				);
		buttonsMenuLayout.setVerticalGroup(
				buttonsMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(buttonsMenuLayout.createSequentialGroup()
						.addGap(17, 17, 17)
						.addComponent(objectLabel)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(classButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(abstractClassButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(interfaceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addComponent(relationLabel)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(associationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(inheritanceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				);
		
		drawingTable.setBackground(new java.awt.Color(254, 254, 254));
		dtc=new DrawingTableController(model,drawingTable);
		drawingTable.addMouseMotionListener(dtc);
		drawingTable.addMouseListener(dtc);


		javax.swing.GroupLayout drawingTableLayout = new javax.swing.GroupLayout(drawingTable);
		drawingTable.setLayout(drawingTableLayout);
		drawingTableLayout.setHorizontalGroup(
				drawingTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 498, Short.MAX_VALUE)
				);
		drawingTableLayout.setVerticalGroup(
				drawingTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 466, Short.MAX_VALUE)
				);

		jScrollPaneDrawingTable.setViewportView(drawingTable);

		fileMenu.setText("File");

		this.addWindowListener( new WindowListener() {
			@Override
			public void windowOpened(WindowEvent e) {}
			@Override
			public void windowIconified(WindowEvent e) {}
			@Override
			public void windowDeiconified(WindowEvent e) {}
			@Override
			public void windowDeactivated(WindowEvent e) {}
			@Override
			public void windowClosing(WindowEvent e) {
				exitSoftware();}
			@Override
			public void windowClosed(WindowEvent e) {}
			@Override
			public void windowActivated(WindowEvent e) {}
		});
		
	
		newProjectItemMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
		newProjectItemMenu.setText("New Project");
		newProjectItemMenu.addActionListener(new NewProjectController(model, this));
		fileMenu.add(newProjectItemMenu);

		openProjectItemMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
		openProjectItemMenu.setText("Open Project");
		openProjectItemMenu.addActionListener(new OpenProjectController(model, this));

		fileMenu.add(openProjectItemMenu);

		saveItemMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
		saveItemMenu.setText("Save");
		fileMenu.add(saveItemMenu);
		saveItemMenu.addActionListener(new SaveProjectController(model,this));
		saveAsItemMenu.setText("Save As");
		fileMenu.add(saveAsItemMenu);
		saveAsItemMenu.addActionListener(new SaveAsProjectController(model, this));
		exitItemMenu.setText("Exit");
		fileMenu.add(exitItemMenu);
		exitItemMenu.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				exitSoftware();
			}
			
		});
		
		menuBar.add(fileMenu);

		editMenu.setText("Edit");

		undoItemMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
		undoItemMenu.setText("Undo");
		editMenu.add(undoItemMenu);

		redoItemMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.CTRL_MASK));
		redoItemMenu.setText("Redo");
		editMenu.add(redoItemMenu);

		cutItemMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
		cutItemMenu.setText("Cut");
		cutItemMenu.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				cutItemMenuActionPerformed(evt);
			}
		});
		editMenu.add(cutItemMenu);

		copyItemMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
		copyItemMenu.setText("Copy");
		editMenu.add(copyItemMenu);

		pasteItemMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
		pasteItemMenu.setText("Paste");
		editMenu.add(pasteItemMenu);

		deleteItemMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, 0));
		deleteItemMenu.setText("Delete");
		editMenu.add(deleteItemMenu);

		menuBar.add(editMenu);

		setJMenuBar(menuBar);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
						.addComponent(jScrollPaneDrawingTable)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(buttonsMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
				);
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(buttonsMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(jScrollPaneDrawingTable, javax.swing.GroupLayout.Alignment.TRAILING)
				);

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void cutItemMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutItemMenuActionPerformed
		// TODO add your handling code here:
	}//GEN-LAST:event_cutItemMenuActionPerformed

	private void associationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_associationButtonActionPerformed
		// TODO add your handling code here:
	}//GEN-LAST:event_associationButtonActionPerformed

	private void inheritanceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inheritanceButtonActionPerformed
		// TODO add your handling code here:
	}//GEN-LAST:event_inheritanceButtonActionPerformed


	
	public void exitSoftware(){
		if(model.getProject().isSave()){
			dispose();
		}else{
			if(JOptionPane.showConfirmDialog(this, "This Project is not save, Want you save it ?", "Etiquettes Java", JOptionPane.YES_NO_OPTION)==0){
				try {
					superController.save(model,this);
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				}
			}
			dispose();
		}
	}
	
	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
		/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
		 * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new MainView().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton abstractClassButton;
	private javax.swing.JButton associationButton;
	private javax.swing.JPanel buttonsMenu;
	private javax.swing.JButton classButton;
	private javax.swing.JMenuItem copyItemMenu;
	private javax.swing.JMenuItem cutItemMenu;
	private javax.swing.JMenuItem deleteItemMenu;
	private JPanelDrawingTable drawingTable;
	private javax.swing.JMenu editMenu;
	private javax.swing.JMenu fileMenu;
	private javax.swing.JButton inheritanceButton;
	private javax.swing.JButton interfaceButton;
	private javax.swing.JScrollPane jScrollPaneDrawingTable;
	private javax.swing.JSeparator jSeparator1;
	private javax.swing.JMenuBar menuBar;
	private javax.swing.JMenuItem newProjectItemMenu;
	private javax.swing.JLabel objectLabel;
	private javax.swing.JMenuItem openProjectItemMenu;
	private javax.swing.JMenuItem pasteItemMenu;
	private javax.swing.JMenuItem redoItemMenu;
	private javax.swing.JLabel relationLabel;
	private javax.swing.JMenuItem saveAsItemMenu;
	private javax.swing.JMenuItem saveItemMenu;
	private javax.swing.JMenuItem exitItemMenu;
	private javax.swing.JMenuItem undoItemMenu;
	// End of variables declaration//GEN-END:variables
	
	
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		dtc.setModel(model.getProject());
		drawingTable.setModel(model.getProject());
		aoc1.setModel(model.getProject());
		aoc2.setModel(model.getProject());
		aoc3.setModel(model.getProject());
		System.out.println(model.getProject().getSavePath());
		drawingTable.repaint();
	}
}
