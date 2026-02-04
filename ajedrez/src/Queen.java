public class Queen extends Pieza {

    public Queen(int color) {
        super(color);
        if (color==0)
            nombre="♛";
        else
            nombre = "♕";

    }


    @Override
    public boolean validoMovimiento(Movimiento mov) {
        return mov.esDiagonal()||mov.esHorizontal()||mov.esVertical();
    }
}
