
  public class Callabo extends Pieza {

    public Callabo (int color) {
        super(color);
        if (color==0)
            nombre="♞";
        else
            nombre = "♘";


    }


    @Override
    public boolean validoMovimiento(Movimiento mov) {
            int v = mov.saltoVertical();
            int h = mov.saltoHorizontal();
        //    return Math.abs(v)==2 && Math.abs(h)==1 || Math.abs(v)==1 && Math.abs(h)==2;
        return v == 1 && h == 2 || v== 2 && h== 1|| v==-1&& h==-2|| v==-2&&h==-1 || v==1&& h ==-2 || v==-2&&h==1||v==-1&&h==2||v == 2 && h == -1;}
}



