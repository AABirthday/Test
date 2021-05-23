import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Aarón
 */
public class Cartas extends JButton implements ActionListener {
    private int id;
    private boolean encontrado;
    private boolean destapado;
    private String imagen;
    private String imagenTapada;
    private ImageIcon icono;
    private ImageIcon iconoTapado;    

    
    public Cartas(int id) {        
        this.id = id;
        this.destapado=false;
        this.encontrado=false;
        this.setBackground(Color.darkGray);          
        addActionListener(this);
    }

}