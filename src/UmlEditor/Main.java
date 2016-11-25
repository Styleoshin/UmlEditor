package UmlEditor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Main {
	
	public static Editor editor;

	public static void main(String[] args) {
		JMenuBar menubar = new JMenuBar();
		
		JFrame fenetre = new JFrame("Editeur UML"); // le nom de l'application
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //quand on ferme la fenetre, le programme s'arrete 
		fenetre.setSize(1000, 600);// dimension de la fenetre
		fenetre.setLocationRelativeTo(null);// pour que la fenetre soit centr�
		fenetre.setResizable(false);// pour redimensioner la fenetre
		fenetre.setAlwaysOnTop(true);// pour que la fenetre reste au dessus des autres fenetre
		

		JMenu file = new JMenu("File");
		menubar.add(file);
		JMenu ilyes = new JMenu("New");
		file.add(ilyes);
		JMenuItem newproject = new JMenuItem("New UML Project");
		ilyes.add(newproject);
		file.add(save);
		JMenuItem exit = new JMenuItem("Exit");
		file.add(exit);
		
		JMenu edit = new JMenu("Edit");
		menubar.add(edit);
		
		JMenu view = new JMenu("View");
		menubar.add(view);
		
		JMenu help = new JMenu("Help");
		menubar.add(help);
		JMenuItem about = new JMenuItem("About");
		help.add(about);
		
		
		class exitaction implements ActionListener{
			public void actionPerformed (ActionEvent e){
				System.exit(0);
			}
		}
		exit.addActionListener(new exitaction());
		
		editor = new Editor();
		
		  fenetre.setContentPane(editor); //on associe la scene � la fenetre de l'application
	      fenetre.setVisible(true);// pour que la fenetre soit visible
	      fenetre.setJMenuBar(menubar);
	}

}
