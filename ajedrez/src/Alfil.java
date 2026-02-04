public class Alfil extends Pieza {

    public Alfil(int color) {
        super(color);
        if (color==0)
            nombre="♝";
        else
            nombre = "♗";
    }


    @Override
    public boolean validoMovimiento(Movimiento mov) {
        return mov.esDiagonal();
    }
}