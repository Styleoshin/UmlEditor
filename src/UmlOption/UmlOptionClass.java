package UmlOption;



import java.awt.event.KeyEvent;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class UmlOptionClass {

	private JFrame windowOption;
	JTabbedPane tabbedPane = new JTabbedPane(); // onglets 
	
	UmlOptionClass (){
		
    makeTab();
    
	windowOption.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //quand on ferme la fenetre, le programme s'arrete 
	windowOption.setSize(1000, 600);// dimension de la fenetre
	windowOption.setLocationRelativeTo(null);// pour que la fenetre soit centr�
	windowOption.setResizable(false);// pour redimensioner la fenetre
	windowOption.setAlwaysOnTop(true);// pour que la fenetre reste au dessus des autres fenetre
	}
	
	private void makeTab(){

		tabbedPane.addTab("Classe", new OptionTab1());
		tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);

		tabbedPane.addTab("Attributs", new OptionTab2());
		;
		/*tabbedPane.setMnemonicAt(1, KeyEvent.VK_2);

		JComponent panel3 = makeTextPanel("Panel #3");
		tabbedPane.addTab("Tab 3", icon, panel3,
		                  "Still does nothing");
		tabbedPane.setMnemonicAt(2, KeyEvent.VK_3);

		JComponent panel4 = makeTextPanel(
		        "Panel #4 (has a preferred size of 410 x 50).");
		panel4.setPreferredSize(new Dimension(410, 50));
		tabbedPane.addTab("Tab 4", icon, panel4,
		                      "Does nothing at all");
		tabbedPane.setMnemonicAt(3, KeyEvent.VK_4);*/
	}
}
class OptionTab1 extends JPanel{
	
	private JButton validate = new JButton("Valider") ;
	private JButton close= new JButton("Fermer");
	private JLabel nameClass = new JLabel("Nom de classe : ");
	private JTextField textNameClass;
	
	OptionTab1(){
		   JPanel b1 = new JPanel();
		    //On d�finit le layout en lui indiquant qu'il travaillera en ligne
		   b1.setLayout(new BoxLayout(b1, BoxLayout.LINE_AXIS));
		   b1.add(nameClass);
		   b1.add(textNameClass);
		    
		   JPanel b2 = new JPanel();
		   b2.setLayout(new BoxLayout(b1, BoxLayout.LINE_AXIS));
		   b2.add(validate);
		   b2.add(close);
		   
		   JPanel b3 = new JPanel();
		   b3.setLayout(new BoxLayout(b3, BoxLayout.PAGE_AXIS));
		   b3.add(b1);
		   b3.add(b2);
		        		   		 
	}
}

class OptionTab2 extends JPanel{
	
	private JButton validate=new JButton("Valider") ;
	private JButton close = new JButton("Fermer");
	
	private JButton newAttribute=new JButton("Nouvvelle attribut") ;
	private JButton deleteAttribute = new JButton("Supprimer attributer") ;
	
	private JLabel labelNameAttribute= new JLabel ("Nom attribut : ");
	private JLabel labelTypeAttribute= new JLabel ("Type attribut : ");
	private JLabel labelValueAttribute= new JLabel ("Valeur attribut : ");
	
	private JTextField textNameAttribute;
	private JTextField textTypeAttribute;
	private JTextField textValueAttribute;
	
	OptionTab2(){
		   JPanel b1 = new JPanel();
		    //On d�finit le layout en lui indiquant qu'il travaillera en ligne
		   b1.setLayout(new BoxLayout(b1, BoxLayout.PAGE_AXIS));
		   b1.add(newAttribute);
		   b1.add(deleteAttribute);
		   
		   
		   JPanel b2 = new JPanel();
		   b2.setLayout(new BoxLayout(b2, BoxLayout.LINE_AXIS));
		   b2.add(labelNameAttribute);
		   b2.add(labelTypeAttribute);
		   b2.add(labelValueAttribute);
		   
		   JPanel b3 = new JPanel();
		   b3.setLayout(new BoxLayout(b3, BoxLayout.LINE_AXIS));
		   b3.add(textNameAttribute);
		   b3.add(textTypeAttribute);
		   b3.add(textValueAttribute);
		   
		   JPanel b4 = new JPanel();
		   b4.setLayout(new BoxLayout(b4, BoxLayout.LINE_AXIS));
		   b4.add(validate);
		   b4.add(close);
		   
		   JPanel b5 = new JPanel();
		   b5.setLayout(new BoxLayout(b5, BoxLayout.PAGE_AXIS));
		   b5.add(b2);
		   b5.add(b3);
		   b5.add(b4);
		        		   		 
	}
}

class OptionTab3 extends JPanel{
	
	private JButton validate=new JButton("Valider") ;
	private JButton close = new JButton("Fermer");
	
	private JButton newMethod=new JButton("Nouvelle methode") ;
	private JButton deleteMethod = new JButton("Supprimer methode") ;
	
	private JLabel labelNameMethod = new JLabel ("Nom attribut : ");
	private JLabel labelTypeMethod= new JLabel ("Type Methode  : ");
	
	private JTextField textNameMethod;
	private JTextField textTypeMethod;
	
	OptionTab3(){
		   JPanel b1 = new JPanel();
		    //On d�finit le layout en lui indiquant qu'il travaillera en ligne
		   b1.setLayout(new BoxLayout(b1, BoxLayout.PAGE_AXIS));
		   b1.add(newMethod);
		   b1.add(deleteMethod);
		   
		   
		   JPanel b2 = new JPanel();
		   b2.setLayout(new BoxLayout(b2, BoxLayout.LINE_AXIS));
		   b2.add(labelNameMethod);
		   b2.add(labelTypeMethod);
		   
		   JPanel b3 = new JPanel();
		   b3.setLayout(new BoxLayout(b3, BoxLayout.LINE_AXIS));
		   b3.add(textNameMethod);
		   b3.add(textTypeMethod);
		   
		   JPanel b4 = new JPanel();
		   b4.setLayout(new BoxLayout(b4, BoxLayout.LINE_AXIS));
		   b4.add(validate);
		   b4.add(close);
		   
		   JPanel b5 = new JPanel();
		   b5.setLayout(new BoxLayout(b5, BoxLayout.PAGE_AXIS));
		   b5.add(b2);
		   b5.add(b3);
		   b5.add(b4);
		        		   		 
	}
}
