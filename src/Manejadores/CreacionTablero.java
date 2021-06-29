/*
 * Se hará la creación del tablero y para ello se utilizarán JToggleButton
 * porque se van a mover las fichas y para se necesita una función en 
 * los botones
 */
package Manejadores;

import javax.swing.JToggleButton;
import ventana.VentanaPrincipal;

/**
 *
 * @author annelis
 */
public class CreacionTablero {
    
    private int filas = 6;
    private int columnas = 8;
    private int largoBoton = 140;
    private int anchoBoton = 60;
    private int x = 20;
    private int y = 20;
    
    
    public JToggleButton [] [] creacionTablero = new JToggleButton [filas] [columnas];
    private Object jPanelFondoTablero;
    
    //Creamos nuestro método para poder hacer el tablero
    
    public void iniciarTablero() {
        
        creacionTablero = new JToggleButton [filas] [columnas];
        
        //Utilizaremos los ciclos for para la construcción
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < 10; j++) {
                creacionTablero  [i] [j] = new JToggleButton(); 
                creacionTablero  [i] [j] .setBounds(x, y, largoBoton, anchoBoton);
       //         jPanelFondoTablero.add(creacionTablero [i] [j]);
            }
        }
    }
    
}
