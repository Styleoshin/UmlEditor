package UmlEditor;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Help extends JFrame {
	
private	JTextArea editorPane = new JTextArea();
	
	public Help(){
		
		setTitle("Diagramme de classe");
		setSize(800,600);
	    setVisible(true);
	    setAlwaysOnTop(true);
		setLocationRelativeTo(null);
		
      editorPane.setEditable(false);

		editorPane.append("Manuel d'utilisation : \n\n ");
		editorPane.append("-Les relations marchent parfaitement, entre 2 entit�s ou plusieures  ou sur l'entit� elle meme\n\n-Les entit�s sont draggables et peuvent etre modifier: \n\n ");
		editorPane.append("G�n�ral : \n\n -Pour instancier un objet veuillez cliquer sur l'objet en question dans le pannel d'outil, puis recliquez une seconde fois dans le pannel du centre");
		editorPane.append("\n\n-Pour les relations, suivre la meme proc�dure");
		editorPane.append("\n\n-Pour editer une entit�, veuillez cliquer 2 fois sur l'entit� afin d'afficher une nouvelle fenetre qui permetera d'apporter des modifications sur l'objet");
        editorPane.append("\n\n-Pour editer une cardinalit�, veuillez cliquer 2 fois sur l\'�xtr�mit� de la cardinalit� souhaiter. Une nouvelle fenetre s'affiche pour changer la cardinalit�");
		add(editorPane);

	}

}
