public class Nodo {
    public int dato;
    public Nodo next;

    public Nodo(int d) {
        this.dato=d;
    }

    public Nodo (int d, Nodo n) {
        dato=d;
        next=n;
    }
}
