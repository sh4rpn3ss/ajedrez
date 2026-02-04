public abstract class Pieza {
    private int color;//0 negra 1 blanca
    public String nombre;


    public Pieza(int color) {
        this.color = color;
        nombre = getClass().getSimpleName();
    }

    public int getColor() {

        return color;
    }
    public String pintarPieza() {
        return nombre;
    }


    public abstract boolean validoMovimiento(Movimiento mov);


    public String toString() {
        return nombre + "( "+(color==1? "blancas" : "negras") + ")";
    }
}


