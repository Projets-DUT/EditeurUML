/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;
import java.util.Observable;
import java.util.Observer;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import controller.AddObjectControler;
import controller.AssociationController;
import controller.DrawingTableController;
import controller.IOController;
import controller.NewProjectController;
import controller.OpenProjectController;
import controller.SaveAsProjectController;
import controller.SaveProjectController;
import model.EditeurUML;
import model.ProjectUML;
import model.TypeObject;

/**
 *
 * @author aur
 */
public class MainView extends javax.swing.JFrame implements Observer {
	EditeurUML model;
	IOController superController=new IOController();
	DrawingTableController dtc;
	AddObjectControler aoc1,aoc2,aoc3;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Creates new form MainView
	 * @param editeurUML 
	 */
	public MainView(EditeurUML model) {
		this.model=model;
		model.addObserver(this);
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */

	// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
	private void initComponents() {

		panelTable = new javax.swing.JPanel();
		toolBar = new javax.swing.JToolBar();
		newButtonToolBar = new javax.swing.JButton();
		openButtonToolBar = new javax.swing.JButton();
		saveButtonToolBar = new javax.swing.JButton();
		noteButtonToolBar = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		drawingTable = new JPanelDrawingTable(model.getProject());
		jPanel3 = new javax.swing.JPanel();
		classButton = new javax.swing.JButton();
		abstractClassButton = new javax.swing.JButton();
		interfaceButton = new javax.swing.JButton();
		associationButton = new javax.swing.JButton();
		extendButton = new javax.swing.JButton();
		implementButton = new javax.swing.JButton();
		dependenceButton = new javax.swing.JButton();
		jSeparator2 = new javax.swing.JSeparator();
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
		generateMenu = new javax.swing.JMenu();
		javaItemMenu = new javax.swing.JMenuItem();
		cItemMenu = new javax.swing.JMenuItem();

		setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
		setBackground(new java.awt.Color(0, 0, 0));

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

		panelTable.setBackground(new java.awt.Color(0, 0, 0));
		panelTable.setLayout(new java.awt.BorderLayout());

		toolBar.setRollover(true);

		newButtonToolBar.setIcon(new ImageIcon(this.getClass().getResource("../images/new.jpg"))); // NOI18N
		newButtonToolBar.setBorderPainted(false);
		newButtonToolBar.setFocusable(false);
		newButtonToolBar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		newButtonToolBar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
		newButtonToolBar.addActionListener(new NewProjectController(model, this));
		toolBar.add(newButtonToolBar);

		openButtonToolBar.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("../images/open.jpg"))); // NOI18N
		openButtonToolBar.setBorderPainted(false);
		openButtonToolBar.setFocusable(false);
		openButtonToolBar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		openButtonToolBar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
		openButtonToolBar.addActionListener(new OpenProjectController(model, this));
		toolBar.add(openButtonToolBar);

