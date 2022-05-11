import javax.swing.*;

public class Lista {

    protected Nodo inicio, fin;
    public Lista(){
        inicio=null;
        fin=null;
    }
    //empty list?
    public boolean empty (){
        if (inicio == null) {
            return true;

        }else {
            return false;
        }
    }

    //Add element at the end
    public  void  AddEnd (int element){
        if (!empty()) {
            fin.next = new Nodo(element);
            fin = fin.next;
        }else {
            inicio= fin=new Nodo(element);
        }

    }


    //Add element to list
    public void AddStart (int elemento){
        inicio=new Nodo(elemento, inicio);
        if (fin == null) {
            fin=inicio;
        }
    }

    //print list element
    public void viewArray(){
        Nodo recorrer = inicio;
        while (recorrer!=null){
            System.out.print(" ["+recorrer.dato+"]-> ");
            recorrer=recorrer.next;
        }
        System.out.println("\n===========================");
    }


    //remove element to list
    public int deleteFroStart (){
        int element = inicio.dato;
        if (inicio == fin) {
            inicio = fin=null;
        }else {
            inicio=inicio.next;
        }
        return element;

    }
    //remove item from list at end
    public int RemoveEnd (){
        int element = fin.dato;
        if (inicio == fin) {
            inicio = fin=null;
        }else {
            Nodo temporal = inicio;
            while (temporal.next!=fin){
                temporal=temporal.next;
            }
            fin=temporal;
            fin.next=null;
        }
        return element;
    }
    //remove element specific
    public void RemoveItems(int element){
        if (!empty()) {
            if (inicio == fin && element== inicio.dato) {
                inicio=fin=null;
            }else if (element== inicio.dato) {
                inicio=inicio.next;
            }else {
                Nodo previous, temporary;
                previous = inicio;
                temporary = inicio.next;
                while (temporary!=null && temporary.dato!=element){
                    previous = previous.next;
                    temporary = temporary.next;
                }
                if (temporary!=null) {
                    previous.next=temporary.next;
                    if (temporary == fin) {
                        fin=previous;
                    }
                }
            }
        }else {
            JOptionPane.showMessageDialog(null, "no se elimino",
                    "Eliminar", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }
    //search element
    public boolean searchFor (int elemento){
        Nodo temporary = inicio;
        while (temporary!=null && temporary.dato!=elemento){
            temporary=temporary.next;
        }
        return temporary!=null;

    }
}
