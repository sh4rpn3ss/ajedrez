public class Rey extends Pieza {
Movimiento mov = new Movimiento();
        public Rey(int color) {
            super(color);   if (color==0)
                nombre="♚";
            else
                nombre = "♔";

        }

    @Override
        public boolean validoMovimiento(Movimiento mov) {
        int v = mov.saltoVertical();
        int h = mov.saltoHorizontal();

        return v <= 1 && h <= 1 && (v + h) != 0;
       }
    }