		saveButtonToolBar.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("../images/save.jpg"))); // NOI18N
		saveButtonToolBar.setBorderPainted(false);
		saveButtonToolBar.setFocusable(false);
		saveButtonToolBar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		saveButtonToolBar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
		saveButtonToolBar.addActionListener(new SaveProjectController(model, this));
		toolBar.add(saveButtonToolBar);

		noteButtonToolBar.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("../images/notes.jpg"))); // NOI18N
		noteButtonToolBar.setBorderPainted(false);
		noteButtonToolBar.setFocusable(false);
		noteButtonToolBar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		noteButtonToolBar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
		noteButtonToolBar.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				new ChangesNotesView(model.getProject()).setVisible(true);;				
			}
		});
		toolBar.add(noteButtonToolBar);

		panelTable.add(toolBar, java.awt.BorderLayout.PAGE_START);

		drawingTable.setBackground(new java.awt.Color(255, 255, 255));
		drawingTable.setMaximumSize(new java.awt.Dimension(50000, 50000));
		drawingTable.setPreferredSize(new java.awt.Dimension(1000, 1000));
		dtc=new DrawingTableController(model,drawingTable);
		drawingTable.addMouseMotionListener(dtc);
		drawingTable.addMouseListener(dtc);

		javax.swing.GroupLayout JPanelDrawingTableLayout = new javax.swing.GroupLayout(drawingTable);
		drawingTable.setLayout(JPanelDrawingTableLayout);
		JPanelDrawingTableLayout.setHorizontalGroup(
				JPanelDrawingTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 1000, Short.MAX_VALUE)
				);
		JPanelDrawingTableLayout.setVerticalGroup(
				JPanelDrawingTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 1000, Short.MAX_VALUE)
				);

		jScrollPane1.setViewportView(drawingTable);

		panelTable.add(jScrollPane1, java.awt.BorderLayout.CENTER);

		jPanel3.setBackground(new java.awt.Color(255, 255, 255));
		jPanel3.setMaximumSize(new java.awt.Dimension(153, 500));

		classButton.setBackground(new java.awt.Color(204, 204, 204));
		classButton.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("../images/class.png"))); // NOI18N
		classButton.setBorderPainted(false);
		aoc1=new AddObjectControler(TypeObject.CLASS, model);
		classButton.addActionListener(aoc1);

		abstractClassButton.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("../images/abstract.png"))); // NOI18N
		abstractClassButton.setToolTipText("");
		aoc2=new AddObjectControler(TypeObject.ABSTRACT_CLASS, model);
		abstractClassButton.addActionListener(aoc2);

		interfaceButton.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("../images/interface.png"))); // NOI18N
		aoc3=new AddObjectControler(TypeObject.INTERFACE, model);
		interfaceButton.addActionListener(aoc3);

		associationButton.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("../images/association.png"))); // NOI18N
		ac0 = new AssociationController(this,model.getProject(), 0);
		associationButton.addActionListener(ac0);

		extendButton.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("../images/extend.png"))); // NOI18N
		ac1 = new AssociationController(this,model.getProject(), 1);
		extendButton.addActionListener(ac1);

		implementButton.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("../images/implement.png"))); // NOI18N
		ac2=new AssociationController(this,model.getProject(), 2);
		implementButton.addActionListener(ac2);

		dependenceButton.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("../images/dependence.png"))); // NOI18N
		ac3 = new AssociationController(this,model.getProject(), 3);
		dependenceButton.addActionListener(ac3);

		jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(
				jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jSeparator2)
								.addGroup(jPanel3Layout.createSequentialGroup()
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addComponent(abstractClassButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
												.addComponent(classButton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(interfaceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
												.addGroup(jPanel3Layout.createSequentialGroup()
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
																.addComponent(associationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(extendButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
																.addComponent(implementButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
																.addComponent(dependenceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
																.addContainerGap())
				);
		jPanel3Layout.setVerticalGroup(
				jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(classButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(interfaceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(abstractClassButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addComponent(associationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(extendButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(implementButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(dependenceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				);

		fileMenu.setText("File");

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
		saveItemMenu.addActionListener(new SaveProjectController(model, this));
		fileMenu.add(saveItemMenu);

		saveAsItemMenu.setText("Save As");
		saveAsItemMenu.addActionListener(new SaveAsProjectController(model, this));
		fileMenu.add(saveAsItemMenu);

		exitItemMenu.setText("Exit");
		exitItemMenu.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				exitSoftware();
			}
		});
		fileMenu.add(exitItemMenu);

		menuBar.add(fileMenu);

		editMenu.setText("Edit");

		undoItemMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
		undoItemMenu.setText("Undo");
		editMenu.add(undoItemMenu);

		redoItemMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.CTRL_MASK));
		redoItemMenu.setText("Redo");
		editMenu.add(redoItemMenu);

		menuBar.add(editMenu);

		generateMenu.setText("Generate");

		javaItemMenu.setText("Java");
		javaItemMenu.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				if(!model.getProject().isSave()){
					JOptionPane.showMessageDialog(panelTable, "Save before generate java code");
				}else{
					try {
						model.getProject().generateJava();
					} catch (IOException e) {
						System.out.println("Fail Generate Java code");
					}
				}
			}
		});
		generateMenu.add(javaItemMenu);

		cItemMenu.setText("C++");
		generateMenu.add(cItemMenu);

		menuBar.add(generateMenu);

		setJMenuBar(menuBar);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(panelTable, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap())
				);
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(panelTable, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap())
				);

		pack();
	}// </editor-fold>                        

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
				new MainView(new EditeurUML()).setVisible(true);
			}
		});
	}

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
	// Variables declaration - do not modify                     
	private JPanelDrawingTable drawingTable;
	private javax.swing.JButton abstractClassButton;
	private javax.swing.JButton associationButton;
	private javax.swing.JMenuItem cItemMenu;
	private javax.swing.JButton classButton;
	private javax.swing.JButton dependenceButton;
	private javax.swing.JMenu editMenu;
	private javax.swing.JMenuItem exitItemMenu;
	private javax.swing.JButton extendButton;
	private javax.swing.JMenu fileMenu;
	private javax.swing.JMenu generateMenu;
	private javax.swing.JButton implementButton;
	private javax.swing.JButton interfaceButton;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JSeparator jSeparator2;
	private javax.swing.JMenuItem javaItemMenu;
	private javax.swing.JMenuBar menuBar;
	private javax.swing.JButton newButtonToolBar;
	private javax.swing.JMenuItem newProjectItemMenu;
	private javax.swing.JButton noteButtonToolBar;
	private javax.swing.JButton openButtonToolBar;
	private javax.swing.JMenuItem openProjectItemMenu;
	private javax.swing.JPanel panelTable;
	private javax.swing.JMenuItem redoItemMenu;
	private javax.swing.JMenuItem saveAsItemMenu;
	private javax.swing.JButton saveButtonToolBar;
	private javax.swing.JMenuItem saveItemMenu;
	private javax.swing.JToolBar toolBar;
	private javax.swing.JMenuItem undoItemMenu;
	// End of variables declaration                   
	AssociationController ac0;
	AssociationController ac1;
	AssociationController ac2;
	AssociationController ac3;
	public void update(Observable o, Object arg) {
		dtc.setModel(model.getProject());
		drawingTable.setModel(model.getProject());
		aoc1.setModel(model.getProject());
		aoc2.setModel(model.getProject());
		aoc3.setModel(model.getProject());
		ac0.setModel(model.getProject());
		ac1.setModel(model.getProject());
		ac2.setModel(model.getProject());
		ac3.setModel(model.getProject());
		drawingTable.repaint();
	}

	public EditeurUML getModel() {
		return model;
	}
}