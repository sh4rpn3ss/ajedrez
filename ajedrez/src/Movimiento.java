
public class Movimiento {
    private Posicion posicioninicial;
    private Posicion posicionfinal;

    public Movimiento(Posicion posicioninicial, Posicion posicionfinal) {
        this.posicioninicial = posicioninicial;
        this.posicionfinal = posicionfinal;
    }

    public Movimiento() {

    }

    public Posicion getPosicioninicial() {
        return posicioninicial;
    }

    public void setPosicioninicial(Posicion posicioninicial) {
        this.posicioninicial = posicioninicial;
    }

    public Posicion getPosicionfinal() {
        return posicionfinal;
    }

    public void setPosicionfinal(Posicion posicionfinal) {
        this.posicionfinal = posicionfinal;
    }

    public boolean esVertical() {
        boolean respuesta = false;
        if (posicioninicial.getColumna() == posicionfinal.getColumna())
            respuesta = true;
        return respuesta;
    }

    public boolean esHorizontal() {
        boolean respuesta = false;
        if (posicioninicial.getFila() == posicionfinal.getFila())
            respuesta = true;
        return respuesta;
    }

    public int saltoVertical() {
        return posicioninicial.getFila() - posicionfinal.getFila();
    }

    public int saltoHorizontal() {
        return posicioninicial.getColumna() - posicionfinal.getColumna();
    }

    public boolean esDiagonal() {
        boolean respuesta = false;
        if (saltoHorizontal() == saltoVertical())
            respuesta = true;
        return respuesta;
    }
    }


