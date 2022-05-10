public class Nodo {
    public int dato;
    public Nodo next;

    public Nodo(int d) {
        this.dato=d;
        this.next=null;
    }

    public Nodo (int d, Nodo n) {
        dato=d;
        next=n;
    }
}
