import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();
        int option =0;
        int elemento;
        do {
            try {
                option=Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. agregar elemento \n" +
                                "2. Mostrar datos \n" +
                                "3. Insertar al final \n"+
                                "4. Salir", "Menu de Obciones", 3));
                switch (option){

                    case 1:
                        try {
                            elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Ingresa el elemento: ", 3 ));
                            lista.AddStart(elemento);
                        }catch (NumberFormatException n){
                            JOptionPane.showMessageDialog(null, "Error"
                            + n.getMessage());
                        }
                        break;


                    case 2:
                        lista.viewArray();
                        break;


                    case 3:
                        try {
                            elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Ingresa el elemento al final: ", 3 ));
                            lista.AddEnd(elemento);
                        }catch (NumberFormatException n){
                            JOptionPane.showMessageDialog(null, "Error"
                                    + n.getMessage());
                        }
                        break;


                    case 4:
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Incorrecto"
                                );
                }

            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Error"
                        + e.getMessage());
            }

        }while (option!=4);



    }
}