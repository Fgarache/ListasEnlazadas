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
                                "2. eliminar ultimo elemento\n" +
                                "3. Insertar al final \n"+
                                "4. eliminar primer elemento \n"+
                                "5. eliminar elemento \n"+
                                "6. Buscar\n"+
                                "7. salir", "Menu de Obciones", 3));
                switch (option){

                    case 1:
                        try {
                            elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Ingresa el elemento: ", 3 ));
                            lista.AddStart(elemento);
                            lista.viewArray();

                        }catch (NumberFormatException n){
                            JOptionPane.showMessageDialog(null, "Error"
                            + n.getMessage());
                        }
                        break;


                    case 2:
                        elemento = lista.RemoveEnd();
                        lista.viewArray();
                        JOptionPane.showMessageDialog(null, "se Elimino: "+elemento,
                                "Eliminar", JOptionPane.INFORMATION_MESSAGE);
                        break;


                    case 3:
                        try {
                            elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Ingresa el elemento al final: ", 3 ));
                            lista.AddEnd(elemento);
                            lista.viewArray();

                        }catch (NumberFormatException n){
                            JOptionPane.showMessageDialog(null, "Error"
                                    + n.getMessage());
                        }
                        break;

                    case 4:
                        elemento = lista.deleteFroStart();
                        JOptionPane.showMessageDialog(null, "se Elimino: "+elemento,
                                "Eliminar", JOptionPane.INFORMATION_MESSAGE);

                        lista.viewArray();

                        break;

                    case 5:
                        elemento=Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingrese elemento a eliminar", "Eliminando nodos",
                                JOptionPane.INFORMATION_MESSAGE));
                        lista.RemoveItems(elemento);
                        lista.viewArray();

                        JOptionPane.showMessageDialog(null, "se Elimino: "+elemento,
                                "Eliminar", JOptionPane.INFORMATION_MESSAGE);
                        break;

                    case 6:
                        elemento=Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingrese elemento a buscar", "buscando nodos",
                                JOptionPane.INFORMATION_MESSAGE));
                        if (lista.searchFor(elemento) == true) {
                            JOptionPane.showMessageDialog(null, "si esta el: "+elemento,
                                    "Buscar", JOptionPane.INFORMATION_MESSAGE);
                            lista.searchFor(elemento);
                        }else{
                            JOptionPane.showMessageDialog(null, "No encontrado",
                                    "Buscar", JOptionPane.INFORMATION_MESSAGE);
                        }


                        break;
                    case 7:
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Incorrecto"
                                );
                }

            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Error"
                        + e.getMessage());
            }

        }while (option!=7);



    }
}