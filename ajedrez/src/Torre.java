
    public class Torre extends Pieza {

        public Torre(int color) {
            super(color);
            if (color==0)
                nombre="♜";
            else
                nombre = "♖";


        }


        @Override
        public boolean validoMovimiento(Movimiento mov) {
            return mov.esVertical() || mov.esHorizontal();
        }
    }

